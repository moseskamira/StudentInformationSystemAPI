package moses.kamira.studentApi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface StudentRepository extends JpaRepository<Student, Integer>{
	List<Student> findALLByStudentGender(String studentGender);

	List<Student> findAllByProgrammeName(String programmeName);
};