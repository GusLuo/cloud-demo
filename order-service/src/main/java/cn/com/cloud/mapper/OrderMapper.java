package cn.com.cloud.mapper;

import org.apache.ibatis.annotations.Select;

import cn.com.cloud.damain.Order;

public interface OrderMapper {

	@Select("select * from tb_order where orderNo = #{orderNo}")
	Order getOrder(String orderNo);
}
