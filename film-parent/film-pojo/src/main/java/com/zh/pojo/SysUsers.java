package com.zh.pojo;

import java.io.Serializable;
/**
 * 系统管理员类
 * @author 13904
 *
 */
public class SysUsers implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5816044608875480376L;
	private Integer id;//管理员id
	private String name;//管理员名称
	private String password;//管理员密码
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
