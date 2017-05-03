package com.jersey.jaxrs.filedownload;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
* @author Krishna Bhat
*
*/

@Path("/files")
public class FileDownloadService {
	private static final String FILE_PATH = "/Users/krishna1bhat/Desktop/test/myfile.txt";
	@GET
	@Path("/txt")
	@Produces("text/plain")
	public Response fetFile(){
		File file = new File(FILE_PATH);
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition", "attachment; filename=\"jax_rs_file.txt\"");
		return response.build();
	}
}
