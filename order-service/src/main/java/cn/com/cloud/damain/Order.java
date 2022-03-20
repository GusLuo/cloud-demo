package cn.com.cloud.damain;

import lombok.Data;

@Data
public class Order {

	private String orderNo;
	
	private String goodsName;
	
	private int userId;
}
