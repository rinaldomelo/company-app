# Company App with Spring Boot and AngularJS | Demo: https://obscure-badlands-85687.herokuapp.com/ 

Simple Rest Web Service with Spring Boot, Spring Data JPA and in the front-end AngularJS.

## Documentation

### Project Structure (Full Documentation doc/ folder) 

 - /src/main/java
	 - company 
		 - Application.java 
	 - company.controllers
		 - CompanyController.java 
	 - company.models
		 - Company.java
	 - company.repository
		 - CompanyRepository.java
 - /src/main/resources 
	 - company
		 - static 
			 - app 
				 - app.js
				 - controllers.js
				 - service.js
			 - index.html
				 
### Requesting API through cURL

#### GET request

curl https://obscure-badlands-85687.herokuapp.com/companies

#### POST request

curl -i -X POST -H "Content-Type:application/json" https://obscure-badlands-85687.herokuapp.com/companies/ -d '{"id":1,"name":"test","address":"test","city":"test","country":"test","email":"test@test.com","phoneNumber":"1111111","owners":["owner1"]}'

#### DELETE request 

curl -v -X DELETE https://obscure-badlands-85687.herokuapp.com/companies/id

### Authentication 

OAuth2: Provide one of the best services and I have good experience using in old projects. 


Simple Auth.

Use a default secutiry password: xxxx-xxxx-xxxx

curl user:xxxx-xxxx-xxxx@https://obscure-badlands-85687.herokuapp.com/companies/id


### Redundant Service

In a good implementation of Rest Service http call will provide all the service and just one end-point.


 
		
	