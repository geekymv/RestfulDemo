package com.geekymv.pojo;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlElement;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * 用户类
 * @desc: RestfulDemo
 * @author: miying@iflytek.com
 * @createTime: 2015年8月8日 下午10:09:49
 * @history:
 * @version: v1.0
 */
@ApiModel(value="用户Model")
@XmlRootElement(name="user")
public class User {
	public User() {
	}
	public User(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;
	}
	public User(String id, String name, String pwd) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}

	private String id;
	private String name;
	private String pwd;

	@XmlElement(value="id")
	@ApiModelProperty(value="用户id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	@XmlElement(value="name")
	@ApiModelProperty(value="用户名称")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(value="pwd")
	@ApiModelProperty(value="用户密码")
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
