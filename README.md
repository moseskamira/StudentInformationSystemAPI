# StudentInformationSystemAPI
This project is intended to implement a Student API (BackEnd).
The Api provides resources as indicated in the implemented feature section below.

## Used Technology
- Spring Boot with Java.
- H2 in memory database with JpaRepository.

## Implemented features (EndPoints)
- Registering a student. url: /home/student (Method: POST)
- Fetching All registered students. url: /home/student (method: GET)
- Fetching a single student by studentNumber. Url: /home/student/{studentNumber} (method: GET)
- Updating student Information. Url: /home/student (method: PUT)
- Deleting a student from the system. Url: /home/student/{studentNumber} (method: DELETE)
- Sort students as to gender. Url: home/gender/{gender} (method: GET)

## How to Test the API
### Locally
- clone the repository onto your machine via the link: https://github.com/moseskamira/StudentApi.git
- Open the project in any IDE of your choice preferably STS and run.
- Open any client of your choice preferable PostMan
- Test each endpoint by supplying it with data in JSON format. E.g<br/>
 {
        "studentNumber": 1214,<br>
        "studentName": "Joan Dash", <br/>
        "studentRegNumber": "14/U/4717/EVE",<br/>
        "studentGender": "Female",<br/>
        "studentDateOfBirth": "20-April-1998",<br/>
        "programmeName": "Software Engineering"<br/>
    }
### Online
- Access the API via the provide link:
- supply the API with data as indicated above.

## Hosted Api Link:

## Future Implementation


