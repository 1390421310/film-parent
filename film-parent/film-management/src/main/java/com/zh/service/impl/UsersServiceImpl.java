package com.zh.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zh.dubbo.service.UsersDubboService;
import com.zh.pojo.Users;
import com.zh.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{
	@Reference
	private UsersDubboService usersDubboServiceImpl;
	@Override
	public List<Users> selAllUser() {
		List<Users> list = usersDubboServiceImpl.selAllUser();
		return list;
	}
	@Override
	public List<Users> selUserByNameAndPwd(String name, String password) {
		// TODO Auto-generated method stub
		return usersDubboServiceImpl.selUserByNameAndPwd(name, password);
	}
	@Override
	public List<Users> selUserById(Integer id) {
		// TODO Auto-generated method stub
		return usersDubboServiceImpl.selById(id);
	}
	@Override
	public int delUser(Integer id) {
		// TODO Auto-generated method stub
		return usersDubboServiceImpl.delUser(id);
	}
	@Override
	public int updUserById(Integer id, String name, String password, String phone, String email) {
		// TODO Auto-generated method stub
		return usersDubboServiceImpl.updUserById(id, name, password, phone, email);
	}
	@Override
	public int register(Users users) {
		// TODO Auto-generated method stub
		return usersDubboServiceImpl.register(users);
	}
	@Override
	public int updPassWordByName(String name, String password) {
		// TODO Auto-generated method stub
		return usersDubboServiceImpl.updPassWordByName(name, password);
	}
	@Override
	public List<Users> selUserByName(String name) {
		// TODO Auto-generated method stub
		return usersDubboServiceImpl.selUserByName(name);
	}
	@Override
	public String selNameById(Integer id) {
		// TODO Auto-generated method stub
		return usersDubboServiceImpl.selNameById(id);
	}
}
