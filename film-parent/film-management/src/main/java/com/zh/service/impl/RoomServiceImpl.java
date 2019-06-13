package com.zh.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zh.dubbo.service.CinemaDubboService;
import com.zh.dubbo.service.RoomDubboService;
import com.zh.pojo.Room;
import com.zh.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{
	@Reference
	private RoomDubboService roomDubboService;
	@Reference
	private CinemaDubboService cinemaDubboService;
	@Override
	public List<Room> selAllRoom() {
		List<Room> list = roomDubboService.selAllRoom();
		for (Room room : list) {
			room.setCinema(cinemaDubboService.selCinemaById(room.getCid()));
		}
		return list;
	}
	@Override
	public int insRoom(Room room) {
		// TODO Auto-generated method stub
		return roomDubboService.insRoom(room);
	}
	@Override
	public int delRoomById(Integer id) {
		// TODO Auto-generated method stub
		return roomDubboService.delRoomById(id);
	}
	@Override
	public int delRoomByCid(Integer id) {
		// TODO Auto-generated method stub
		return roomDubboService.delRoomByCid(id);
	}
	@Override
	public int updRoom(Room room) {
		// TODO Auto-generated method stub
		return roomDubboService.updRoom(room);
	}
	@Override
	public Room selRoomById(Integer id) {
		Room room = roomDubboService.selRoomById(id);
		room.setCinema(cinemaDubboService.selCinemaById(room.getCid()));
		return room;
	}
	@Override
	public int selCountByCid(Integer id) {
		// TODO Auto-generated method stub
		return roomDubboService.selCountByCid(id);
	}

}
