package com.zh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zh.pojo.Users;

public interface UsersMapper {
	@Select("select * from users")
	List<Users> selAllUser();
	
	@Select("select * from users where name=#{param1} and password=#{param2}")
	List<Users> selUserByNameAndPwd(String name,String password);
	
	@Select("select * from users where id=#{0}")
	List<Users> selUserById(Integer id);
	
	@Delete("delete from users where id=#{0}")
	int delUser(Integer id);
	
	@Update("update users set name=#{param2},password=#{param3},phone=#{param4},email=#{param5} where id=#{param1}")
	int updUserById(Integer id,String name,String password,String phone,String email);
	
	@Insert("insert into users values(default,#{name},#{password},#{phone},#{status},#{sex},#{email})")
	int register(Users users);
	
	@Update("update users set password=#{param2} where name=#{param1}")
	int updPassWordByName(String name,String password);
	
	@Select("select * from users where name=#{0}")
	List<Users> selUserByName(String name);
	
	@Select("select name from users where id=#{0}")
	String selNameById(Integer id);
}
