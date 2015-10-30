package org.luke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value ="/greeting")
	public String sayHello(Model model){
		model.addAttribute("greeting", "Luke Gomes");
		model.addAttribute("greeting2", "Lsgsdggggggggggggggggggggggggggg Lsgsdggggggggggggggggggggggggggg Lsgsdggggggggggggggggggggggggggg \n Lsgsdggggggggggggggggggggggggggg Lsgsdggggggggggggggggggggggggggg Lsgsdggggggggggggggggggggggggggg");
		return "hello"; // return name should be equal to file name
	}
	
}
