/**
 * 
 */
package com.raidentrance.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codahale.metrics.annotation.Timed;
import com.fasterxml.jackson.annotation.JsonView;
import com.raidentrance.data.SourceHelper;
import com.raidentrance.model.User;
import com.raidentrance.model.Views;

/**
 * @author raidentrance
 *
 */
@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

	private SourceHelper helper = new SourceHelper();

	private static final Logger LOG = LoggerFactory.getLogger(UserResource.class);

	@GET
	@Timed
	@JsonView(Views.Public.class)
	public Response getUsers() {
		LOG.info("Getting all users");
		List<User> users = helper.getUsers();
		return Response.ok(users).build();
	}

}
