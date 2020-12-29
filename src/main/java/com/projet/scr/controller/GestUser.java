package com.projet.scr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class GestUser {

	
	
	
	@GetMapping("/home2")
	public String home1(){
	    return "home";

	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	   public String index() {
	      return "index";
	   }
	   @RequestMapping(value = "/redirect", method = RequestMethod.GET)
	   public String redirect() {
	      return "home";
	   }
	   @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	   public String finalPage() {
	      return "final";
	   }
	


		   @RequestMapping(value = "/hello", method = RequestMethod.GET)
		   public String printHello(ModelMap model) {
		      model.addAttribute("message", "Hello Spring MVC Framework!");
		      return "hello";
		      }
}
