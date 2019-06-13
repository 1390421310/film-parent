package com.zh.pojo;

import java.io.Serializable;

/**
 * 城市类
 * @author 13904
 *
 */
public class City implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1847983921497550379L;
	private Integer id;//城市id
	private String name;//城市名称
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
	
}
