package com.zh.dubbo.service;

import java.sql.Date;
import java.util.List;

import com.zh.pojo.FilmHot;

public interface FilmHotDubboService {
	/**
	 * 查询全部正在热映影片
	 * @return
	 */
	List<FilmHot> selAllFilmHot();
	/**
	 * 根据id删除正在热映影片
	 * @param id
	 * @return
	 */
	int delFilmHotById(Integer id);
	/**
	 * 新增正在热映影片
	 * @param name
	 * @param director
	 * @param actor
	 * @param duration
	 * @param country
	 * @param description
	 * @param score
	 * @param createdate
	 * @param pid
	 * @param cid
	 * @return
	 */
	Integer insFilmHot(String name,String director,String actor,Integer duration,String country,String description,double score,Date createdate,long pid,Integer cid);
	/**
	 * 根据id查询影片信息
	 * @param id
	 * @return
	 */
	FilmHot selFilmHotById(Integer id);
}
