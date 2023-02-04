package mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetOneDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		
		Person p=em.find(Person.class, 1);
		if(p!=null) {
			System.out.println("ID:"+p.getId());
			System.out.println("Name:"+p.getName());
			System.out.println("Phno:"+p.getPhno());
			System.out.println("AdharNo:"+p.getAdhar());
			System.out.println("-----------------");
		}
		else {
			System.out.println("Data not found");
		}
		
		AdharCard a=em.find(AdharCard.class,102);
		if(a!=null) {
			System.out.println("ID:"+a.getAdharNo());
			System.out.println("Name:"+a.getAddress());
			System.out.println("Phno:"+a.getPincode());
			System.out.println("-----------------");
		}
		else {
			System.out.println("Data not found");
		}
	}

}
