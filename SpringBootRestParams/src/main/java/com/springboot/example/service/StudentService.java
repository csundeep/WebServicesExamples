package com.springboot.example.service;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentService {

	@RequestMapping(method = RequestMethod.GET, path = "/pathParam/{name}")
	String pathParam(@PathVariable String name) {
		return "Hello " + name;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/queryParam")
	String queryParam(@PathParam("name") String name) {
		return "Hello there " + name;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/matrixParam")
	String matrixParam(@ModelAttribute ("name") String name) {
		return "Hi there " + name;
	}
}
