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
		
		Sim s1=new Sim();
		s1.setSimId(105);
		s1.setNetwork("4G");
		s1.setServiceProvider("JIO");
		
		Sim s2=new Sim();
		s2.setSimId(106);
		s2.setNetwork("5G");
		s2.setServiceProvider("Airtel");
		
		List<Sim> sims=new ArrayList<Sim>();
		sims.add(s1);
		sims.add(s2);
		
		Mobile m=new Mobile();
		m.setBrand("Iphone");
		m.setCost(150000);
		m.setSim(sims);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(m);
		et.commit();
		
		System.out.println("Data inserted successfully..");
		
	}

}
