package com.zh.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zh.dubbo.service.SysUsersDubboService;
import com.zh.mapper.SysUsersMapper;
import com.zh.pojo.SysUsers;

public class SysUsersDubboServiceImpl implements SysUsersDubboService{
	
	@Autowired
	private SysUsersMapper sysUsersMapper;

	@Override
	public List<SysUsers> selByNameAndPwd(String name,String password) {
		// TODO Auto-generated method stub
		return sysUsersMapper.selSysUserByNameAndPwd(name,password);
	}

	@Override
	public int updSysUsersPwd(String name,String password) {
		// TODO Auto-generated method stub
		return sysUsersMapper.updSysUsersPwd(name, password);
	}
	

}
