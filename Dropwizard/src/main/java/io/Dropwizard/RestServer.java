package io.Dropwizard;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/magicball")
public class RestServer {

	@GET
	
	    @Path("/get")
	
	    @Produces(MediaType.APPLICATION_JSON)
	
	    public MagicBall getMagicBall(){
	
	        MagicBall magic = new MagicBall();
	
	        magic.setColor("Red");
	
	        magic.setSize("100");
	
	        magic.setShape("Circle");

	        
	        return magic;
	
	    }
	
	     
	
	    @POST
	
	    @Path("/post")
	
	    @Consumes(MediaType.APPLICATION_JSON)
	
	    public Response postMagicBall(MagicBall magic){
	
	        String result = "Record entered: "+ magic;
	
	        return Response.status(201).entity(result).build();
	
	    }

}

