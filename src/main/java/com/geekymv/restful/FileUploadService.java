package com.geekymv.restful;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

@Path("/upload")
@Api(value="/fileUpload", description="文件上传")
public interface FileUploadService {

	@POST
	@Path("/files")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@ApiOperation(value="上传文件", response=Response.class)
	public Response uploadFile(@ApiParam(value="附件", required=true)List<Attachment> attachments);
}
