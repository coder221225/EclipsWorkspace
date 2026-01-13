package in.sp.main;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import in.sp.entities.User;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	User user1=new User();
//    	//user1.setId(1); //NO need to set ID manually if @GeneratedValue(strategy=GenerationType.IDENTITY) annotation is used in entity class it will generate ID automatically
//    	user1.setName("Harish");
//    	user1.setEmail("harish@gmail.com");
//    	user1.setCity("Akola");
//    	user1.setGender("Male");
//    	user1.setPassword("Harish123");
    	
//    	User user2=new User();
//    	//user1.setId(1); //NO need to set ID manually if @GeneratedValue(strategy=GenerationType.IDENTITY) annotation is used in entity class it will generate ID automatically
//    	user2.setName("Girish");
//    	user2.setEmail("girish@gmail.com");
//    	user2.setCity("Akot");
//    	user2.setGender("Male");
//    	user2.setPassword("Girish123");
    	
    	Configuration cfg=new Configuration();
    	cfg.configure("/in/sp/config/hibernate.cfg.xml");
    	
    	
    	SessionFactory sessionFactory =cfg.buildSessionFactory();
    	Session session=sessionFactory.openSession();
    	Transaction transaction=session.beginTransaction();
    	//------------INSERT OPERATION-----------
//    	try {
//        	session.save(user2);
//        	transaction.commit();
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//		}

        //--------SELECT OPERATION-----------------
//    	try {
//			User user=session.get(User.class,2);
//			if(user!=null) {
//			System.out.println(user.getId());
//			System.out.println(user.getName());
//			System.out.println(user.getEmail());
//			System.out.println(user.getGender());
//			System.out.println(user.getPassword());
//			System.out.println(user.getCity());}
//			else {
//				System.out.println("No user found!");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//    	//------------UPDATE OPERATION-----------
//    	User user3=session.get(User.class,2);
//        	 user3.setCity("Balapur");
//
//    	try {
//        	session.saveOrUpdate(user3);
//        	transaction.commit();
//        	System.out.println("User details update!");
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//			System.out.println("User details not update!");
//		}
    	//------------DELETE OPERATION-----------
    	User user4=new User();
        	 user4.setId(2);

    	try {
        	session.delete(user4);
        	transaction.commit();
        	System.out.println("User details deleted!");
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			System.out.println("User details not deleted!");
		}
    }
}
