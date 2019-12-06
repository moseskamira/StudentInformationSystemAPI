package moses.kamira.studentApi;

import javax.persistence.Entity;
import javax.persistence.Id;


import com.sun.istack.NotNull;

@Entity
public class Student {
	@Id
	int studentNumber;
	
	@NotNull
	String studentName;
	
	@NotNull
	String studentRegNumber;
	
	@NotNull
	String studentGender;
	
	@NotNull
	String studentDateOfBirth;
	@NotNull
	String programmeName;
	
	public Student(int studentNumber, String studentName, String studentRegNumber, String studentGender,
			String studentDateOfBirth, String programmeName) {
		super();
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentRegNumber = studentRegNumber;
		this.studentGender = studentGender;
		this.studentDateOfBirth = studentDateOfBirth;
		this.programmeName = programmeName;
	}

	public Student() {
		
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentRegNumber() {
		return studentRegNumber;
	}
	
	public void setStudentRegNumber(String studentRegNumber) {
		this.studentRegNumber = studentRegNumber;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public String getProgrammeName() {
		return programmeName;
	}

	public void setProgrammeName(String programmeName) {
		this.programmeName = programmeName;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentDateOfBirth() {
		return studentDateOfBirth;
	}

	public void setStudentDateOfBirth(String studentDateOfBirth) {
		this.studentDateOfBirth = studentDateOfBirth;
	}

	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", studentName=" + studentName + ", studentRegNumber="
				+ studentRegNumber + ", studentGender=" + studentGender + ", studentDateOfBirth=" + studentDateOfBirth
				+ ", programmeName=" + programmeName + "]";
	}
}