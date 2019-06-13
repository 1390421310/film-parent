package com.zh.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.zh.pojo.FilmComing;

public interface FilmComingMapper {
	@Select("select * from film_coming")
	List<FilmComing> selAllFilmComing();
	@Delete("delete from film_coming where id=#{0}")
	int delFilmComingById(Integer id);
	@Select("select * from film_coming where id=#{0}")
	FilmComing selFilmComingById(Integer id);
	@Insert("insert into film_coming values (default,#{0},#{1},#{2},#{3},#{4},#{5},#{6},#{7},#{8})")
	Integer insFilmComing(String name,String director,String actor,Integer duration,String country,String description,Date createdate,long pid,Integer cid);
}
