package com.joserodriguez;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	private Boolean isCodeCorrect(String guess) {
		return guess.equals("bushido");
	}
	private String[] getValues() {
		String[] values = {	"Loyalty", "Courage", "Veracity", "Compassion", "Honor" };
		
		//return new String[] {
		//	"Loyalty", "Courage", "Veracity", "Compassion", "Honor"
		//};
		System.out.println(values);
		return values;
	}
	
	
	@RequestMapping("/")
	public String Index() {
		return "index.jsp";
	}
	@RequestMapping(value="/try", method=RequestMethod.POST)
	public String Try(@RequestParam(value="guess") String guess, 
					  Model model, RedirectAttributes redirectAttributes) {
		if(isCodeCorrect(guess)) {
			return "redirect:/code";
		}
		redirectAttributes.addFlashAttribute("WrongAnswer", "You must train harder every day!");
		return "redirect:/";		
	}
	@RequestMapping("/code")
	public String Code(Model model) {
		model.addAttribute("values", getValues());
		return "code.jsp";
	
	}

}
