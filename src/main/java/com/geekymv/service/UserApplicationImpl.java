package com.geekymv.service;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

@Named("userApplication")
public class UserApplicationImpl implements UserApplication {

	@Autowired
	public String getUsers() {
		return "hello";
	}

}
