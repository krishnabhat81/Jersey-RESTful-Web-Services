package com.jersey.jaxrs.jaxb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Krishna Bhat
 *
 */

@Path("/todo_jackson")
public class JacksonFeature {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Todo getJSON() {
		Todo todo = new Todo();
		todo.setSummary("This is json todo");
		todo.setDescription("This is json description");
		return todo;
	}
}
