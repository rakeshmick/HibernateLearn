

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



/**
 * Created by rakeshprabhakaran on 5/12/2015.
 */
public class HibernateTest {
	public static void main(String[] args){
		try {


			UserDetails userDetails= new UserDetails();
			userDetails.setUserId(1);
			userDetails.setUserName("First User");

			SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();


			session.beginTransaction();
			session.save(userDetails);
			session.getTransaction().commit();

		}catch (Exception e){


			e.printStackTrace();
		}
	}
}
