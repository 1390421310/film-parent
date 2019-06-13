package com.zh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zh.pojo.SysUsers;

public interface SysUsersMapper {
	@Select("select * from sysuser where name=#{param1} and password=#{param2}")
	List<SysUsers> selSysUserByNameAndPwd(String name,String password);
	@Update("update sysuser set password=#{param2} where name=#{param1}")
	int updSysUsersPwd(String name,String password);
}
