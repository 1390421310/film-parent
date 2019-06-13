package com.zh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zh.pojo.Room;

public interface RoomMapper {
	@Select("select * from room")
	List<Room> selAllRoom();
	@Insert("insert into room values(default,#{name},#{total},#{cid})")
	int insRoom(Room room);
	@Delete("delete from room where id=#{0}")
	int delRoomById(Integer id);
	@Delete("delete from room where cid=#{0}")
	int delRoomByCid(Integer id);
	@Update("update room set name=#{name},total=#{total},cid=#{cid} where id=#{id}")
	int updRoom(Room room);
	@Select("select * from room where id=#{0}")
	Room selRoomById(Integer id);
	@Select("select count(*) from room where cid=#{0}")
	int selCountByCid(Integer id);
}
