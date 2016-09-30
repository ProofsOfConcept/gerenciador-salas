angular.module('gerenciadorsalas').config(function ($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise("/");

    $stateProvider
        .state('login', {
            url: '/',
            templateUrl: 'views/login/login.html',
            controller: 'LoginController',
        })
        .state('agenda', {
            url: '/agenda/:tipo',
            templateUrl: 'views/agenda/mensal.html',
            controller: 'MensalController',
        })
        .state('salas', {
            url: '/salas',
            templateUrl: 'views/sala/salas.html',
            controller: 'SalasController',
        })
        .state('relatorios', {
            url: '/relatorios',
            templateUrl: 'views/relatorios/relatorios.html',
            controller: 'RelatoriosController',
        });
});