package in.sp.beans;

public class Address {

private int houseno;
private String city;
private int pincode;

public Address(int houseno,String city,int pincode)
{
    this.city=city;
    this.houseno=houseno;
    this.pincode=pincode;

}

    
    @Override
    public String toString()
    {
        return "#"+houseno+","+city+"-"+pincode;
    }
}
