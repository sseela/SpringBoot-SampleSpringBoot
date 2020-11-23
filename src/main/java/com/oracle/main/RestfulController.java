package com.oracle.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestfulController {
	
	@GetMapping(value="/hello")
	public @ResponseBody String sayHello() {
		return "hello!!";
	}
}
