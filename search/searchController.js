app.controller("searchController", ["SearchService", "$scope","uiGridExporterService", "uiGridExporterConstants",
	   function(searchService, $scope, uiGridExporterService, uiGridExporterConstants) {
           var vm = this;
           
         /*  vm.searchCriteria = function(){
        	   return {
        		   "accountNumber":'{"operator":"equals","criteria":""}',
        		   "firstName":'{"operator":"equals","criteria":""}',
        		   	"lastNameName":'{"operator":"equals","criteria":""}'
        	   }*/
               
           vm.searchCriteria = {
        		   "accountNumber":{"operator":"equals","criteria":""},
        		   "firstName":{"operator":"equals","criteria":""},
        		   	"lastName":{"operator":"equals","criteria":""}
     	}    
           
          vm.fnSubmit = function(searchForm){
        	   //searchform took for validation
        	   searchService.submitSearch( vm.searchCriteria)
        	   .then(function(response) {
                   $scope.details = response;
                })
                .catch(function(errorResponse) {
                    console.log(errorResponse);
                });
           }
           //grid 
           vm.exportCsv = function() {
        	   
               var grid = $scope.gridApi.grid;
               $scope.gridApi.grid.options.data={accountNumber:"123",firstName:"cusot",lastName:"cuuu"};
               $scope.gridApi.grid.rows=[{accountNumber:"qq",firstName:"cusqqot",lastName:"cuuu"},{accountNumber:"12qq3",firstName:"cusot",lastName:"cuuu"}];
               var rowTypes = uiGridExporterConstants.ALL;
               var colTypes = uiGridExporterConstants.ALL;
               uiGridExporterService.csvExport(grid, rowTypes, colTypes);
           };

           
           $scope.gridOptions = { data : 'details',
        		   enableGridMenu: true,
        		   exporterCsvFilename: 'myFile.csv',
        		   multiselect:true,
        		   exporterMenuCsv: true,
        		    exporterMenuPdf: false, //to remove pdf
        		   enablePaginationControls: false,
        		   paginationPageSizes: [5, 10, 15],
        		      paginationPageSize: 5,
        		      'exporterCsvFilename' : 'clarification-status.csv',
        	            exporterCsvLinkElement: angular.element(document.querySelectorAll(".custom-csv-link-location")),
        	            onRegisterApi: function(gridApi){
        	            	$scope.gridApi = gridApi;

        	            },
        	            
        	            gridMenuCustomItems: [{
        	                title: 'CSV Export (Filtered & Paged Grid)',
        	                action: function() {
        	              //    $scope.export('csv');
        	                  vm.exportCsv();
        	                }
        	              }],
        		      
        	              /*exporterAllDataFn : function () {
        	            	  alert("wokinnnn");
        	            	   return $http.get('/data/100.json')
        	            	 },
        	              */
        		   //   enableColumnMenus: false
        		      
        		      /*onRegisterApi: function (gridApi) {
                       $scope.gridApi = gridApi;
                   },*/
           };
           
   }
   ])
   