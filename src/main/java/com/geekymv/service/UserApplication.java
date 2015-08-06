package com.geekymv.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.geekymv.pojo.User;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public interface UserApplication {

	@GET
	@Path(value="/users/{name}")
	public User getUsers(@PathParam("name")String name);
	
}
