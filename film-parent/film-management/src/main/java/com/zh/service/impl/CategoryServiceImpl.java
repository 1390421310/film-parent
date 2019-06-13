package com.zh.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zh.dubbo.service.CategoryDubboService;
import com.zh.pojo.Category;
import com.zh.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Reference
	private CategoryDubboService categoryDubboServiceImpl;
	@Override
	public List<Category> selAllCategory() {
		// TODO Auto-generated method stub
		return categoryDubboServiceImpl.selAllCategory();
	}
	@Override
	public int insCategory(String name) {
		// TODO Auto-generated method stub
		return categoryDubboServiceImpl.insCategory(name);
	}
	@Override
	public int delCategory(Integer id) {
		// TODO Auto-generated method stub
		return categoryDubboServiceImpl.delCategory(id);
	}
	@Override
	public int updCategory(Integer id, String name) {
		// TODO Auto-generated method stub
		return categoryDubboServiceImpl.updCategory(id, name);
	}
	@Override
	public String selNameById(Integer id) {
		// TODO Auto-generated method stub
		return categoryDubboServiceImpl.selNameById(id);
	}

}
