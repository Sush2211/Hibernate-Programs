package mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteOneDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Course c=em.find(Course.class, 102);
		
		Student s=em.find(Student.class, 2);
		
		et.begin();
		em.remove(c);
		em.remove(s);
		et.commit();
		
		System.out.println("Data deleted successfully..");
		
		
		
	}

}
