package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ecnu.mapper.UserMapper;
import com.ecnu.mode.UserEntity;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	
	@Autowired
	private UserMapper userMapper;
	@Test
	public void contextLoads() {
		System.out.println("hello world");
	}
	@Test
	public void testInsert() throws Exception{
		UserEntity userEntity = new UserEntity("赵振","123","男");
		userMapper.insert(userEntity);
		Assert.assertEquals("123", userEntity.getPswd());
	}
}
