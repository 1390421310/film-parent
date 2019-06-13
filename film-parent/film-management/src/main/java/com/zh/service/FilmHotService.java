package com.zh.service;

import java.sql.Date;
import java.util.List;


import com.zh.pojo.FilmHot;

public interface FilmHotService {
	List<FilmHot> selAllFilmHot();
	
	int delFilmHotById(Integer id);
	
	Integer insFilmHot(String name,String director,String actor,Integer duration,String country,String description,double score,Date createdate,long pid,Integer cid);
	
	FilmHot selFilmHotById(Integer id);
}
