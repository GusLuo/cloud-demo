package cn.com.cloud.mapper;

import org.apache.ibatis.annotations.Select;

import cn.com.cloud.domain.User;

public interface UserMapper {
	
	@Select("select * from tb_user where id = #{id}")
	User getUser(int id);

}
