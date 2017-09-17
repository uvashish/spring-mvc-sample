package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Customer;

/**
 * 
 * @author uvashish
 *
 */

@Controller
public class CustomerController {
	
	@RequestMapping(value="/customers", method=RequestMethod.GET)
	public String getCustomer(@ModelAttribute("customer") Customer customer ) {
		System.out.println("render customer page");
		return "customer";
	}
	
	@RequestMapping(value="/customers", method=RequestMethod.POST)
	public String createCustomer(@ModelAttribute("customer") Customer customer ) {
		System.out.println("handle post call");
		System.out.println("customer: "+customer.toString());
		return "customer";
	}
}
