package moses.kamira.studentApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApiApplication.class, args);
		System.out.println("This will be printed First");
	}
}
