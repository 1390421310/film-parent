package com.zh.dubbo.service;

import java.util.List;

import com.zh.pojo.Users;

public interface UsersDubboService {
	/**
	 * 查询全部用户
	 * @return
	 */
	List<Users> selAllUser();
	/**
	 * 根据姓名和密码查询用户
	 * @param name
	 * @param password
	 * @return
	 */
	List<Users> selUserByNameAndPwd(String name,String password);
	/**
	 * 根据id查询用户信息
	 * @param id
	 * @return
	 */
	List<Users> selById(Integer id);
	/**
	 * 根据id删除用户
	 * @param id
	 * @return
	 */
	int delUser(Integer id);
	/**
	 * 修改个人信息
	 * @param id
	 * @param name
	 * @param password
	 * @param phone
	 * @param email
	 * @return
	 */
	int updUserById(Integer id,String name,String password,String phone,String email);
	/**
	 * 用户注册
	 * @param users
	 * @return
	 */
	int register(Users users);
	/**
	 * 根据账户修改密码
	 * @param name
	 * @param password
	 * @return
	 */
	int updPassWordByName(String name,String password);
	/**
	 * 根据名称查询用户
	 * @param name
	 * @return
	 */
	List<Users> selUserByName(String name);
	/**
	 * 根据id查询用户名
	 * @param id
	 * @return
	 */
	String selNameById(Integer id);
}
