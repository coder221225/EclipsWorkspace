package in.sp.main.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import in.sp.main.config.HibernateConfig;
import in.sp.main.entities.User;
@Repository
public class DbOperationsImpl implements DbOperations{

	@Override
	public User getUserDetails(int id) {
		User user=null;
		try(Session session=HibernateConfig.getSessionFactory().openSession()) {
			user=session.get(User.class, 1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	//Here we can override methods to update,delete or insert data if declared in interface DbOperations

}
