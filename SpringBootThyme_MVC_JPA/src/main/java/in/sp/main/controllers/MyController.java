package in.sp.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.sp.main.entities.User;
import in.sp.main.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/regPage")
	public String openRegPage(Model model) {
		
		model.addAttribute("user",new User());
		return "register";
	}

	
	@PostMapping("/regForm") 
	public String submitRegForm(@ModelAttribute User user,Model model)
	{
		if(userService.registerUser(user))
		{
			model.addAttribute("successMsg","User Registered Successfully.");
		}
		else {
			model.addAttribute("errorMsg","User Not Registered.");
		}
		return "register";
	}
	
	@GetMapping("/loginPage")
	public String openLoginPage(Model model) {
		
		model.addAttribute("user",new User());
		return "login";
	}
	
	@PostMapping("/loginForm") 
	public String submitLoginForm(@ModelAttribute User user,Model model)
	{
	User vUser=	userService.loginUser(user.getEmail(),user.getPassword());
		if(vUser!=null)
		{
			model.addAttribute("modelName",vUser.getName());
			return "profile";
		}
		else {
			model.addAttribute("errorMsg","Email or password wrong.");
			return "login";
		}
		
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session=request.getSession(false);
		if(session!=null)
		{
			session.invalidate();
		}
		return "redirect:/loginPage";
	}
}
