package hibernateTest;

import java.util.List;

import model.ClaimDetails;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery(" from ClaimDetails");
		query.setFirstResult(5);
		query.setMaxResults(100);
		List<ClaimDetails> claims = (List<ClaimDetails>) query.list();
		session.getTransaction().commit();
		session.close();
		
		for(ClaimDetails c :claims){
			System.out.println(c.getClaimId()+" " +c.getLastOpenedDate().getTime());
		}

	}

}
