package com.zh.pojo;

import java.io.Serializable;

/**
 * 电影院类
 * @author 13904
 *
 */
public class Cinema implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8041139042313316922L;
	private Integer id;//影院id
	private String name;//影院名称
	private Integer number;//影院联系电话
	private Integer cid;//影院所属城市id
	private String address;//影院地址
	private City city;
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
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	
}
