package com.zh.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 评论类
 * @author 13904
 *
 */
public class Comment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6000318203880240002L;
	private Integer id;//评论id
	private String content;//评论内容
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdate;//评论时间
	private String uname;//评论人
	private String fname;//评论电影
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
}
