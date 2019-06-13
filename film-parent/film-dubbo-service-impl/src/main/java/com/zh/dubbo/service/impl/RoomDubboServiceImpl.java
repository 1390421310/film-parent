package com.zh.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zh.dubbo.service.RoomDubboService;
import com.zh.mapper.RoomMapper;
import com.zh.pojo.Room;

public class RoomDubboServiceImpl implements RoomDubboService{
	@Autowired
	private RoomMapper roomMapper;	
	@Override
	public List<Room> selAllRoom() {		
		return roomMapper.selAllRoom();
	}
	@Override
	public int insRoom(Room room) {
		// TODO Auto-generated method stub
		return roomMapper.insRoom(room);
	}
	@Override
	public int delRoomById(Integer id) {
		// TODO Auto-generated method stub
		return roomMapper.delRoomById(id);
	}
	@Override
	public int delRoomByCid(Integer id) {
		// TODO Auto-generated method stub
		return roomMapper.delRoomByCid(id);
	}
	@Override
	public int updRoom(Room room) {
		// TODO Auto-generated method stub
		return roomMapper.updRoom(room);
	}
	@Override
	public Room selRoomById(Integer id) {
		// TODO Auto-generated method stub
		return roomMapper.selRoomById(id);
	}
	@Override
	public int selCountByCid(Integer id) {
		// TODO Auto-generated method stub
		return roomMapper.selCountByCid(id);
	}

}
