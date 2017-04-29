/**
 * @author krishna1bhat
 *
 */
package com.jersey.jaxrs.jaxb.client;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

import com.jersey.jaxrs.jaxb.JacksonFeature;

public class TodoTest {

	public static void main(String[] args) {
		ClientConfig config = new ClientConfig().register(JacksonFeature.class);
		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());
		// Get XML
		String xmlResponse = target.path("rest").path("todo").request().accept(MediaType.TEXT_XML).get(String.class);
		// Get XML for application
		String xmlAppResponse = target.path("rest").path("todo").request().accept(MediaType.APPLICATION_XML)
				.get(String.class);
		
		System.out.println(xmlResponse);
		System.out.println(xmlAppResponse);

		
		//--------------------------------- For JSON ---------------------------------
		
		
		// For JSON response also add the Jackson libraries to your web application
		// In this case you would also change the client registration to
		// ClientConfig config = new
		// ClientConfig().register(JacksonFeature.class);
		// Get JSON for application
		
		//NOTE: I get error and fixed from this link:
		//http://stackoverflow.com/questions/29136404/severe-messagebodywriter-not-found-for-media-type-application-json-type-class
		
		String jsonAppResponse = target.path("rest").path("todo_jackson").request().accept(MediaType.APPLICATION_JSON)
				.get(String.class);
		System.out.println(jsonAppResponse);
		
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8090/jersey-jax-rs").build();
	}

}