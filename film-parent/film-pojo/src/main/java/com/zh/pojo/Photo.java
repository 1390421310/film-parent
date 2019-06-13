package com.zh.pojo;

import java.io.Serializable;
/**
 * 图片类
 * @author 13904
 *
 */
public class Photo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3883526592758805470L;
	private long id;//图片id
	private String name;//图片名称
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
