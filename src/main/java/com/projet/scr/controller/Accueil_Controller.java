package com.projet.scr.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class Accueil_Controller {

	
	@GetMapping("/")
	public String home(){
		
		
		System.out.print("Get /");
	    return "index";

	}


	
	@GetMapping("/welcome")
	public String welcom(){
		System.out.println("ca va");
	    return "home";
	}
	
	
	@GetMapping("/home")
	public String home1(){
	    return "home";

	}
//	
//	@GetMapping("/pages/home")
//	public String topPage(){
//	    return "/pages/home";
//	}
	
}
