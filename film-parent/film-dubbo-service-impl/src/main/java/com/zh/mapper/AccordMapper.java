package com.zh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.zh.pojo.Accord;

public interface AccordMapper {
	@Select("select * from accord where film=#{0}")
	List<Accord> selAccordByFilm(String film);
	@Select("select * from accord where id=#{0}")
	Accord selAccordById(Integer id);
}
