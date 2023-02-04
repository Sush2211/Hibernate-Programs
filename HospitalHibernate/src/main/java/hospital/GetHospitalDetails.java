package hospital;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class GetHospitalDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sush");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select h from Hospital h"); //JPQL-Java persistence query language
		List<Hospital> l=q.getResultList();
		for(Hospital h:l)
		{
			System.out.println("ID:"+ h.getId());
			System.out.println("Name:"+h.getName());
			System.out.println("EmailID:"+h.getEmailId());
			System.out.println("PhNo:"+h.getPhno());
			System.out.println("Äddress:"+h.getAddress());
			System.out.println("--------------------------------");
		}
		
	}

}
