package com.jersey.jaxrs.filedownload;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
* 	@author Krishna Bhat
* 
*	@Produces("text/plain"): for downloading text file.
*	@Produces("image/png"): for downloading png image file.
*	@Produces("application/pdf"): for downloading PDF file.
*	@Produces("application/vnd.ms-excel"): for downloading excel file.
*	@Produces("application/msword"): for downloading ms word file.
*/

@Path("/files")
public class FileDownloadService {
	private static final String FILE_PATH_TXT = "/Users/krishna1bhat/Desktop/test/myfile.txt";
	private static final String FILE_PATH_IMG = "/Users/krishna1bhat/Desktop/test/krishna.jpg";
	private static final String FILE_PATH_PDF = "/Users/krishna1bhat/Desktop/test/Cracking_the_Coding_Interview.pdf";
	
	//download text file .txt
	@GET
	@Path("/txt")
	@Produces("text/plain")
	public Response fetTextFile(){
		File file = new File(FILE_PATH_TXT);
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition", "attachment; filename=\"jax_rs_file.txt\"");
		return response.build();
	}
	
	
	//download image file....
	@GET  
    @Path("/image")  
    @Produces("image/png")  
    public Response getImageFile() {  
        File file = new File(FILE_PATH_IMG);  
        ResponseBuilder response = Response.ok((Object) file);  
        response.header("Content-Disposition","attachment; filename=\"krishna_image.png\"");  
        return response.build();  
   
    }  
	
	//download pdf file
	@GET  
    @Path("/pdf")  
    @Produces("application/pdf")  
    public Response getPdfFile() {  
        File file = new File(FILE_PATH_PDF);  
        ResponseBuilder response = Response.ok((Object) file);  
        response.header("Content-Disposition","attachment; filename=\"cci_pdf.pdf\"");  
        return response.build();  
    }  
}
