package com.zh.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zh.dubbo.service.SysUsersDubboService;
import com.zh.pojo.SysUsers;
import com.zh.service.SysUsersService;

@Service
public class SysUsersServiceImpl implements SysUsersService{
	@Reference
	private SysUsersDubboService sysUsersDubboServiceImpl;

	@Override
	public List<SysUsers> selByNameAndPwd(String name,String password) {
		// TODO Auto-generated method stub
		return sysUsersDubboServiceImpl.selByNameAndPwd(name, password);
	}

	@Override
	public int updSysUsersPwd(String name, String password) {
		// TODO Auto-generated method stub
		return sysUsersDubboServiceImpl.updSysUsersPwd(name, password);
	}

	
}
