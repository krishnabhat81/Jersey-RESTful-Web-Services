package com.jersey.jaxrs.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
* @author Krishna Bhat
*
*/

@Path("/multipathparam")
public class MultiplePathParam {
	@GET
	@Path("{year}/{month}/{day}")
	public Response getData(
			@PathParam("year") int year,
			@PathParam("month") int month,
			@PathParam("day") int day){
		
		String date = year + "/" + month + "/" + day;
		return Response.status(200)
				.entity("getData is called, year/month/day : " + date)
				.build();
	}
}
