package cn.com.cloud.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "orderservice")
public class OrderConfig {
	
	private String key;
}
