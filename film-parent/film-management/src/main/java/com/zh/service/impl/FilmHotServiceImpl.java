package com.zh.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zh.dubbo.service.CategoryDubboService;
import com.zh.dubbo.service.FilmHotDubboService;
import com.zh.dubbo.service.PhotoDubboService;
import com.zh.pojo.FilmHot;
import com.zh.service.FilmHotService;

@Service
public class FilmHotServiceImpl implements FilmHotService{
	@Reference
	private FilmHotDubboService filmHotDubboService;
	@Reference
	private PhotoDubboService photoDubboService;
	@Reference
	private CategoryDubboService categoryDubboService;
	@Override
	public List<FilmHot> selAllFilmHot() {
		List<FilmHot> list = filmHotDubboService.selAllFilmHot();
		for (FilmHot filmHot : list) {
			filmHot.setPhoto(photoDubboService.selPhotoById(filmHot.getPid()));
			filmHot.setCname(categoryDubboService.selNameById(filmHot.getCid()));
		}
		return list;
	}
	@Override
	public int delFilmHotById(Integer id) {
		// TODO Auto-generated method stub
		return filmHotDubboService.delFilmHotById(id);
	}
	
	@Override
	public FilmHot selFilmHotById(Integer id) {
		FilmHot filmHot = filmHotDubboService.selFilmHotById(id);
		filmHot.setPhoto(photoDubboService.selPhotoById(filmHot.getPid()));
		filmHot.setCname(categoryDubboService.selNameById(filmHot.getCid()));
		return filmHot;
	}
	@Override
	public Integer insFilmHot(String name, String director, String actor, Integer duration, String country,
			String description, double score, Date createdate, long pid, Integer cid) {
		// TODO Auto-generated method stub
		return filmHotDubboService.insFilmHot(name, director, actor, duration, country, description, score, createdate, pid, cid);
	}
	
	
}
