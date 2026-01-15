package in.sp.main.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.query.NativeQuery.ReturnableResultNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.entities.Student;
import in.sp.main.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public boolean addStudentDetails(Student std) {
		boolean status=false;
		try {
			studentRepository.save(std);
			status=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Student> getAllStdDetaisl() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student getStdtDetailsById(long id) {
		
		 Optional<Student> optional= studentRepository.findById(id);
		 if(optional.isPresent())
		 {
			 return optional.get();
		 }
		 else {
			 return null;
		 }
	}

	@Override
	public boolean updateStdDetails(long id, float marks) {
		Student std=getStdtDetailsById(id);
		if(std !=null)
		{
			std.setMarks(marks);
			studentRepository.save(std);
			return true;
		}
		return false;
	}

	@Override
	public boolean deletestdDetails(long id) {
		try {
			studentRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
