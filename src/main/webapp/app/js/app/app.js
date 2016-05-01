var ops = angular.module('ops', ['ngRoute','ngResource']);

// routes
ops.config(function ($routeProvider) {
    $routeProvider
        .when('/1', {
            templateUrl: 'index.jsp',
            controller: 'mainController'
        })
        .when('/fieldInfo', {
            templateUrl: '/app/pages/fieldInfo.html',
            controller: 'fieldInfoController'
        });

});


//controller

ops.controller('fieldInfoController', function ($scope,$http) {
    $scope.fieldCode='';
$scope.getFieldCode=function () {
    $http.get("http://localhost:8080/rest/fieldProfile/" + $scope.fieldCodefromInput).success(function (data) {
        console.log(data)
        $scope.fieldCode=data;
    });
}




});


ops.controller('mainController', function ($scope) {
    $scope.fieldCode="F.LV.02.03.07";
});


