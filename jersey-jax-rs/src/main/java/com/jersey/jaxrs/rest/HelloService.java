package com.jersey.jaxrs.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Krishna Bhat
 *
 */

// The browser requests per default the HTML MIME type.

// Sets the path to base URL + /hello

@Path("/hello")
public class HelloService {
	@GET
	@Path("/{param}")
	public Response getMessage(@PathParam("param") String msg) {
		String out = "Jersey - JAX-RS : " + msg;
		return Response.status(200).entity(out).build();
	}

	// This method is called if TEXT_PLAIN is request
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello Jersey plain text";
	}

	// This method is called if XML is request
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey xml" + "</hello>";
	}

	// This method is called if HTML is request ------- default
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {
		return "<html> " + "<title>" + "Hello Jersey html" + "</title>" + "<body><h1>" + "Hello Jersey html" + "</body></h1>"
				+ "</html> ";
	}
}
