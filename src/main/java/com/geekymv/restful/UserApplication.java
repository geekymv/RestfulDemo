package com.geekymv.restful;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.geekymv.pojo.User;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

/**
 * CRUD
 * POST -- to create a new resource.
 * GET -- to read (return) a single resource or a list of resources.
 * PUT -- to update an existing resource.
 * DELETE -- to delete a resource.
 *
 */
@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Api(value = "/user", description = "用户")
public interface UserApplication {

	
	@GET
	@Path(value="/users/{userId}")
	@ApiOperation(value="根据用户id获取用户信息", nickname="aaa", notes="bbb")
	public User getUsers(@ApiParam("用户id")@PathParam("userId")String userId);
	
	@POST
	@Path(value="/user")
	@ApiOperation(value="创建用户")
	public User createUser(User user);
	
	@DELETE
	@Path(value="/user")
	@ApiOperation(value="根据用户id删除用户", response=String.class)
	public String deleteUser(@ApiParam(value="用户id", required=true) 
						String userId);

	@PUT
	@Path(value="/user")
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value="更新用户信息")
	public User updateUser(User user);
	
}
