package com.zh.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zh.dubbo.service.CityDubboService;
import com.zh.mapper.CityMapper;
import com.zh.pojo.City;

public class CityDubboServiceImpl implements CityDubboService{
	@Autowired
	private CityMapper cityMapper;
	@Override
	public List<City> selAllCity() {
		// TODO Auto-generated method stub
		return cityMapper.selAllCity();
	}
	@Override
	public City selById(Integer id) {
		// TODO Auto-generated method stub
		return cityMapper.selById(id);
	}
	@Override
	public Integer delCityById(Integer id) {
		// TODO Auto-generated method stub
		return cityMapper.delCityById(id);
	}
	@Override
	public int insCity(String name) {
		// TODO Auto-generated method stub
		return cityMapper.insCity(name);
	}

}
