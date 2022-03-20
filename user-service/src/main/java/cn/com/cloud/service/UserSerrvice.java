package cn.com.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.cloud.domain.User;
import cn.com.cloud.mapper.UserMapper;

@Service
public class UserSerrvice {
	
	@Autowired
	private UserMapper userMapper;
	
	public User getUser(int id) {
		return userMapper.getUser(id);
	}
	
}
