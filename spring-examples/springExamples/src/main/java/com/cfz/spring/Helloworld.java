package com.cfz.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Helloworld {
	@RequestMapping("/")
	public String index(){
		System.out.println("test..............");
		return "/index";
	}
}
