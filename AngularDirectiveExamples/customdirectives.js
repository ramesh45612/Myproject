 app.controller("customController", [ "$scope",
       function($scope, $state) {
                $scope.customer = {'firstName': 'Sankoji','lastName': 'Ram'};
               $scope.firstName ="sannnnnnnnnnnnnnnnnnnnnn";
               
               $scope.empData= {'firstName': 'EmpFirst Name','lastName': 'Ram'};
               
               $scope.changeData = function () {
            	     alert("From Controller.....");
            	};

     	} //end of gridcontoller                                                             
   ])
   
   //end of controller


app.directive("simpleDir", function(){
     return {
        template : "<strong>simple directive</strong>"
    };
   });

app.directive("sharedScope",function(){
	return {
		template:'First Name {{customer.firstName}} <br> Last Name {{customer.lastName}}' 
	}
	
});
app.directive("isolatedScope",function(){
	return {
		scope:{
			/*Now that the scope is isolated, 
			 * the customer object from the parent scope will no 
			 * longer be accessible. When the directive is used in a view it’ll 
			 * result in the following output (notice that the customer first name and last name aren’t rendered):*/
		},
		template:'First Name {{customer.firstName}} <br> Last Name {{customer.lastName}}' 
	}
});

//how to pass data into isolate directive 
//You use @, =, and &
//The @ local scope property is used to access string values that are defined outside the directive
//@ can access string value
app.directive("isolatedScope1",function(){
	return {
		scope:{
			first:'@'
		},
		template:'First Name {{first}} <br>' 
	}
});


app.directive("isolatedScope2",function(){
	return {
		scope:{
			customer :"="
		},
		template:'First Name {{customer.firstName}} <br> Last Name {{customer.lastName}}' 
	}
});


app.directive("isolatedScope3",function(){
	return {
		scope:{
			customer :"=",
            action: '&'

		},
		template:'First Name {{customer.firstName}} <br> Last Name {{customer.lastName}}' +
        '<button ng-click="action()">Change Data</button>'

	}
});

/*@  Used to pass a string value into the directive
=    Used to create a two-way binding to an object that is passed into the directive
&    Allows an external function to be passed into the directive and invoked*/
app.directive("empDir",function(){
	return {
		scope:{
			customer :"=data",
            action: '&'
		},
		template:'First Name {{customer.firstName}} <br> Last Name {{customer.lastName}}' +
        '<button ng-click="action()">Change Data</button>'

	}
});

/*practice space*/


app.directive("firstDir", function(){
    return {
       template : "Shared Scope - controller scope object only display<strong>{{fromController}} </strong>, <strike> and like vm.won't work here </strike>"
   };
  });


app.directive("secDir", function(){
    return {
    	scope:{},
       template : "Isolaged scope- controller scope object won't dispaly<strong>{{fromController}} </strong>"
   };
  });


app.directive("thirdDir", function(){
    return {
    	scope:{ 
    		data :"="
    	},
       template : "Isolaged scope- communication b/w parent and child{{data}}"
   };
  });
