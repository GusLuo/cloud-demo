package cn.com.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cn.com.cloud.damain.Order;
import cn.com.cloud.damain.User;
import cn.com.cloud.feign.UserServiceFeign;
import cn.com.cloud.mapper.OrderMapper;

@Service
public class OrderService {

	@Autowired
	private OrderMapper orderMapper;
//	@Autowired
//	private RestTemplate restTemplate;
	
	@Autowired
	private UserServiceFeign userServiceFeign;
	
	public Order getOrder(String orderNo) {
		
		//使用服务名访问，必须使用@LoadBalanced
	//	String url = "http://userservice/user/getUser";
	//	User user = restTemplate.getForObject(url, User.class);
		User user = userServiceFeign.getUser(1001);
		System.out.println(user.toString());
		return orderMapper.getOrder(orderNo);
	}
}
