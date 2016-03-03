(function(angular) {
  var CompanyFactory = function($resource) {
    return $resource('/companies/:id', {
      id: '@id'
    }, {
      update: {
        method: "PUT"
      },
      remove: {
        method: "DELETE"
      }
    });
  };
  
  CompanyFactory.$inject = ['$resource'];
  angular.module("myApp.services").factory("Company", CompanyFactory);
}(angular));