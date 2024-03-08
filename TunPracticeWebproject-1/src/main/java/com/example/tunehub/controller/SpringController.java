package com.example.tunehub.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tunehub.entites.FormData;

@CrossOrigin("*")
@RestController
public class SpringController 
{
//@GetMapping("/call")
//	public String testCall()
//	{
//	System.out.println("call recived by spring boot ");
//		return "call recive";	
//	}
	@GetMapping("/testGet")
	public String testGst()
	{
		System.out.println("get requst recived");
		return "get requst recived";
	}
	@PostMapping("/testpost")
	public String testPost(@RequestBody String data)
	{
		System.out.println("Post request receved: "+data);
		return "Post request receved: "+data;
	}
	@PostMapping("/testform")
	public String testForm(@RequestBody String dataform)
	{
		System.out.println("Form request receved: "+dataform);
		return "Form request receved: "+dataform;
	}
	@PostMapping("/formData")
	public String formData(@RequestBody FormData data)
	{
		System.out.println("data: "+data);
		return "data: "+data;
	}
}
