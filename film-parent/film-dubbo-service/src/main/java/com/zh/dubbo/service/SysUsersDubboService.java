package com.zh.dubbo.service;

import java.util.List;

import com.zh.pojo.SysUsers;

public interface SysUsersDubboService {
	/**
	 * 管理员登录验证
	 * @param name
	 * @param password
	 * @return
	 */
	List<SysUsers> selByNameAndPwd(String name,String password);
	/**
	 * 修改管理员密码
	 * @param name
	 * @param password
	 * @return
	 */
	int updSysUsersPwd(String name,String password);
}
