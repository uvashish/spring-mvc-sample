package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Sample;
import com.example.service.SampleService;

@Controller
public class RestSampleApi {
	
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping(value="/samples", method=RequestMethod.GET)
	public @ResponseBody List<Sample> getAllSamples() {
		System.out.println("getting all samples rest api call ...");
		return sampleService.getSamples();
	}
	
}
