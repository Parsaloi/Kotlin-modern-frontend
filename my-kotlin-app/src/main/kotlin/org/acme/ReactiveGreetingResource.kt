package org.acme

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/hello")
class ReactiveGreetingResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	fun hello(): String {
		return "Hello, Quarkus!"
	}
}
