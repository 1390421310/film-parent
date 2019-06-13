package com.zh.dubbo.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zh.dubbo.service.FilmHotDubboService;
import com.zh.mapper.FilmHotMapper;
import com.zh.pojo.FilmHot;

public class FilmHotDubboServiceImpl implements FilmHotDubboService{
	@Autowired
	private FilmHotMapper filmHotMapper;
	@Override
	public List<FilmHot> selAllFilmHot() {
		// TODO Auto-generated method stub
		return filmHotMapper.selAllFilmHot();
	}
	@Override
	public int delFilmHotById(Integer id) {
		// TODO Auto-generated method stub
		return filmHotMapper.delFilmHotById(id);
	}
	
	@Override
	public FilmHot selFilmHotById(Integer id) {
		// TODO Auto-generated method stub
		return filmHotMapper.selFilmHotById(id);
	}
	@Override
	public Integer insFilmHot(String name, String director, String actor, Integer duration, String country,
			String description, double score, Date createdate, long pid, Integer cid) {
		// TODO Auto-generated method stub
		return filmHotMapper.insFilmHot(name, director, actor, duration, country, description, score, createdate, pid, cid);
	}

}
