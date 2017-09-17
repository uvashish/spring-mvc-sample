/**
 * 
 */
package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author uvashish
 *
 */
@Controller
public class HelloController {

	@RequestMapping(value="/greetings")
	public String sayHello(Model model) {
		model.addAttribute("greeting", "Hello World from Spring Sample by me !!");
		return "hello";
	}
	
}
