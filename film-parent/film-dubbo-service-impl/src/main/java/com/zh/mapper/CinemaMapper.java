package com.zh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zh.pojo.Cinema;

public interface CinemaMapper {
	@Select("select * from cinema")
	List<Cinema> selAllCinema();
	@Select("select count(*) from cinema where cid=#{0}")
	int selCinemaCountByCid(Integer id);
	@Delete("delete from cinema where cid=#{0}")
	int delCinemaByCid(Integer id);
	@Delete("delete from cinema where id=#{0}")
	int delCinemaById(Integer id);
	@Insert("insert into cinema values(default,#{name},#{number},#{cid},#{address})")
	int insCinema(Cinema cinema);
	@Select("select * from cinema where id=#{0}")
	Cinema selCinemaById(Integer id);
	@Update("update cinema set name=#{name},number=#{number},cid=#{cid},address=#{address} where id=#{id}")
	int updCinema(Cinema cinema);
}
