package in.sp.beans;

public class Student {

    private int rollno;
    private String name;
    private Address address;//if using xml configuration file then no need to declare @autowire



    public int getRollno() {
        return rollno;
    }



    public void setRollno(int rollno) {
        this.rollno = rollno;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public Address getAddress() {
        return address;
    }



    public void setAddress(Address address) {
        this.address = address;
    }



    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("RollNo:"+rollno);
        System.out.println("Address:"+address);
    }
}
