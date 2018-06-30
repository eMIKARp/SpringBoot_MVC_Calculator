package pl.mojaaplikacja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(path="/", method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(path="/", method=RequestMethod.POST)
	public String calculate(@RequestParam(name="valueA", defaultValue="0") int valueA, 
			@RequestParam(name="valueB", defaultValue="0") int valueB) {
		
		int result = valueA+valueB;
		System.out.printf("%d + %d = %d\n", valueA, valueB, result);
		
		return "home";
		
	}
	
}
