package com.zh.dubbo.service;

import java.util.List;

import com.zh.pojo.Room;

public interface RoomDubboService {
	/**
	 * 查询全部放映厅
	 * @return
	 */
	List<Room> selAllRoom();
	/**
	 * 新增放映厅
	 * @param room
	 * @return
	 */
	int insRoom(Room room);
	/**
	 * 根据id删除放映厅
	 * @param id
	 * @return
	 */
	int delRoomById(Integer id);
	/**
	 * 根据影院id删除放映厅
	 * @param id
	 * @return
	 */
	int delRoomByCid(Integer id);	
	/**
	 * 修改影院信息
	 * @param room
	 * @return
	 */
	int updRoom(Room room);
	/**
	 * 根据id查询放映厅信息
	 * @param id
	 * @return
	 */
	Room selRoomById(Integer id);
	/**
	 * 根据影院id查询对应放映厅的个数
	 * @param id
	 * @return
	 */
	int selCountByCid(Integer id);
}
