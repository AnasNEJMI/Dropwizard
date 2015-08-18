package io.Dropwizard.resources;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello/{name}")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

	@GET
		public String getHello(@PathParam("name") String name){
			 
			return "Hello  " +name+ "!";
		
	}
}
