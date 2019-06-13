package com.zh.pojo;

import java.io.Serializable;
/**
 * 普通用户类
 * @author 13904
 *
 */
public class Users implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4415597509052547196L;
	private Integer id;//用户id
	private String name;//用户名称
	private String password;//用户密码
	private String phone;//联系方式
	private String status;//是否是会员
	private String sex;//性别
	private String email;//邮箱
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
