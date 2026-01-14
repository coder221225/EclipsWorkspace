package in.sp.main.config;

import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;

public class HibernateConfig {
	
	public static SessionFactory getSessionFactory() {
		Configuration cfg= new Configuration();
		cfg.configure("/in/sp/main/resources/hibernate.cfg.xml");
		return cfg.buildSessionFactory();
	}

}
