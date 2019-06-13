package com.zh.service;

import java.util.List;

import com.zh.pojo.Users;

public interface UsersService {
	
	List<Users> selAllUser();
	
	List<Users> selUserByNameAndPwd(String name,String password);
	
	List<Users> selUserById(Integer id);
	
	int delUser(Integer id);
	
	int updUserById(Integer id,String name,String password,String phone,String email);
	
	int register(Users users);
	
	int updPassWordByName(String name,String password);
	
	List<Users> selUserByName(String name);
	
	String selNameById(Integer id);
}
