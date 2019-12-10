package moses.kamira.studentApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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
	
	@Autowired
	StudentService studentService;
	
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student){
		studentService.saveStudent(student);
		return student;
	}
	
	@GetMapping("/student")
	public List<Student> displayAllStudents(Model model) {
		List<Student> studentList = studentService.fetchAllStudents();
		model.addAttribute("students", studentList);
		return studentList;
	}
	
	@PutMapping("/student")
	public Student editStudentInfo(@RequestBody Student student){
		studentService.updateStudent(student);
		return student;
	}
	
	@GetMapping("/student/{studentNumber}")
	public Optional<Student> displayStudentByStudentNumber(@PathVariable("studentNumber") int studentNumber){
		return studentService.getStudentByStudentNumber(studentNumber);
	}
	
	@GetMapping("/programme/{programmeName}")
	public List<Student> displayStudentByProgrammeName(@PathVariable("programmeName") String programmeName){
		return studentService.getStudentByProgrammeName(programmeName);
	}
	
	@GetMapping("/gender/{studentGender}")
	public List<Student> displayAllStudentsAsToSpecifiedGender(@PathVariable("studentGender") String studentGender) {
		List<Student> genderSortedList = studentService.getAllStudentsAsToSpecifiedGender(studentGender);
		return genderSortedList;
	}
	
	@DeleteMapping("/student/{studentNumber}")
	public String removeStudent(@PathVariable("studentNumber") int studentNumber){
		studentService.deleteStudent(studentNumber);
		return "Deleted Successfully";
	}
	}