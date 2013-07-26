package com.bank.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

	@RequestMapping(value={"/","/index"})
	public String getHomePage(){		
		return "index";
	}
	
}
