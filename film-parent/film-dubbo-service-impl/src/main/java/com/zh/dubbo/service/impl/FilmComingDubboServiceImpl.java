package com.zh.dubbo.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zh.dubbo.service.FilmComingDubboService;
import com.zh.mapper.FilmComingMapper;
import com.zh.pojo.FilmComing;

public class FilmComingDubboServiceImpl implements FilmComingDubboService{
	@Autowired
	private FilmComingMapper filmComingMapper; 
	@Override
	public List<FilmComing> selAllFilmComing() {
		// TODO Auto-generated method stub
		return filmComingMapper.selAllFilmComing();
	}

	@Override
	public int delFilmComingById(Integer id) {
		// TODO Auto-generated method stub
		return filmComingMapper.delFilmComingById(id);
	}

	@Override
	public FilmComing selFilmComingById(Integer id) {
		// TODO Auto-generated method stub
		return filmComingMapper.selFilmComingById(id);
	}

	@Override
	public Integer insFilmComing(String name, String director, String actor, Integer duration, String country,
			String description, Date createdate, long pid, Integer cid) {
		// TODO Auto-generated method stub
		return filmComingMapper.insFilmComing(name, director, actor, duration, country, description, createdate, pid, cid);
	}

}
