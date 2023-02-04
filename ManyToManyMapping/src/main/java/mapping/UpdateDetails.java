package mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Course c=em.find(Course.class, 103);
		c.setCourse_Name("Hiberante");
		c.setCourse_Duration("1 month");
		
		Student s=em.find(Student.class, 3);
		s.setStudent_Name("Sita");
		s.setStudent_emailId("Sita@gmail.com");
		
		et.begin();
		em.merge(c);
		em.merge(s);
		et.commit();
		
		System.out.println("Data updated successfully..");
	}

}
