package in.sp.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.sp.main.dao.UserDao;
import in.sp.main.entity.User;

@SpringBootApplication
public class SpringBootProject2Application implements CommandLineRunner{
	
	@Autowired
	private UserDao userDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//-----------INSERTION--------------------
		//User user1=new User("Harish","harish@gmail.com","Male","Akot");
//		User user2=new User("Girish","girish@gmail.com","Male","Akola");
//		if(userDao.insertUser(user2))
//		{
//			System.out.println("User Inserted!");
//		}
//		else{
//			System.out.println("User Not Inserted!");
//		}
		//----------UPDATION---------------------
//		User user2=new User("Girish","girish@gmail.com","Male","Telhara");
//		if(userDao.updateUser(user2))
//		{
//			System.out.println("User Updated!");
//		}
//		else{
//			System.out.println("User Not Updated!");
//		}
		//---------DELETION----------------------
		
//		if(userDao.deleteUser("girish@gmail.com"))
//		{
//			System.out.println("User Deleted!");
//		}
//		else{
//			System.out.println("User Not Deleted!");
//		}
		//-------------SELECT 1 USER-------------
//		User user=userDao.getUserByEmail("harish@gmail.com");
//		System.out.println("Name:"+user.getName());
//		System.out.println("Email:"+user.getEmail());
//		System.out.println("Gender:"+user.getGender());
//		System.out.println("City:"+user.getCity());
//		
		//-----------GET ALL USERS----------------
		List<User> list =userDao.getAllUser();
		for(User user:list)
		{
			System.out.println("Name:"+user.getName());
			System.out.println("Email:"+user.getEmail());
			System.out.println("Gender:"+user.getGender());
			System.out.println("City:"+user.getCity());
			System.out.println("-----------------------");
	}

}
}
