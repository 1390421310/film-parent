package com.zh.pojo;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 热映电影类
 * @author 13904
 *
 */
public class FilmHot implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6367955977457732960L;
	private Integer id;//电影id
	private String name;//电影名称
	private String director;//导演
	private String actor;//演员
	private Integer duration;//片长
	private String country;//国家
	private String description;//简介
	private double score;//评分
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdate;//上映日期
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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
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
	@Override
	public String toString() {
		return "FilmHot [id=" + id + ", name=" + name + ", director=" + director + ", actor=" + actor + ", duration="
				+ duration + ", country=" + country + ", description=" + description + ", score=" + score
				+ ", createdate=" + createdate + ", pid=" + pid + ", cid=" + cid + ", photo=" + photo + ", cname="
				+ cname + "]";
	}
}
