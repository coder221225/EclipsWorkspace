package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

@Bean
public Address createAddrObj()
{
Address adr=new Address(555,"Washim",444311);
return adr;
}

@Bean
public Student createStdObj()
{
    Student std=new Student(101,"Harish",createAddrObj());
    return std;
}

}
