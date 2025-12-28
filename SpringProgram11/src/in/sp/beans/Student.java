package in.sp.beans;

public class Student {

    private int rollno;
    private String name;
    private Address address;//if using xml configuration file then no need to declare @autowire

    public Student(int rollno,String name,Address address){
        this.rollno=rollno;
        this.name=name;
        this.address=address;
    }

    
    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("RollNo:"+rollno);
        System.out.println("Address:"+address);
    }
}
