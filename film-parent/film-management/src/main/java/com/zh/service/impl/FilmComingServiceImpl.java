package com.zh.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zh.dubbo.service.CategoryDubboService;
import com.zh.dubbo.service.FilmComingDubboService;
import com.zh.dubbo.service.PhotoDubboService;
import com.zh.pojo.FilmComing;
import com.zh.service.FilmComingService;

@Service
public class FilmComingServiceImpl implements FilmComingService{
	@Reference
	private FilmComingDubboService filmComingDubboService;
	@Reference
	private PhotoDubboService photoDubboService;
	@Reference
	private CategoryDubboService categoryDubboService;
	@Override
	public List<FilmComing> selAllFilmComing() {
		List<FilmComing> list = filmComingDubboService.selAllFilmComing();
		for (FilmComing filmComing : list) {
			filmComing.setPhoto(photoDubboService.selPhotoById(filmComing.getPid()));
			filmComing.setCname(categoryDubboService.selNameById(filmComing.getCid()));
		}
		return list;
	}

	@Override
	public int delFilmComingById(Integer id) {
		// TODO Auto-generated method stub
		return filmComingDubboService.delFilmComingById(id);
	}

	@Override
	public FilmComing selFilmComingById(Integer id) {
		FilmComing filmComing = filmComingDubboService.selFilmComingById(id);
		filmComing.setPhoto(photoDubboService.selPhotoById(filmComing.getPid()));
		filmComing.setCname(categoryDubboService.selNameById(filmComing.getCid()));
		return filmComing;
	}

	@Override
	public Integer insFilmComing(String name, String director, String actor, Integer duration, String country,
			String description, Date createdate, long pid, Integer cid) {
		// TODO Auto-generated method stub
		return filmComingDubboService.insFilmComing(name, director, actor, duration, country, description, createdate, pid, cid);
	}
}
