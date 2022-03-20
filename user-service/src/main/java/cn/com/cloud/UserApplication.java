package cn.com.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.com.cloud.mapper")
@SpringBootApplication
public class UserApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

}
