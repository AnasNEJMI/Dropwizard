package io.Dropwizard;


import java.io.IOException;

import javax.annotation.Nonnull;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("/magicball")
public class PostRequest {
	
	MagicBall m;


    /*@Nonnull @PathParam("color") final String color;
    @Nonnull @PathParam("size") final String size;
    @Nonnull @PathParam("size") final String shape;*/

	@GET
	
	    @Path("/color/{color}/size/{size}/shape/{shape}")
	
	    @Produces(MediaType.APPLICATION_JSON)
	
	    public MagicBall getMagicBall(@PathParam("color") final String color,@PathParam("size") final String size, @PathParam("size") final String shape){
	
	        MagicBall magic = new MagicBall(color, size, shape);  
	        return magic;
	
	    }

	    @POST
		@Path("/post")
		@Consumes("application/json")
		public Response POST(String json){
	        	
	        ObjectMapper mapper = new ObjectMapper();
	        MagicBall magic = new MagicBall();
			try {
				magic = mapper.readValue(json, MagicBall.class);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        float value = magic.getSizeValue()*magic.getColorValue()*magic.getShapeValue();
	        String magicString = Float.toString(value);
			String result = "The value is : " + magicString;
			return Response.status(201).entity(result).build();
			
		}

}

