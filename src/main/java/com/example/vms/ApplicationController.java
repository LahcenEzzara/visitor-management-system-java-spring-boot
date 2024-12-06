package com.example.vms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ApplicationController {
	
	
	@GetMapping("/index")
	public String homePage() {
		return "index";
	}
	@GetMapping("/_layout")
    public String goHome(){
        return "_layout";
    }
	@GetMapping("visitor")
    public String visitor(){
        return "/visitor/index";
    }
	

}