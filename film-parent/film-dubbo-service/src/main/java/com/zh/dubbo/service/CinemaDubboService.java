package com.zh.dubbo.service;

import java.util.List;

import com.zh.pojo.Cinema;

public interface CinemaDubboService {
	/**
	 * 查询全部影院
	 * @return
	 */
	List<Cinema> selAllCinema();
	/**
	 * 根据城市id查询该城市下的影院数量
	 * @param id
	 * @return
	 */
	int selCinemaCountByCid(Integer id);
	/**
	 * 根据城市id删除影院
	 * @param id
	 * @return
	 */
	int delCinemaByCid(Integer id);
	/**
	 * 根据id删除影院
	 * @param id
	 * @return
	 */
	int delCinemaById(Integer id);
	/**
	 * 新增影院
	 * @param cinema
	 * @return
	 */
	int insCinema(Cinema cinema);
	/**
	 * 根据id查询影院
	 * @param id
	 * @return
	 */
	Cinema selCinemaById(Integer id);
	/**
	 * 修改影院信息
	 * @param cinema
	 * @return
	 */
	int updCinema(Cinema cinema);
}
