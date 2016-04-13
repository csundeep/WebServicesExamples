package com.program.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.program.service.HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

	public String sendMessage(String message) {

		return "Hello " + message;
	}

}
