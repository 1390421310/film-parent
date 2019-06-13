package com.zh.service;

import java.util.List;

import com.zh.pojo.SysUsers;


public interface SysUsersService {
	List<SysUsers> selByNameAndPwd(String name,String password);
	
	int updSysUsersPwd(String name,String password);
}
