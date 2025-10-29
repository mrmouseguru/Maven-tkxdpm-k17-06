package api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
//nghĩa là: http://localhost:8080/tkxdpm-k17-06/api/hello
@Path("/hello")
public class HelloWorldAPI {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Hello tkxdpm k17 06";
	}
}
