package com.zh.pojo;

import java.util.Date;

public class NewsComment {
	private int id;
	private String content;
	private String author;
	private Date createDate;
	private Integer newsid;
 	private NewsDetail newsDetail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public NewsDetail getNewsDetail() {
		return newsDetail;
	}
	public void setNewsDetail(NewsDetail newsDetail) {
		this.newsDetail = newsDetail;
	}
	public int getNewsid() {
		return newsid;
	}
	public void setNewsid(Integer newsid) {
		this.newsid = newsid;
	}
	
}
