package io.Dropwizard;


import javax.annotation.Nonnull;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/magicball/color/{color}/size/{size}/shape/{shape}")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RestServer {


	@GET
	
	    @Path("/get")
	
	    @Produces(MediaType.APPLICATION_JSON)
	
	    public MagicBall getMagicBall(@PathParam("color") String color,@PathParam("size") final String size, 
	    	    @Nonnull @PathParam("size") final String shape ){
	
	        MagicBall magic = new MagicBall();
	
	        magic.setColor(color);
	
	        magic.setSize(size);
	
	        magic.setShape(shape);

	        
	        return magic;
	
	    }


}

