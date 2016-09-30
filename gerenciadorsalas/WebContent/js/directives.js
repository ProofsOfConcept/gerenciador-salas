angular.module('gerenciadorsalas')
.directive('header', function () {
    return {
        restrict: 'A',
        replace: true,
        templateUrl: 'views/directives/header.html',
        controller: ['$scope', '$rootScope', function ($scope, $rootScope) {
            
        }]
    };
})