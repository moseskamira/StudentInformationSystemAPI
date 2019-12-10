# Student Information System-API
The Student Information System is a BackEnd (API) implemented to cover some of the various functionalities that an Institute would require to perform as far as a student information is concerned.<br/>
The API provides resources as indicated in the implemented feature section below.

## Used Technology
- Spring Boot with Java.
- H2 in memory database with JpaRepository.

## Implemented features (EndPoints)
- Registering a student. EndPoint: /home/student (Method: POST)
- Fetching All registered students. EndPoint: /home/student (method: GET)
- Fetching a single student by studentNumber. EndPoint: /home/student/{studentNumber} (method: GET)
- Updating student Information. EndPoint: /home/student (method: PUT)
- Deleting a student from the system. EndPoint: /home/student/{studentNumber} (method: DELETE)
- Sort students as to gender. EndPoint: home/gender/{gender} (method: GET)

## How to Test the API
### Locally
- clone the repository onto your machine via the link: https://github.com/moseskamira/StudentApi.git
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
    
### Online
- Access the API via the link: https://student-info-api.herokuapp.com
- Append an appropriate EndPoint to the Heroku link.
- You can use PostMan or any other client of your choice to supply the API with data as indicated above.

## Hosted API Link:
- Heroku Link: https://student-info-api.herokuapp.com


## Future Implementation


