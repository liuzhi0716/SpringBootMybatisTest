package com.ecnu.mapper;

import org.apache.ibatis.annotations.Insert;

import com.ecnu.mode.UserEntity;

public interface UserMapper {

	@Insert("INSERT INTO users(name,pswd,sex) VALUES(#{name},#{pswd},#{sex})")
	void insert(UserEntity userEntity);
}
