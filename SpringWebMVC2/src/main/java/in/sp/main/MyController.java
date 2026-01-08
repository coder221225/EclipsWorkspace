package in.sp.main;

import java.net.http.HttpRequest;
import java.nio.file.attribute.UserDefinedFileAttributeView;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.sp.beans.User;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	
	//@RequestMapping("/helloPage")
    @GetMapping("/helloPage")
    public ModelAndView openHelloPage()
    {
        System.out.println("1234");
        ModelAndView mv=new ModelAndView();
        mv.setViewName("hello");
        return mv;
    }
    
    @GetMapping("/aboutUs")
    public String openAboutUsPage()
    {
       
        return "about-us";
    }
    
    @RequestMapping("/myForm")
    public String openMyFormPage()
    {
       
        return "my-form";
    }
    
//    @PostMapping("/submitForm")
//    public String handleMyForm(HttpServletRequest req)
//    {
//    	String name=req.getParameter("name");
//    	String email=req.getParameter("email");
//    	String phone=req.getParameter("phoneno");
//       
//        return "profile";
//    }
    
//    @PostMapping("/submitForm")
//  public String handleMyForm(@RequestParam("name") String myname,
//		  					 @RequestParam("email") String myemail,
//		  					 @RequestParam("phoneno") String myphone, 
//		  					 Model model)//Model is an interface
//  {
//  System.out.println(myname+myemail+myphone);
//     model.addAttribute("model_name", myname);
//     model.addAttribute("model_email", myemail);
//     model.addAttribute("model_phone", myphone);
//      return "profile";
//  }
//    @PostMapping("/submitForm")
//    public String handleMyForm(@RequestParam("name") String myname,
//  		  					 @RequestParam("email") String myemail,
//  		  					 @RequestParam("phoneno") String myphone, 
//  		  					 Model model)//Model is an interface
//    {
//    System.out.println(myname+myemail+myphone);
//    User user=new User();
//    user.setName(myname);
//    user.setEmail(myemail);
//    user.setPhoneno(myphone);
//       model.addAttribute("model_user", user);
//        return "profile";
//    }
    @PostMapping("/submitForm")
    public String handleMyForm(@ModelAttribute User user)//User class is a bean class defined in in.sp.beans by programmer
    //public String handleMyForm(@ModelAttribute("model_user") User user)// this will create "model_use" named object which will be usable on jsp page instead of "user"
    {
          return "profile";
    }

}
