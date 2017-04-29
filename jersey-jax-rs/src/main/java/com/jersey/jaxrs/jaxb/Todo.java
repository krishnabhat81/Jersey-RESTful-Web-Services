package com.jersey.jaxrs.jaxb;

import javax.xml.bind.annotation.XmlRootElement;


/**
* @author Krishna Bhat
*
*/

/*
 * Domain class e.g. Todo.class
 */

@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and JSON
public class Todo {
	private String summary;
	private String description;
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
