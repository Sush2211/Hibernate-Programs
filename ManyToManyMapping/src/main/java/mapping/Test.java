package mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Course c1=new Course();
		c1.setCourse_Id(101);
		c1.setCourse_Name("Java");
		c1.setCourse_Duration("4 months");
		
		Course c2=new Course();
		c2.setCourse_Id(102);
		c2.setCourse_Name("SQL");
		c2.setCourse_Duration("2 months");
		
		Course c3=new Course();
		c3.setCourse_Id(103);
		c3.setCourse_Name("JavaScript");
		c3.setCourse_Duration("3 months");
		
		List<Course> c=new ArrayList<Course>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
		
		Student s1=new Student();
		s1.setStudent_Name("Raj");
		s1.setStudent_emailId("Raj@gmail.com");
		s1.setCourse(c);
		
		Student s2=new Student();
		s2.setStudent_Name("Ram");
		s2.setStudent_emailId("Ram@gmail.com");
		s2.setCourse(c);
		
		Student s3=new Student();
		s3.setStudent_Name("Ravan");
		s3.setStudent_emailId("Ravan@gmail.com");
		s3.setCourse(c);
		
		et.begin();
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		et.commit();
		
		System.out.println("Data Inserted successfully..");
		
		
		
		
	}

}
