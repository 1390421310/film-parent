package com.zh.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 即将上映电影类
 * @author 13904
 *
 */
public class FilmComing implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9125871369383894704L;
	private Integer id;//电影id
	private String name;//电影名称
	private String director;//导演
	private String actor;//演员
	private Integer duration;//片长
	private String country;//国家
	private String description;//简介
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date comingdate;//上映日期
	private long pid;//图片id
	private Integer cid;//类别id
	private Photo photo;
	private String cname;
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
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getComingdate() {
		return comingdate;
	}
	public void setComingdate(Date comingdate) {
		this.comingdate = comingdate;
	}
	
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Photo getPhoto() {
		return photo;
	}
	public void setPhoto(Photo photo) {
		this.photo = photo;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}	
}
