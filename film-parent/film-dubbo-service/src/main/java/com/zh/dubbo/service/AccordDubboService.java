package com.zh.dubbo.service;

import java.util.List;

import com.zh.pojo.Accord;

public interface AccordDubboService {
	/**
	 * 根据影片名称查询放映记录
	 * @param film
	 * @return
	 */
	List<Accord> selAccordByFilm(String film);
	/**
	 * 根据id查询放映记录
	 * @param id
	 * @return
	 */
	Accord selAccordById(Integer id);
}
