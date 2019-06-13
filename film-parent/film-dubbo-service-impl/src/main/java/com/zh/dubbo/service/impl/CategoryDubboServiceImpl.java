package com.zh.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zh.dubbo.service.CategoryDubboService;
import com.zh.mapper.CategoryMapper;
import com.zh.pojo.Category;

public class CategoryDubboServiceImpl implements CategoryDubboService{
	@Autowired
	private CategoryMapper categoryMapper;
	@Override
	public List<Category> selAllCategory() {
		// TODO Auto-generated method stub
		return categoryMapper.selAllCategory();
	}
	@Override
	public int insCategory(String name) {
		// TODO Auto-generated method stub
		return categoryMapper.insCategory(name);
	}
	@Override
	public int delCategory(Integer id) {
		// TODO Auto-generated method stub
		return categoryMapper.delCategory(id);
	}
	@Override
	public int updCategory(Integer id,String name) {
		// TODO Auto-generated method stub
		return categoryMapper.updCategory(id, name);
	}
	@Override
	public String selNameById(Integer id) {
		// TODO Auto-generated method stub
		return categoryMapper.selNameById(id);
	}

}
