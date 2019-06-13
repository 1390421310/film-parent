package com.zh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.zh.pojo.Order;

public interface OrderMapper {
	@Select("select * from orders")
	List<Order> selAllOrder();
	@Select("select * from orders where uid=#{0}")
	List<Order> selOrderByUid(Integer id);
	@Insert("insert into orders values (default,#{film},#{cinema},#{room},#{seat},#{price},#{state},#{uid},#{times})")
	int insOrder(Order order);
	@Select("select * from orders where cinema=#{0} and room=#{1} and seat=#{2} and times=#{3}")
	Order selOrderByCinemaRoomSeat(String cinema,String room,String seat,String times);
	@Select("select film from orders where id=#{0}")
	String selFilmById(Integer id);
	@Delete("delete from orders where id=#{0}")
	int delOrder(Integer id);
}
