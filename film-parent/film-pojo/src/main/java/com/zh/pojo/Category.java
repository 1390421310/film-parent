package com.zh.pojo;

import java.io.Serializable;

/**
 * 电影类别类
 * @author 13904
 *
 */
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3210204139550135349L;
	private Integer id;//类别id
	private String name;//类别名称
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
