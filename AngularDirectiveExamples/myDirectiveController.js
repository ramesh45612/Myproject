var app = angular.module('app', []);

app.controller("myDirectiveController", [ "$scope", function( $scope) {
           var vm = this;
          /* myDirectiveService.getDetails()
               .then(function(response) {
                   vm.details = response;
               })
               .catch(function(errorResponse) {
               });*/
           $scope.fromController="From Contoller - parent";
           
           $scope.a="10";
           $scope.b="20";
           
           /*for =*/
           $scope.emp ={
        	 "no":"1",
        	 "name":"Ramesh"
           };
           
           $scope.emp2 ={
              	 "no":"2",
              	 "name":"Ram"
                 };
           
           $scope.sumFromController = function (x,y){
        	   alert(parseInt(x)+parseInt(y));
           }
           //tutorial point
           $scope.Mahesh = {};
           $scope.Mahesh.name = "Mahesh Tiwari";
           $scope.Mahesh.rollno  = 1;
     	}
   ]);
    
    /*end of controller*/
    
    app.directive("message",function(){
    	return {
    		scope:{
    			x:'@',
    			y:'@'
    		},
    		contoller:function($scope,$element,$attrs){
    			$scope.doProcess = function(){
    				alert(parseInt($scope.x));
    			}
    			
    		},
    		template:'a={{x}} ,  b ={{y}} <button ng-click="doProcess()">Show</button>' 
    	}
    });
    
    app.directive("message1",function(){
    	return {
    		scope:{
    			x:'@m',
    			y:'@n'
    		},
    		template:'a={{x}} ,  b ={{y}}' 
    	}
    });
   
    app.directive("message3",function(){
    	return {
    		scope:{
    			employee:"="
    		},
    		template:'Empno :{{employee.no }}<br> Emp Name:{{employee.name}}' 
    	}
    });
  
    
    app.directive("message4",function(){
    	return {
    		scope:{
    			employee:"=empData"
    		},
    		template:'Empno :{{employee.no }}<br> Emp Name:{{employee.name}}<br> inside directive Text box <input type="text" data-ng-model="employee.name"/>'
    			
    	}
    });

    //way -1
    app.directive("message5",function(){
    	return {
    		scope:{
    				extSum: "&"
    					// defination is provided by controller 
    		},
    		template:'this p and q are isolate <input type="text" data-ng-model="p"/><br><input type="text" data-ng-model="q"/><button ng-click="extSum()(p,q)">Sum</button>'
    			
    	}
    });

    //way 2
 /*   app.directive("message5",function(){
    	return {
    		scope:{
    				extSum: "&"
    					// defination is provided by controller 
    		},
    		controller:function($scope,$element,$attrs){
    			$scope.doProcess = function(){
    				$scope.extSum({m:$scope.p,n:$scope.q});
    			}
    		},
    		template:'p and q are isolate <input type="text" data-ng-model="p"/><br><input type="text" data-ng-model="q"/><button ng-click="doProcess()">Sum</button>'
    			
    	}
    });*/
    
    /*below is for transclude examples*/
    app.directive("message6",function(){
    	return {
    		template:'<div>this is from Template<div>'
    			
    	}
    });
    
    //using ng-transclude
    app.directive("message7",function(){
    	return {
    		transclude:true,
    		template:'<div>this is from Template <div ng-transclude/></div>'
    			
    	}
    });
    
    // from 
    app.directive("namer",function(){
//return an object {}
    	return {
    		scope:{},
    		link:function(scope,e,a){
    			scope.fullName = a.first +' '+a.last
    			
    		},
    		template:'<h1>From Directive {{fullName}}</h1>'
    			
    	}
    });
    
    //from tutorial point
   app.directive('student', function() {
        var directive = {};
        directive.restrict = 'E';
        directive.template = "Student: <b>{{student.name}}</b> , Roll No: <b>{{student.rollno}}</b>";
        
        directive.scope = {
           student : "=details"
        }

        directive.compile = function(element, attributes) {
           element.css("border", "1px solid #cccccc");
           var linkFunction = function($scope, element, attributes) {
              element.html("Student: <b>"+$scope.student.name +"</b> , Roll No: <b>"+$scope.student.rollno+"</b><br/>");
              element.css("background-color", "#ff00ff");
           }
           return linkFunction;
        }
        
        return directive;
     });
