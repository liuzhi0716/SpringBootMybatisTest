package com.ecnu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecnu.mapper.UserMapper;
import com.ecnu.mode.UserEntity;

@RestController
public class IndexController {

	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping(value="/")
	public void index() {
		userMapper.insert(new UserEntity("赵振","123","男"));
	}
}
