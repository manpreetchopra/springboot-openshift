package test.openshift.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping
	public String test() {
		System.out.println("test method");
		return "success";
	}

}