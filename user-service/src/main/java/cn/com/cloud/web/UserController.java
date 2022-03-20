package cn.com.cloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.cloud.domain.User;
import cn.com.cloud.service.UserSerrvice;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserSerrvice userSerrvice;
	
	@RequestMapping("getUser/{id}")
	public User getUser(@PathVariable("id") int id) {
		
		return userSerrvice.getUser(id);
	}

}
