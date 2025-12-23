package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student std=(Student)context.getBean("stdId1");//stdId1 is bean(method) created in configuration class with @Bean annotation
        std.display();

        //Student std=(Student)context.getBean(Student.class);//Works if only one bean is created for the class
        //std.display();
        System.out.println("-----------");
        Student std1=(Student)context.getBean("stdObj");//stdobj is bean name given in configuration class with @Bean annotation
        std1.display();
    }

}
