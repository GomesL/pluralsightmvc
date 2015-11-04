package org.luke.controller;

import org.luke.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {

	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute("exerciseForm") Exercise exercise){
		System.out.println("Exercise : "+ exercise.getMinutes());
		return "addMinutes";
		//return "forward:addMinutes";
//		return "redirect:addMoreMinutes.html"; //this will generate differnet exercising value, since it regenerates a new one
	}
	
//	@RequestMapping(value="/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute("exerciseForm") Exercise exercise){
//		System.out.println("Exercising : "+ exercise.getMinutes());
//		return "addMinutes";
//	}
	
}
