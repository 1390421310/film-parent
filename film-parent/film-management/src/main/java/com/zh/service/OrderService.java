package com.zh.service;

import java.util.List;

import com.zh.pojo.Order;

public interface OrderService {
	
	List<Order> selAllOrder();
	
	List<Order> selOrderByUid(Integer id);
	
	int insOrder(Order order);
	
	Order selOrderByCinemaRoomSeat(String cinema,String room,String seat,String times);
	
	String selFilmById(Integer id);
	
	int delOrder(Integer id);
}
