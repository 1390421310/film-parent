package com.zh.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.zh.pojo.FilmHot;

public interface FilmHotMapper {
	@Select("select * from film_hot")
	List<FilmHot> selAllFilmHot();
	@Delete("delete from film_hot where id=#{0}")
	int delFilmHotById(Integer id);
	@Insert("insert into film_hot values (default,#{0},#{1},#{2},#{3},#{4},#{5},#{6},#{7},#{8},#{9})")
	Integer insFilmHot(String name,String director,String actor,Integer duration,String country,String description,double score,Date createdate,long pid,Integer cid);
	@Select("select * from film_hot where id=#{0}")
	FilmHot selFilmHotById(Integer id);
}
