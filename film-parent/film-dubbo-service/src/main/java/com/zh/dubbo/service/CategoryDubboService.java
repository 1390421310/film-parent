package com.zh.dubbo.service;

import java.util.List;

import com.zh.pojo.Category;

public interface CategoryDubboService {
	/**
	 * 查询全部影片类别
	 * @return
	 */
	List<Category> selAllCategory();
	/**
	 * 新增影片类别
	 * @param name
	 * @return
	 */
	int insCategory(String name);
	/**
	 * 删除影片类别
	 * @param id
	 * @return
	 */
	int delCategory(Integer id);
	/**
	 * 修改影片类别
	 * @param id
	 * @param name
	 * @return
	 */
	int updCategory(Integer id,String name);
	/**
	 * 根据id查询影片类别名称
	 * @param id
	 * @return
	 */
	String selNameById(Integer id);
}
