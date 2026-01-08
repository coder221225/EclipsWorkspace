package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

}
