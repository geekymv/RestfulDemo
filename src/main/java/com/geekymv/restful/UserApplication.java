package com.geekymv.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.geekymv.pojo.User;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

@Path("/")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Api(value = "/user", description = "用户")
public interface UserApplication {

	@GET
	@Path(value="/users/{userId}")
	@ApiOperation(value="根据用户id获取用户信息", nickname="aaa", notes="bbb")
	public User getUsers(@ApiParam("用户id")@PathParam("userId")String userId);
	
	
}
