#This is an Spring Rest API

use jackson-databind to POJO Json data;

localhost:8080/spring-rest-demo/api/students
Method:GET
return  a json array of students' object

localhost:8080/spring-rest-demo/api/students/1
Method:GET
return a object of student.
if id not found, will return not found message with not found status.
