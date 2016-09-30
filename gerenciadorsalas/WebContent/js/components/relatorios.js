angular.module('gerenciadorsalas')
	.controller('RelatoriosController', [ '$scope', '$rootScope', '$state', 'uiCalendarConfig', 'salasService', '$uibModal',
	                                      'DTOptionsBuilder',
function($scope, $rootScope, $state, uiCalendarConfig, salasService, $uibModal, DTOptionsBuilder) {
	
	$scope.salas = [];
	$scope.salaTemp = {};
	$scope.reservas = [];
	$scope.dtOptions = DTOptionsBuilder.newOptions().withLanguage({
		"emptyTable" : "Nenhum registro encontrado",
		"info" : "Mostrando de _START_ até _END_ de _TOTAL_ registros",
		"infoEmpty" : "Mostrando 0 até 0 de 0 registros",
		"infoFiltered" : "(Filtrados de _MAX_ registros)",
		"infoPostFix" : "",
		"infoThousands" : ".",
		"lengthMenu" : "_MENU_ resultados por página",
		"loadingRecords" : "Carregando...",
		"processing" : "Processando...",
		"zeroRecords" : "Nenhum registro encontrado",
		"search" : "Pesquisar",
		"paginate" : {
			"next" : "Próximo",
			"previous" : "Anterior",
			"first" : "Primeiro",
			"last" : "Último"
		},
		"aria" : {
			"sortAscending" : ": Ordenar colunas de forma ascendente",
			"sortDescending" : ": Ordenar colunas de forma descendente"
		}
	});
	$scope.relatoriosInit = function () {
		$scope.showLoading = true;
		
		salasService.getReservasByOrgInst("1","1").then(function (reservas) {
			
			angular.forEach(reservas, function (reserva, reservaId) {
				reserva.tempo = (moment(reserva.fimTime).diff(moment(reserva.inicioTime), 'minutes')) / 60;
				reserva.quantidadeParticipantes = reserva.listaParticipantes.length;
			});
			
			$scope.reservas = reservas;
			$scope.showLoading = false;
		});
	};
	
	$scope.changeView = function (tipo) {
		$state.go('agenda', {"tipo" : tipo});
	}
	
} ]);
