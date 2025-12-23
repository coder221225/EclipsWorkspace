package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class main {
    public static void main(String args[])
    {
        String config_location="/in/sp/resources/applicationContext.xml";
        //Spring container creation
        ApplicationContext context =new ClassPathXmlApplicationContext(config_location);
        Student std=(Student)context.getBean("stdId2");//getting bean by providing id of bean declared in xml file
        std.display();
        System.out.println("---------------");
         Student std1=(Student)context.getBean("stdId1");//getting bean by providing id of bean declared in xml file
        std1.display();
    }

}
