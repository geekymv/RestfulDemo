package com.geekymv.service;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Named;

import com.geekymv.pojo.User;


@Named("userApplication")
public class UserApplicationImpl implements UserApplication {
	// 模拟数据
	private static Map<String, User> users = new HashMap<String, User>();
	
	public UserApplicationImpl() {
		users.put("张三", new User("张三", "123"));
		users.put("李四", new User("李四", "123"));
		users.put("王五", new User("王五", "123"));
	}
	
	@Override
	public User getUsers(String name) {
		return users.get(name);
	}

}
