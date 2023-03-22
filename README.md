****Full Stack Automation Final Project****

This project demonstrates automation testing on different kinds of applications (web, mobile, API, desktop and electron), all with one common infrastructure. 
This infrastructure is easily maintained and the tests can be created with few lines of code. 
The project contains a number of classes, including Page Objects Design Pattern, project layers (extensions, work flows, test cases), support of different browsers, 
failure mechanism and external files. 

****The applications used in this project:****

- NopCommerce Demo Web Page- web based application
- Grafana API- web API
- ToDo List- electron application
- Windows calculator- desktop application 
- Loan calculator- mobile application

****Tools used in this project:****

- TestNG- testing framework
- Jenkins- used for test execution 
- Allure Reports- reporting system
- Event Listeners- used to process events
- Rest Assured- for API testing
- Sikuli- used visual testing

****Known Issues:****

The NopCommerce Demo Web Application "forgets" previously created username and password after a few login attempts. Therefore, try and catch statements were used to check if login credentials are saved. At first, login will be attempted by creating a new user. If the user already exists, another attempt will take place with prespecified login credentials.

The NopCommerce test that uses Sikuli to varify logo image fails periodically. Possibly when the mouse moves, the test fails. 

One of the tests uses a free online MySQL Database to test NopCommerce Demo. Because the database had a 1 month trial period, the test no longer works. 




