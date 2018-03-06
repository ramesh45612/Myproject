   app.service("SearchService", ["$q", "$http", function ($q, $http) {
        this.submitSearch = function (searchCriteria) {
            //var url = 'http://localhost:8075/springRest/search/searchWorkItem';
            //var response = $http.post(url, searchCriteria);
        	 var dfd = $q.defer();
            $http({
                method :'POST',
                url:'http://localhost:8075/springRest/search/searchWorkItem',
                data: searchCriteria,
            }) .then(function (response) {
                dfd.resolve(response.data);
            })
            .catch(function (errorResponse) {
                dfd.reject(errorResponse);
            });
         return dfd.promise;
           }
    }]);
   
   
   

  
