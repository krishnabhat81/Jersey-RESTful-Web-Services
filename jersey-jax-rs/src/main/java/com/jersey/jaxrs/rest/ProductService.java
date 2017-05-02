package com.jersey.jaxrs.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Krishna Bhat
 *
 */

@Path("/product")
public class ProductService {
	//http://localhost:8090/jersey-jax-rs/rest/product/add
	//check this url in postman
	//header Content-type must be application/x-www-form-urlencoded, body also x-www-form-urlencoded (and key value... in postman)
	@POST
	@Path("/add")
	public Response addProduct(
			@FormParam("id") int id,
			@FormParam("name") String name,
			@FormParam("price") float price
			) {

		return Response.status(200)
				.entity(" Product added successfuly!<br> Id: " + id + "<br> Name: " + name + "<br> Price: " + price)
				.build();
	}
}
