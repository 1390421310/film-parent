package com.zh.service;

import java.util.List;

import com.zh.pojo.Room;

public interface RoomService {
	List<Room> selAllRoom();
	
	int insRoom(Room room);
	
	int delRoomById(Integer id);
	
	int delRoomByCid(Integer id);
	
	int updRoom(Room room);
	
	Room selRoomById(Integer id);
	
	int selCountByCid(Integer id);
}
