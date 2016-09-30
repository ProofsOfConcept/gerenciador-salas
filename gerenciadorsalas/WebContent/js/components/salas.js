angular.module('gerenciadorsalas')
	.controller('SalasController', [ '$scope', '$rootScope', '$state', 'uiCalendarConfig', 'salasService', '$uibModal',
function($scope, $rootScope, $state, uiCalendarConfig, salasService, $uibModal) {
	$scope.events = [];
	$scope.eventSources = [$scope.events];
	$scope.salas = [];
	$scope.salaTemp = {};
	
	$scope.salasInit = function () {
		$scope.showLoading = true;
		carregaSalas();
		getEvents();
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
	                defaultView : 'agendaWeek',
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
		
		$scope.showLoading = false;
	};
	
	$scope.changeView = function (tipo) {
		$state.go('agenda', {"tipo" : tipo});
	}
	
	function carregaSalas () {
		salasService.getSalas().then(function (salas) {
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
