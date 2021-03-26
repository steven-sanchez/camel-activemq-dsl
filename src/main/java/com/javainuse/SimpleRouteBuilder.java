package com.javainuse;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		//configure route for jms component
		from("file:data/inputFolder?noop=true").split().tokenize("\n").to("jms:queue:javainuse2");
		
		
	}

	
	
	
	

}
