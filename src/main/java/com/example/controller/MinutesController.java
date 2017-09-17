package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {
	
	@RequestMapping("/addminutes")
	public String addMinutes(Model model) {
		model.addAttribute("minutes", 10);
		
		return "addMinutes";
	}

}
