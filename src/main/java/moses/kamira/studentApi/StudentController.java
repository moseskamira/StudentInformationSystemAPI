package moses.kamira.studentApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("home")
public class StudentController {
	@Autowired
	StudentRepository studentRepo;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student){
		studentRepo.saveAndFlush(student);
		return student;
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student){
		studentRepo.saveAndFlush(student);
		return student;
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}
	
	@GetMapping("/student/{studentNumber}")
	public Optional<Student> getStudentByStudentNumber(@PathVariable("studentNumber") int studentNumber){
		return studentRepo.findById(studentNumber);
	}
	
	@GetMapping("/programme/{programmeName}")
	public List<Student> getStudentByProgrammeName(@PathVariable("programmeName") String programmeName){
		return studentRepo.findAllByProgrammeName(programmeName);
	}
	
	@GetMapping("/gender/{studentGender}")
	public List<Student> getAllStudentsAsToSpecifiedGender(@PathVariable("studentGender") String studentGender) {
		List<Student> genderSortedList = studentRepo.findALLByStudentGender(studentGender);
		return genderSortedList;
	}
	
	
	@DeleteMapping("/student/{studentNumber}")
	public String deleteStudent(@PathVariable("studentNumber") int studentNumber){
		Student studentToDelete = studentRepo.getOne(studentNumber);
		studentRepo.delete(studentToDelete);
		return "Deleted Successfully";
	}
	}