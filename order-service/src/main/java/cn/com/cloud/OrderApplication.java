package cn.com.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan("cn.com.cloud.mapper")
@EnableFeignClients
@SpringBootApplication
public class OrderApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	/*
	 * @Bean
	 * 
	 * @LoadBalanced public RestTemplate getTemplate() { return new RestTemplate();
	 * }
	 */
}
