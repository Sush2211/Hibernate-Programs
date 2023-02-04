package mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
//@Setter
//@Getter
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_Id;
	private String student_Name;
	private String student_emailId;
	public int getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public String getStudent_emailId() {
		return student_emailId;
	}
	public void setStudent_emailId(String student_emailId) {
		this.student_emailId = student_emailId;
	}
	
	

}
