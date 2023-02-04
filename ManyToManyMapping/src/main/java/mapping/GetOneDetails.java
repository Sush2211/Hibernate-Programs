package mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetOneDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		
		Course c=em.find(Course.class, 102);
		System.out.println("Below are the course details..");
		if(c!=null) {
			System.out.println("CourseID:"+c.getCourse_Id());
			System.out.println("CourseName:"+c.getCourse_Name());
			System.out.println("CourseDuration:"+c.getCourse_Duration());
			System.out.println("-----------------------------------------");
		}
		else {
			System.out.println("Data not found..");
		}
		
		Student s=em.find(Student.class, 3);
		System.out.println("Below are the student details..");
		if(s!=null) {
			System.out.println("StudentID:"+s.getStudent_Id());
			System.out.println("StudentName:"+s.getStudent_Name());
			System.out.println("StudentEmailID:"+s.getStudent_emailId());
			System.out.println("CourseDetails:"+s.getCourse());
			System.out.println("-----------------------------------------");
		}
		else {
			System.out.println("Data not found");
		}
		
	}

}
