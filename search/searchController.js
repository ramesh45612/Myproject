app.controller("searchController", ["SearchService", "$scope","uiGridExporterService", "uiGridExporterConstants", "$window",
	   function(searchService, $scope, uiGridExporterService, uiGridExporterConstants, $window) {
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
           
           vm.exportExcel = function(){
        	   $window.open("http://localhost:8075/springRest/download?seachCriteria="+JSON.stringify(vm.searchCriteria));
           }
           //grid 
           vm.exportCsv = function() {
        	   $scope.details= [];
        	   $scope.details.push({accountNumber:"123",firstName:"cusot",lastName:"cuuuwhat an idea"},
        			   {accountNumber:"123",firstName:"cusot",lastName:"cuuuwhat an idea"},
        			   {accountNumber:"123",firstName:"cusot",lastName:"cuuuwhat an idea"},
        			   {accountNumber:"123",firstName:"cusot",lastName:"cuuuwhat an idea"},
        			   {accountNumber:"123",firstName:"cusot",lastName:"cuuuwhat an idea"},
        			   {accountNumber:"123",firstName:"cusot",lastName:"cuuuwhat an idea"},
        			   {accountNumber:"123",firstName:"cusot",lastName:"cuuuwhat an idea"});
        	   var grid = $scope.gridApi.grid;
             //  $scope.gridApi.grid.options.data={accountNumber:"123",firstName:"cusot",lastName:"cuuu"};
               //$scope.gridApi.grid.rows=[{accountNumber:"qq",firstName:"cusqqot",lastName:"cuuu"},{accountNumber:"12qq3",firstName:"cusot",lastName:"cuuu"}];
              
               var rowTypes = uiGridExporterConstants.ALL;
               var colTypes = uiGridExporterConstants.ALL;
               uiGridExporterService.csvExport(grid, rowTypes, colTypes);
           };

           
           $scope.gridOptions = { data : 'details',
        		   enableGridMenu: true,
        		   multiselect:true,
        		   //column
        		   enableColumnMenus: false,

        		   //pagination
        		  //  enablePaginationControls: true,
        		    paginationPageSizes: [5, 10, 15],
        		    paginationPageSize: 5,

        		    //exporter
        		    exporterMenuCsv: true,
        		    exporterMenuPdf: false, //to remove pdf
        		    exporterCsvFilename: 'myFile.csv',
        		    
        		    //custom export
        		    onRegisterApi: function(gridApi){
        	            	$scope.gridApi = gridApi;
        	            },
        	            
        	            gridMenuCustomItems: [{
        	                title: 'Export to Excel',
        	                action: function() {
        	              //    $scope.export('csv');
        	                  //vm.exportCsv();
        	                	 // window.open("localhost:8075/springRest/download");
        	                	 vm.exportExcel();
        	              
        	                }
        	              }],
        	              
        	              exporterAllDataFn : function () {
        	            	  alert("wokkkkkk");
        	              }
        		      
        	              /*exporterAllDataFn : function () {
        	            	  alert("wokinnnn");
        	            	   return $http.get('/data/100.json')
        	            	 },
        	              */
        		      
           };
           
           vm.addRow = function() {
        	    $scope.details.push({accountNumber:"123",firstName:"cusot",lastName:"cuuu"});
        	  };
   }
   ])
   