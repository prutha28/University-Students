


# REST Endpoints


Resource Name 	| 			Endpoint 				      			|  	Action description in words 		 							       	    | 		Participant
----------------|---------------------------------------------------|-------------------------------------------------------------------------------|----------------------------
<b>Students</b>	|	```GET /students``` 				  			|   Get all the students present in the system along with their details. 		|
				|	```GET /students/{id}```			  			|	Get the details of a particular students 									|
				|	```POST /students ```							|	Add a new student to the system 											|
				|	```PUT /students/{id}``` 						|	Update the details of a student/Edit own Profile							|
				|													|																				|
				|	```DELETE /students/{id}``` 					|	Remove a student from the system											|
<b>Faculty</b>	|	```GET /faculties	```							|	Get all faculties present in the system along with their details.			|
				|	```GET /faculties/{id}```						|	Get the details of a specific faculty.										|
				|	```POST /faculties```							|	Add a new faculty into the system.											|
				|	```PUT /faculties/{id}```						|	Update the details of a student/Edit own Profile							|
				|	```DELETE /faculties/{id}```					|	Remove a faculty from the system.											|
				|													|																				|
<b>Courses</b>	|	```GET /courses 		```						|	Get all the courses present in the system along with their details.			|
				|	```POST /courses 			```					|	Create/Add a new course to the system										|
				|	```GET /courses/{id}			```				|	Get the details of a specific courses 										|
				|	```PUT /courses/{id}		```					|	Update/Edit details for a particular courses 								|
				|	```DELETE /courses/{id}	```						|	Remove a specific course from the system 									|
				|													|																				|
				|	```GET /courses/{id}/students 	```				|	Get a list of all students enrolled in a course 							|
				|	```GET /students/{id}/courses		```			|	Get a list of all courses for a student 									|
				|	```POST /students/{id}/courses	```				|	Enroll a student for a new course 											|
				|	```DELETE /students/{id}/courses/{id}```		|	Unenroll the student for a course/ Drop the course 							|
				|													|																				|
				|													|																				|
<b>Faculties</b>|	```GET /faculties/{id}/courses	```				|	Get a list of all courses for a Faculty 									|
				|	```GET /courses/{id}/faculties 	```				|	Get a list of facilties teaching a particular course 						|
				|	```POST /faculties/{id}/courses```				|	Add a course for the faculty to teach 										|
				|	```DELETE /faculties/{id}/courses/{id}```		|	Remove a specific course taught by the faculty   							|
				|													|																				|
<b>Schedule</b>	|	```GET /students/{id}/schedule 		```			|	Get the schedule for student 												|
				|	```GET /faculties/{id}/schedule 	```			|	Get the schedule for faculty 												|
				|													|																				|
<b>GradeBook</b>|	```GET /students/{id}/grades	```				|	Get all the grades obtained by the student for all courses in all semesters |
				|	```GET /students/{id}/grades?course=id ```		|	Get the grades that the student obtained in a specific course 				|
				|	```GET /students/{id}/grades?semester=fall```	|	Get all the grades that the student obtained in a specific semester 		|
				|													|																				|
<b>Addresses</b>|	```GET /students/{id}/addresses ```				|	Get a list of all addresses for the student 								|
				|	```POST /students/{id}/addresses``` 			|	Add a new address to a list of addresses for the student 					|
				|	```GET /students/{id}/addresses/{id}``` 		|	Get a specific address for the student 										|
				|	```PUT /students/{id}/addresses/{id}  ```		|	Update an existing address for the student 									|
				|	```DELETE /students/{id}/addresses/{id}``` 		|	Remove an existing address from the student details 						|
				|													|																				|
<b>EmailIds</b>	|	```GET /students/{id}/emails``` 				|	Get a list of all emails for the student 									|
				|	```POST /students/{id}/emails ```				|	Add a new email to a list of addresses for the student 						|
				|	```GET /students/{id}/emails/{id}``` 			|	Get a specific email for the student 										|
				|	```PUT /students/{id}/emails/{id} 	```			|	Update an existing email for the student 									|
				|	```DELETE /students/{id}/emails/{id} ```		|	Remove an existing email from the student details							|
				|													|																				|				
<b>Contacts</b>	|	```GET /students/{id}/contacts ``` 				|	Get a list of all contacts for the student 									|
				|	```POST /students/{id}/contacts ```				|	Add a new contact to a list of addresses for the student 					|
				|	```GET /students/{id}/contacts/{id}``` 			|	Get a specific contact for the student 										|
				|	```PUT /students/{id}/contacts/{id}```			|	Update an existing contact for the student 									|
				|	```DELETE /students/{id}/contacts/{id}``` 		|	Remove an existing contact from the student details 						|
				|													|																				|
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


Note : 

* There is no PUT operation allowed for /students/{id}/courses/{id} and /faculties/{id}/courses. The only operations allowed are adding and removing a course from the student/faculty. When the details for a given course are updated through the endpoint /courses/{id}, the changes are automatically reflected under the course details of student/faculty.
