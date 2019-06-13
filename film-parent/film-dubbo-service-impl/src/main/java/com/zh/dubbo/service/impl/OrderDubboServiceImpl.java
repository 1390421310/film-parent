package com.zh.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zh.dubbo.service.OrderDubboService;
import com.zh.mapper.OrderMapper;
import com.zh.pojo.Order;

public class OrderDubboServiceImpl implements OrderDubboService{
	@Autowired
	private OrderMapper orderMapper;
	@Override
	public List<Order> selAllOrder() {
		// TODO Auto-generated method stub
		return orderMapper.selAllOrder();
	}

	@Override
	public List<Order> selOrderByUid(Integer id) {
		// TODO Auto-generated method stub
		return orderMapper.selOrderByUid(id);
	}

	@Override
	public int insOrder(Order order) {
		// TODO Auto-generated method stub
		return orderMapper.insOrder(order);
	}

	@Override
	public Order selOrderByCinemaRoomSeat(String cinema, String room, String seat,String times) {
		// TODO Auto-generated method stub
		return orderMapper.selOrderByCinemaRoomSeat(cinema, room, seat,times);
	}

	@Override
	public String selFilmById(Integer id) {
		// TODO Auto-generated method stub
		return orderMapper.selFilmById(id);
	}

	@Override
	public int delOrder(Integer id) {
		// TODO Auto-generated method stub
		return orderMapper.delOrder(id);
	}
	
}
