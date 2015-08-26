package com.jten2015.ebike.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String mainIndex(){
		
		return "main/index";
	}
	
}
