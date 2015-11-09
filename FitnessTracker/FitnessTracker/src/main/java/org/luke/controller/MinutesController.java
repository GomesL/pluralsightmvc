package org.luke.controller;

import java.util.ArrayList;
import java.util.List;

import org.luke.model.Activity;
import org.luke.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping(value="/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities(){
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);
		
		return activities;
	}
	
}
