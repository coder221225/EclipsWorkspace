package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
    @Bean
    public Student stdId1(){//stdId1 will be used as id in container class to create bean object
        Student std =new Student();
        std.setName("Harish");
        std.setEmail("harish@gmail.com");
        std.setRollno(101);
        return std;
    }

     @Bean("stdObj")
    public Student CreateStudent(){//stdId2 will be used as id in container class to create bean object
        Student std =new Student();
        std.setName("Girish");
        std.setEmail("girish@gmail.com");
        std.setRollno(102);
        return std;
    }

}
