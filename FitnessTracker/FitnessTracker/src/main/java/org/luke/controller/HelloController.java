package org.luke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value ="/greeting")
	public String sayHello(Model model){
		model.addAttribute("greeting", "Luke \n Gomes");
		return "hello"; // return name should be equal to file name
	}
	
}
