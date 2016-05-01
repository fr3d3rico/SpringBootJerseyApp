package com.springbootjerseyapp;

import org.glassfish.jersey.server.ResourceConfig;

public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		this.packages("com.springbootjerseyapp.resources");
	}

}
