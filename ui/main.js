
var needle = require("needle");
var $ = require("jquery");
var request = require("request");


var headers = {
	'Content-Type' : 'text/html',
	'Accept' : 'text/html'
};


var client = {

	getStudent : function( onResponse){
		// Using needle 
		needle.get("http://localhost:8080/studentportal/webapi/students", {headers:headers}, onResponse)
		// using jquery
		// using request
	}

};


client.getStudent(function(error, response){    
	// var data = response.body;
    // console.log( JSON.stringify(response.body) );
    console.log(response._headers);
    // console.log(response);

});