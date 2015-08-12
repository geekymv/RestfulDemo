package com.geekymv.restful.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.activation.DataHandler;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.springframework.stereotype.Service;

import com.geekymv.restful.FileUploadService;

/**
 * File upload services to upload files using RESTful Services
 * 
 * @desc: RestfulDemo
 * @author: geekymv
 * @createTime: 2015年8月11日 上午10:22:30
 * @history:
 * @version: v1.0
 */
@Service("fileUploadService")
public class FileUploadServiceImpl implements FileUploadService {

	@Override
	public Response uploadFile(List<Attachment> attachments) {
		for (Attachment attr : attachments) {
			DataHandler handler = attr.getDataHandler();
			InputStream in = null;
			OutputStream out = null;
			
			try {
				MultivaluedMap<String, String> map = attr.getHeaders();
				in = handler.getInputStream();
				out = new FileOutputStream(new File("d:/", getFileName(map)));
				
				int len = 0;
				byte[] b = new byte[1024];
				while((in.read(b)) != -1) {
					out.write(b, 0, len);
				}
				out.flush();
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(in != null) {
						in.close();
					}
					if(out != null) {
						out.close();
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}

		return Response.ok("file upload").build();
	}

	private String getFileName(MultivaluedMap<String, String> header) {
		String[] contentDisposition = header.getFirst("Content-Disposition")
				.split(";");
		for (String filename : contentDisposition) {
			if ((filename.trim().startsWith("filename"))) {
				String[] name = filename.split("=");
				String finalFileName = name[1].trim().replaceAll("\"", "");
				return finalFileName;
			}
		}
		return "unknown";
	}
}
