package in.sp.main.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Mycontroller {
	@GetMapping("/")
	@ResponseBody
	public String printHellow() {
		return "Hello Harish";
		
	}

}
