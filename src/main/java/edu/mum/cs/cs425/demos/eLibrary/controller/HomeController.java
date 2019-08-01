package edu.mum.cs.cs425.demos.eLibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	//@RequestMapping(value = "/elibrary",method = RequestMethod.GET)
	@GetMapping(value = {"/elibrary","/elibrary"})
	public String displayHomepage() {
		return "home/index";
	}
	
	@GetMapping(value = "elibrary/about")
	public String displayAboutpage() {
		return "home/about";
	}
	

}
