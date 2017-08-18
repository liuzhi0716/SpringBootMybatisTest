package com.ecnu.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ecnu.mapper.UserMapper;
import com.ecnu.mode.UserEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testInsert() throws Exception{
		userMapper.insert(new UserEntity("赵振","123","男"));
		//UserEntity userEntity = new UserEntity("赵振","123","男");
		//userMapper.insert(userEntity);
		//Assert.assertEquals("123", userEntity.getPswd());
	}
}
