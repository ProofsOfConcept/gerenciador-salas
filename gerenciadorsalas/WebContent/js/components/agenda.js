angular.module('gerenciadorsalas')
	.controller('MensalController', [ '$scope', '$rootScope', '$state', '$stateParams', 'uiCalendarConfig', 
	'salasService', '$uibModal', '$interval',
function($scope, $rootScope, $state, $stateParams, uiCalendarConfig, salasService, $uibModal, $interval) {
	$scope.calendarTitle = "";
	$scope.events = [];
	$scope.eventSources = [$scope.events];
	$scope.user = {
		"defaultView": "month"
	};
	if($stateParams.tipo) {
		//ver se veio de outra tela com o tipo do grafico.
		$scope.user.defaultView = $stateParams.tipo;
	}
	$scope.minhasSalas = [];
	$scope.salas = [];
	$scope.salaTemp = {};
	
	$interval(function () {
		$scope.agendaInit();
	}, 30000);
	
	$scope.novaReserva = function () {
		$uibModal.open({
            templateUrl: 'views/modal/nova-reserva.html',
            controller: function ($scope) {
            	$scope.initModalNovaReserva = function () {
            		
            	};
            	$scope.ok = function () {
            		$scope.$dismiss();
            	};
            	$scope.cancel = function () {
            		$scope.$dismiss();
            	};
            }
        }).result.then(function () {
        }, function () {
        });
	};
	
	$scope.agendaInit = function () {
		//criar logica de init sincrono.
		//aguarda o final do entao para seguir adiante no proximo.
		$scope.showLoading = true;
		$scope.events = [];
		salasService.getReservasByOrgInst("1","1").then(function (reservas) {
			angular.forEach(reservas, function (reserva, idReserva) {
				var evento = {
					id: reserva.reservaId,
                    title: reserva.titulo,
                    start: moment(reserva.inicioTime),
                    end: moment(reserva.fimTime),
                    editable: true,
                    color: reserva.sala.cor,
                    sala: reserva.sala
				};
				$scope.events.push(evento);
			});
			salasService.getMinhasSalas("1").then(function (salas) {
				$scope.minhasSalas = salas;
				salasService.getSalasParticipando().then(function (salas) {
					$scope.salas = salas;
					$scope.showLoading = false;
				}, function () {
					//na falha
					console.log('falha salas');
					$scope.showLoading = false;
				});
			}, function () {
				//na falha
				console.log('falha minhas salas');
				$scope.showLoading = false;
			});
		}, function () {
			//na falha
			console.log('falha reservas');
			$scope.showLoading = false;
		});
	};
	
	$scope.mensalInit = function () {
		$scope.showLoading = true;
		$scope.agendaInit();
		$scope.uiConfig = {
            calendar: {
                lang: 'pt-br',
                height: 'auto',
                editable: true,
                nowIndicator: true,
                header: {
                    left: '',
                    center: 'prev title next today',
                    right: ''
                },
                navLinks: true,
                eventLimit: true,
                defaultView : $scope.user.defaultView,
                views: {
                    month: {
                        titleFormat: 'MMMM YYYY'
                    },
                    agendaWeek: {
                        titleFormat: 'D MMM'
                    },
                    agendaDay: {
                        titleFormat: 'ddd, D MMM YYYY'
                    }
                },
                eventClick: $scope.eventoClicado,
                dayClick: $scope.diaClicado,
                viewRender: function (view, element) {
                    $scope.calendarTitle = view.title;
                },
                eventRender: function eventRender( event, element, view ) {
                	if($scope.salaTemp.hasOwnProperty('visivel')) {
                		if(event.sala.salaId === $scope.salaTemp.salaId) {
                			return $scope.salaTemp.visivel;
                		}
                	} else {
                		return true;
                	}
                },
                events : $scope.events
            }
        };
	};
	
	$scope.setVisible = function (sala, indice) {
		sala.visivel = !sala.visivel;
		$scope.salaTemp = sala;
		uiCalendarConfig.calendars.myCalendar1.fullCalendar('rerenderEvents');
	};
	
	$scope.changeView = function (view) {
		uiCalendarConfig.calendars.myCalendar1.fullCalendar('changeView', view);
	}
	
	$scope.eventoClicado = function (date, jsEvent, view) {
		console.log(view);
	};
	
	$scope.diaClicado = function(date, jsEvent, view) {
		$scope.novaReserva();
	};
	
	function carregaMinhasSalas () {
		salasService.getMinhasSalas("1").then(function (salas) {
			$scope.minhasSalas = salas;			
		});
	}
	
	function carregaSalas () {
		salasService.getSalasParticipando("1").then(function (salas) {
			$scope.salas = salas;
		});
	}
	
	function getEvents() {
		$scope.events = [];
		salasService.getReservasByOrgInst("1","1").then(function (reservas) {
			angular.forEach(reservas, function (reserva, idReserva) {
				var evento = {
					id: reserva.reservaId,
                    title: reserva.titulo,
                    start: moment(reserva.inicioTime),
                    end: moment(reserva.fimTime),
                    editable: true,
                    color: reserva.sala.cor,
                    sala: reserva.sala
				};
				$scope.events.push(evento);
			});
		});
	}
	
} ]);
