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
		users.put("1", new User("1", "张三", "123"));
		users.put("2", new User("2", "李四", "123"));
		users.put("3", new User("3", "王五", "123"));
	}
	
	@Override
	public User getUsers(String userId) {
		return users.get(userId);
	}

}
