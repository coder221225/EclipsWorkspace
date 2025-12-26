package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfigFile {

@Bean
public Address createAddrObj1()
{
Address adr=new Address();
adr.setHouseno(555);
adr.setCity("Washim");
adr.setPincode(111555);
return adr;
}

@Bean
public Address createAddrObj2()
{
Address adr=new Address();
adr.setHouseno(545);
adr.setCity("Washigton");
adr.setPincode(444555);
return adr;
}
@Bean
public Subjects creaSubjectObj()
{
    Subjects subj=new Subjects();
    List<String> subject_list=new ArrayList<String>();
    subject_list.add("Java");
    subject_list.add("Python");
    subject_list.add("C++");
    subj.setSubjects(subject_list);
    return subj;
}
@Bean
public Student createStdObj()
{
    Student std=new Student();
    std.setName("Harish");
    std.setRollno(101);
    //std.setAddress(createAddrObj());//Manually DI
    //std.setSubjects(creaSubjectObj());//Manually DI
    return std;
}

}
