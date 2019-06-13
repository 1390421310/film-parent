package com.zh.service;

import java.util.List;

import com.zh.pojo.Category;

public interface CategoryService {
	/**
	 * 查询影片类别
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
	 * 根据id删除影片类别
	 * @param id
	 * @return
	 */
	int delCategory(Integer id);
	/**
	 * 根据id修改影片类别
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
