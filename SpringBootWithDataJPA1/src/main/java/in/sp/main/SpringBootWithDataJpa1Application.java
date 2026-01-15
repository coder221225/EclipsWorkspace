package in.sp.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.entities.Student;
import in.sp.main.services.StudentService;
import in.sp.main.services.StudentServiceImpl;

@SpringBootApplication
public class SpringBootWithDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBootWithDataJpa1Application.class, args);
		StudentService studentService=context.getBean(StudentServiceImpl.class);
		//----------INSERT OPERATION------------
//		Student std=new Student();
//		std.setName("Harish");
//		std.setRollno(200);
//		std.setMarks(95.2f);
//		if(studentService.addStudentDetails(std))
//		{
//			System.out.println("Student Added.");
//		}
//		else {
//			System.out.println("Student Not Added.");
//		}
//		//----------SELECT ALL-------------
//		List<Student> stdList=studentService.getAllStdDetaisl();
//		for(Student std:stdList)
//		{
//			System.out.println("Id:"+std.getId());
//			System.out.println("Name:"+std.getName());
//			System.out.println("Roll No:"+std.getRollno());
//			System.out.println("Marks:"+std.getMarks());
//			System.out.println("--------------");
//		}
		//----------SELECT By ID-------------
//		Student std=studentService.getStdtDetailsById(1L);
//		if(std!=null) {
//			System.out.println("Id:"+std.getId());
//			System.out.println("Name:"+std.getName());
//			System.out.println("Roll No:"+std.getRollno());
//			System.out.println("Marks:"+std.getMarks());
//			}
//		else {
//			System.out.println("Student Not Found.");
//		}
//		//----------UPDATE OPERATION-------------
//		if(studentService.updateStdDetails(1L, 97.0f))
//		{
//			System.out.println("Student updated.");
//		}
//		else {
//			System.out.println("Student Not updated.");
//		}
		
		//----------DELETE OPERATION-------------
		if(studentService.deletestdDetails(1L))
		{
			System.out.println("Student Deleted.");
		}
		else {
			System.out.println("Student Not Deleted.");
		}
	}

}
