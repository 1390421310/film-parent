package com.zh.dubbo.service;

import java.util.List;

import com.zh.pojo.City;

public interface CityDubboService {
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
	Integer delCityById(Integer id);
	/**
	 * 添加城市
	 * @param name
	 * @return
	 */
	int insCity(String name);
}
