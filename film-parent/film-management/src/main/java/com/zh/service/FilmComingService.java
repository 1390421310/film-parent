package com.zh.service;

import java.sql.Date;
import java.util.List;

import com.zh.pojo.FilmComing;

public interface FilmComingService {
	List<FilmComing> selAllFilmComing();
	
	int delFilmComingById(Integer id);
	
	FilmComing selFilmComingById(Integer id);
	
	Integer insFilmComing(String name,String director,String actor,Integer duration,String country,String description,Date createdate,long pid,Integer cid);
}
