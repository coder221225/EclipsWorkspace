package in.sp.beans;

public class User {
private String name;//variable name should be same as in form if using @ModelAttribute in controller
private String email;//variable name should be same as in form if using @ModelAttribute in controller
private String phoneno;//variable name should be same as in form if using @ModelAttribute in controller
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
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}

}
