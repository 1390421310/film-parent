package com.zh.service;

import java.util.List;

import com.zh.pojo.City;

public interface CityService {
	/**
	 * 查询全部城市
	 * @return
	 */
	List<City> selAllCity();
	/**
	 * 根据id查询城市
	 * @param id
	 * @return
	 */
	City selById(Integer id);
	/**
	 * 根据id删除城市
	 * @param id
	 * @return
	 */
	int delCityById(Integer id);
	/**
	 * 新增城市
	 * @param name
	 * @return
	 */
	int insCity(String name);
}
