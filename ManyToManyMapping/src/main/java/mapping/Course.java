package mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private int course_Id;
	private String course_Name;
	private String course_Duration;
	public int getCourse_Id() {
		return course_Id;
	}
	public void setCourse_Id(int course_Id) {
		this.course_Id = course_Id;
	}
	public String getCourse_Name() {
		return course_Name;
	}
	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}
	public String getCourse_Duration() {
		return course_Duration;
	}
	public void setCourse_Duration(String course_Duration) {
		this.course_Duration = course_Duration;
	}
	
	

}
