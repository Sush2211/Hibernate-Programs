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
		
		Query q=em.createQuery("select a from AdharCard a");
		List<AdharCard> l=q.getResultList();
		System.out.println("Below are the Adhar details");
		for(AdharCard a:l) {
			System.out.println("ID:"+a.getAdharNo());
			System.out.println("Name:"+a.getAddress());
			System.out.println("Phno:"+a.getPincode());
			System.out.println("-----------------");
			}
		Query q1=em.createQuery("select p from Person p");
		List<Person> l1=q1.getResultList();
		System.out.println("Below are the person details..");
		for(Person p:l1) {
			System.out.println("ID:"+p.getId());
			System.out.println("Name:"+p.getName());
			System.out.println("Phno:"+p.getPhno());
			System.out.println("AdharNo:"+p.getAdhar());
			System.out.println("-----------------");
			}

	}

}
