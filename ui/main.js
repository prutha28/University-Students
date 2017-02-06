
var needle = require("needle");
var $ = require("jquery");
var request = require("request");


var client = {

	getStudent : function( onResponse){

		var headers = {
			'Content-Type' : 'text/html',
			'Accept' : 'text/html'
		};
		// Using needle 
		// needle.get("http://localhost:8080/studentportal/webapi/students", {headers:headers}, onResponse)
		// using jquery
		// using request
		// request("http://localhost:8080/studentportal/webapi/students", onResponse);

	},

	addStudent : function( onResponse){
		
		var headers = {
			'Content-Type' : 'application/json',
			'Accept' : 'text/html'
		};
		
		var data = {
			'name' : 'prutha'
		};

		// Using needle 
		needle.post("http://localhost:8080/studentportal/webapi/students", data, {headers:headers}, onResponse)
	},

	
	updateStudent : function( onResponse){

		var headers = {
			'Content-Type' : 'application/json',
			'Accept' : 'text/html'
		};

		var data = {
			'name' : 'prutha'
		};
		
		// Using needle 
		// needle.put("http://localhost:8080/studentportal/webapi/students", data, {headers:headers}, onResponse)
	},

	
	deleteStudent : function( onResponse){
		
		var headers = {
			'Content-Type' : 'application/json',
			'Accept' : 'text/html'
		};
		
		var data = {
			'name' : 'prutha'
		};
		
		// Using needle 
		// needle.delete("http://localhost:8080/studentportal/webapi/students", data, {headers:headers}, onResponse)
	}

};


client.getStudent(function(error, response){    
	// var data = response.body;
    // console.log( JSON.stringify(response.body) );
    // console.log(response._headers);
    
    if (!error && response.statusCode == 200) {
    	console.log(response);
  	}
}); // Get Student



client.addStudent(function(error, response){    

    if (!error && response.statusCode == 200) {
    	console.log(response);
  	}
}); // Add Student



client.updateStudent(function(error, response){    

    if (!error && response.statusCode == 200) {
    	console.log(response);
  	}
}); // Update Student



client.deleteStudent(function(error, response){    
    
    if (!error && response.statusCode == 200) {
    	console.log(response);
  	}
}); // Delete Student