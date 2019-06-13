package com.zh.pojo;

import java.io.Serializable;

public class Accord implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5053756031391710215L;
	private int id;
	private String film;//电影名称
	private String room;//放映厅名称
	private int price;//价格
	private String cinema;//影院名称
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFilm() {
		return film;
	}
	public void setFilm(String film) {
		this.film = film;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCinema() {
		return cinema;
	}
	public void setCinema(String cinema) {
		this.cinema = cinema;
	}
	@Override
	public String toString() {
		return "Accord [id=" + id + ", film=" + film + ", room=" + room + ", price=" + price + ", cinema=" + cinema
				+ "]";
	}
	
}
