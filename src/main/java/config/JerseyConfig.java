package config;

import org.glassfish.jersey.server.ResourceConfig;

import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("/api")//mọi web service phải đi qua url: /api
public class JerseyConfig extends ResourceConfig{
	
	public JerseyConfig() {
		packages("api");//quét tất cả web service trong package api
	}

}
