package com.zh.dubbo.service;

import java.sql.Date;
import java.util.List;

import com.zh.pojo.FilmComing;

public interface FilmComingDubboService {
	/**
	 * 查询全部即将上映影片
	 * @return
	 */
	List<FilmComing> selAllFilmComing();
	/**
	 * 根据id删除即将上映影片
	 * @param id
	 * @return
	 */
	int delFilmComingById(Integer id);
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	FilmComing selFilmComingById(Integer id);
	/**
	 * 新增即将上映影片
	 * @param name
	 * @param director
	 * @param actor
	 * @param duration
	 * @param country
	 * @param description
	 * @param createdate
	 * @param pid
	 * @param cid
	 * @return
	 */
	Integer insFilmComing(String name,String director,String actor,Integer duration,String country,String description,Date createdate,long pid,Integer cid);
}
