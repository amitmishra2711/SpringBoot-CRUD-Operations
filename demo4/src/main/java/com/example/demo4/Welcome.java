package com.example.demo4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Welcome {
@RequestMapping("/welcome")
@ResponseBody
public String welcome()
{
	return "Hello Welcome in JAVA";
}
@RequestMapping("/Namste")
@ResponseBody
public String namaste()
{
	return "Hello Namaste in JAVA";
}

}
