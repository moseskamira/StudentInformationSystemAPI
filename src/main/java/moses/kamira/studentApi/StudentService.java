package moses.kamira.studentApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {
	@Autowired
	StudentRepository studentRepo;
	
	public Student saveStudent(Student student){
		studentRepo.saveAndFlush(student);
		return student;
	}
	

	public List<Student> fetchAllStudents() {
		return studentRepo.findAll();
	}
	
	public Student updateStudent(Student student){
		studentRepo.saveAndFlush(student);
		return student;
	}
	
	public Optional<Student> getStudentByStudentNumber(int studentNumber){
		return studentRepo.findById(studentNumber);
	}
	
	public List<Student> getStudentByProgrammeName(String programmeName){
		return studentRepo.findAllByProgrammeName(programmeName);
	}
	
	public List<Student> getAllStudentsAsToSpecifiedGender(String studentGender) {
		return studentRepo.findALLByStudentGender(studentGender);
	}
	
	public String deleteStudent(int studentNumber){
		Student studentToBeDeleted = studentRepo.getOne(studentNumber);
		studentRepo.delete(studentToBeDeleted);
		return "Deleted Successfully";
	}
}
