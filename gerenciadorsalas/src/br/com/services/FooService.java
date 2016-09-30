package br.com.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/fooservice")
public class FooService {
	@GET
	@Produces("application/json")
	public Response getFoo() throws JSONException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("FooValue", "foooooooooooooo"); 
		String result = "@Produces(\"application/json\") Output: " + jsonObject;
		return Response.status(200).entity(result).build();
	}
}
