package in.sp.beans;

public class Student {

    private int rollno;
    private String name;
    private Address address;

public Student(int rollno,String name,Address address)
{
    this.address=address;
    this.name=name;
    this.rollno=rollno;
}    

    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("RollNo:"+rollno);
        System.out.println("Address:"+address);
    }
}
