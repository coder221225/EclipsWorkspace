package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

    private int rollno;
    private String name;
    @Autowired
    @Qualifier("createAddrObj2")//if there are more qualifing Beans then Qualifier annotation is used to sepecify specific Bean
    private Address address;

    @Autowired
    private Subjects subjects;

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("RollNo:"+rollno);
        System.out.println("Address:"+address);
        System.out.println("Subjects:"+subjects);
    }
}
