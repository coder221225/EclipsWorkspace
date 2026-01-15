package in.sp.main.services;

import java.util.List;

import org.springframework.boot.autoconfigure.condition.ConditionalOnThreading;

import in.sp.main.entities.Student;

public interface StudentService {
public boolean addStudentDetails(Student std);
public List<Student> getAllStdDetaisl();
public Student getStdtDetailsById(long id);
public boolean updateStdDetails(long id,float marks);
public boolean deletestdDetails(long id);
}
