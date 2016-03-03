(function(angular) {
  var AppController = function($scope, Company) {
    Company.query(function(response) {
      $scope.companies = response ? response : [];
    });
    
    $scope.showDetail = function (company) {
        if ($scope.active != company.name) {
          $scope.active = company.name;
        }
        else {
          $scope.active = null;
        }
      };
          
    $scope.addCompany = function() {
      new Company({
        name: $scope.name,
        address: $scope.address,
        city: $scope.city,
        country: $scope.country,
        email: $scope.email,
        phoneNumber: $scope.phoneNumber,
        owners: $scope.owners
        
      }).$save(function(company) {
        $scope.companies.push(company);
      });
      $scope.newCompany = "";
    };
    
    $scope.updateCompany = function(company) {
      company.$update();
    };
    
    $scope.deleteCompany = function(company) {
      company.$remove(function() {
        $scope.companies.splice($scope.companies.indexOf(company), 1);
      });
    };
  };
  
  AppController.$inject = ['$scope', 'Company'];
  angular.module("myApp.controllers").controller("AppController", AppController);
}(angular));