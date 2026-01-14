package in.sp.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.entities.User;
import in.sp.main.repository.DbOperations;

@SpringBootApplication
public class SpringBootWithHibernate1Application {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringBootWithHibernate1Application.class, args);
	DbOperations dbop =context.getBean(DbOperations.class);
	User user=dbop.getUserDetails(1);
	if(user!=null) {
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		}
		else {System.out.println("User not Found.");}
		
	}

}
