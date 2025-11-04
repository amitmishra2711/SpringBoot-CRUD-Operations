package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestingController {
	@RequestMapping("/getAll")
	@ResponseBody
public String handleRequest()
{
	return "This is Are Sun rahe  Spring Boot Hyyyroject";
}
	@RequestMapping("/hello")
	@ResponseBody
public String handleReq()
{
	return "This is Second Spring Boot Project";
}	
}
