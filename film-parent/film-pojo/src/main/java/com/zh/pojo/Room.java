package com.zh.pojo;

import java.io.Serializable;

/**
 * 放映厅类
 * @author 13904
 *
 */
public class Room implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3147351472938883808L;
	private Integer id;//放映厅id
	private String name;//放映厅名称
	private Integer total;//座位总数
	private Integer cid;//所属影院id
	private Cinema cinema;//影院
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
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Cinema getCinema() {
		return cinema;
	}
	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}
}
