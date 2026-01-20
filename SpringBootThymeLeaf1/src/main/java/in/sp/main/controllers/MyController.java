package in.sp.main.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/openProfile")
	public String openPorfilePage(Model model)
	{
		
		String nameString="Harish";
		model.addAttribute("modelName",nameString);
		return "profile";
		
	}

	@GetMapping("/openConditional")
	public String openConditionalPage(Model model)
	{
		
		int no1=10,no2=20;
		model.addAttribute("number1",no1);
		model.addAttribute("number2",no2);
		return "conditional";
		
	}
	@GetMapping("/openIteration")
	public String openIterationPage(Model model)
	{
		List<Integer> list =List.of(1,2,3,4,5);
		model.addAttribute("list",list);
		return "iteration";
		
	}
}
