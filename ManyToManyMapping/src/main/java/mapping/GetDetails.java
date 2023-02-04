package mapping;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		
		Query q1=em.createQuery("select c from Course c");
		List<Course> l1=q1.getResultList();
		System.out.println("Below are the course details..");
		for(Course c:l1) {
			System.out.println("CourseID:"+c.getCourse_Id());
			System.out.println("CourseName:"+c.getCourse_Name());
			System.out.println("CourseDuration:"+c.getCourse_Duration());
			System.out.println("-----------------------------------------");
		}
		System.out.println("__________________________________________");
		
		Query q2=em.createQuery("select s from Student s");
		List<Student> l2=q2.getResultList();
		System.out.println("Below are the student details..");
		for(Student s:l2) {
			System.out.println("StudentID:"+s.getStudent_Id());
			System.out.println("StudentName:"+s.getStudent_Name());
			System.out.println("StudentEmailID:"+s.getStudent_emailId());
			System.out.println("CourseDetails:"+s.getCourse());
			System.out.println("-----------------------------------------");
		}
	}

}
