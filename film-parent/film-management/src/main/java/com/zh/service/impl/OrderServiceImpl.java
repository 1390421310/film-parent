package com.zh.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zh.dubbo.service.OrderDubboService;
import com.zh.dubbo.service.UsersDubboService;
import com.zh.pojo.Order;
import com.zh.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	@Reference
	private OrderDubboService orderDubboService;
	@Reference
	private UsersDubboService usersDubboService;
	@Override
	public List<Order> selAllOrder() {
		List<Order> list = orderDubboService.selAllOrder();
		for (Order order : list) {
			order.setName(usersDubboService.selNameById(order.getUid()));
		}
		return list;
	}

	@Override
	public List<Order> selOrderByUid(Integer id) {
		// TODO Auto-generated method stub
		return orderDubboService.selOrderByUid(id);
	}

	@Override
	public int insOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDubboService.insOrder(order);
	}

	@Override
	public Order selOrderByCinemaRoomSeat(String cinema, String room, String seat,String times) {
		// TODO Auto-generated method stub
		return orderDubboService.selOrderByCinemaRoomSeat(cinema, room, seat,times);
	}

	@Override
	public String selFilmById(Integer id) {
		// TODO Auto-generated method stub
		return orderDubboService.selFilmById(id);
	}

	@Override
	public int delOrder(Integer id) {
		// TODO Auto-generated method stub
		return orderDubboService.delOrder(id);
	}

}
