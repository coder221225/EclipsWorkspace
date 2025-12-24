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
Address adr=new Address();
adr.setHouseno(555);
adr.setCity("Washim");
adr.setPincode(111555);
return adr;
}

@Bean
public Student createStdObj()
{
    Student std=new Student();
    std.setName("Harish");
    std.setRollno(101);
    std.setAddress(createAddrObj());
    return std;
}

}
