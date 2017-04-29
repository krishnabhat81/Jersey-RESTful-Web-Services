package com.jersey.jaxrs.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

/**
 * @author Krishna Bhat
 *
 */

//NOTE: error/exception fixed from this link -  version problem with jersey and JAX-RS....
//http://stackoverflow.com/questions/30176811/abstractmethoderror-using-uribuilder-on-jax-rs

// Jersey contains a REST client library which can be used for testing or to
// build a real client in Java.
public class TestHelloService {
	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://localhost:8090/jersey-jax-rs/rest/hello").request().get();
		System.out.println(response);
		String str = response.readEntity(String.class);
		System.out.println(str);
	}
}
