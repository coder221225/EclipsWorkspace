package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("Harish")
    private String name;
     @Value("harish@gmail.com")
    private String email;
    @Value("101")
    private int rollno;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
     

     public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("RollNo:"+rollno);
        System.out.println("email:"+email);
    }
}
