package com.program.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/message")
public class StudentService {
	@GET
	@Path("/{id}/{name}")
	@Produces({ "application/xml" })
	public Student printMessage(@PathParam("id") int id,
			@PathParam("name") String name) {
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		return student;

	}
}
