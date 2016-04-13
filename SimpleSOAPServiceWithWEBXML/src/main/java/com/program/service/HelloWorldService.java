package com.program.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
public interface HelloWorldService {
	@WebMethod
	@WebResult(name="welcome")
	String sendMessage(@WebParam(name = "message") String message);
}
