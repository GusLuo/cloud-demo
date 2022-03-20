package cn.com.cloud.feign;

import javax.websocket.server.PathParam;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.cloud.damain.User;

@FeignClient("userservice")
public interface UserServiceFeign {

	@RequestMapping("/user/getUser/{id}")
	User getUser(@PathVariable("id") int id);
}
