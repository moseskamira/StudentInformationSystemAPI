# Student Information System-API
The Student Information System is a BackEnd (API) implemented to cover some of the various functionalities that an Institute would require to perform as far as a student information is concerned.<br/>
The API provides resources as indicated in the implemented feature section below.

## Used Technology
- Spring Boot with Java.
- H2 in memory database with JpaRepository.

## Project Development Objectives
- To Test the understanding of Spring Boot Framework.
- To Test the use of H2 - in memory database.
- To Test the understanding of JpaRepository.

## Implemented Features (EndPoints)
- Registering a student. EndPoint: /home/student (Method: POST)
- Fetching All registered students. EndPoint: /home/student (method: GET)
- Fetching a single student by studentNumber. EndPoint: /home/student/{studentNumber} (method: GET)
- Updating student Information. EndPoint: /home/student (method: PUT)
- Deleting a student from the system. EndPoint: /home/student/{studentNumber} (method: DELETE)
- Sort students as to gender. EndPoint: home/gender/{gender} (method: GET)

## How To Test The API
### Locally
- clone the repository onto your machine via the link: https://github.com/moseskamira/StudentInformationSystemAPI.git
- Open the project in any IDE of your choice preferably STS and run.
- Open any client of your choice preferable PostMan
- Test each EndPoint by supplying it with data in JSON format. E.g<br/>

 {
        "studentNumber": 1214,<br>
        "studentName": "Joan Dash", <br/>
        "studentRegNumber": "14/U/4717/EVE",<br/>
        "studentGender": "Female",<br/>
        "studentDateOfBirth": "20-April-1998",<br/>
        "programmeName": "Software Engineering"<br/>
    }

## Displaying Database Tables With Contained Data
- Run the application
- Post data to the EndPoint as indicated above.
- Open a browser of your choice and load the url: http://localhost:8080/h2-console
- A dialog shall be displayed.
- Set the JDBC URL value to: jdbc:h2:mem:testdb
- Set the User Name field value to: sa
- Click connect and the database table (STUDENT)shall be displayed.
- Perform any query of your choice.

## NOTE:
- This API was not hosted since its implementation was intended to testing in-memory database(H2).




