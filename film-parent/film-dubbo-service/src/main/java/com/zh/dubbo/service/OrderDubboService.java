package com.zh.dubbo.service;

import java.util.List;

import com.zh.pojo.Order;

public interface OrderDubboService {
	/**
	 * 查询所有订单
	 * @return
	 */
	List<Order> selAllOrder();
	/**
	 * 根据id查询订单
	 * @param id
	 * @return
	 */
	List<Order> selOrderByUid(Integer id);
	/**
	 * 新增订单
	 * @param order
	 * @return
	 */
	int insOrder(Order order);
	/**
	 * 查看该座位是否已经被预定
	 * @param cinema
	 * @param room
	 * @param seat
	 * @param times
	 * @return
	 */
	Order selOrderByCinemaRoomSeat(String cinema,String room,String seat,String times);
	/**
	 * 根据id查询影片
	 * @param id
	 * @return
	 */
	String selFilmById(Integer id);
	/**
	 * 根据id删除订单
	 * @param id
	 * @return
	 */
	int delOrder(Integer id);
}
