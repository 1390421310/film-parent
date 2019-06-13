package com.zh.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zh.dubbo.service.UsersDubboService;
import com.zh.mapper.UsersMapper;
import com.zh.pojo.Users;

public class UsersDubboServiceImpl implements UsersDubboService{
	
	@Autowired
	private UsersMapper usersMapper;
	@Override
	public List<Users> selAllUser() {
		// TODO Auto-generated method stub
		return usersMapper.selAllUser();
	}
	@Override
	public List<Users> selUserByNameAndPwd(String name, String password) {
		// TODO Auto-generated method stub
		return usersMapper.selUserByNameAndPwd(name, password);
	}
	@Override
	public List<Users> selById(Integer id) {
		// TODO Auto-generated method stub
		return usersMapper.selUserById(id);
	}
	@Override
	public int delUser(Integer id) {
		// TODO Auto-generated method stub
		return usersMapper.delUser(id);
	}
	@Override
	public int updUserById(Integer id, String name, String password, String phone, String email) {
		// TODO Auto-generated method stub
		return usersMapper.updUserById(id, name, password, phone, email);
	}
	@Override
	public int register(Users users) {
		// TODO Auto-generated method stub
		return usersMapper.register(users);
	}
	@Override
	public int updPassWordByName(String name, String password) {
		// TODO Auto-generated method stub
		return usersMapper.updPassWordByName(name, password);
	}
	@Override
	public List<Users> selUserByName(String name) {
		// TODO Auto-generated method stub
		return usersMapper.selUserByName(name);
	}
	@Override
	public String selNameById(Integer id) {
		// TODO Auto-generated method stub
		return usersMapper.selNameById(id);
	}

}
