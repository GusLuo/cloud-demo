package cn.com.cloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.cloud.config.OrderConfig;
import cn.com.cloud.damain.Order;
import cn.com.cloud.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private OrderConfig orderConfig;
	
	@RequestMapping("/getOrder")
	public Order getOrder() {
		
		System.out.println(orderConfig.getKey());
		return orderService.getOrder("2001");
	}

}
