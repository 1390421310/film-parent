package com.zh.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zh.dubbo.service.CityDubboService;
import com.zh.pojo.City;
import com.zh.service.CityService;

@Service
public class CityServiceImpl implements CityService{
	@Reference
	private CityDubboService cityDubboServiceImpl;
	@Override
	public List<City> selAllCity() {
		// TODO Auto-generated method stub
		return cityDubboServiceImpl.selAllCity();
	}
	@Override
	public City selById(Integer id) {
		// TODO Auto-generated method stub
		return cityDubboServiceImpl.selById(id);
	}
	@Override
	public int delCityById(Integer id) {
		// TODO Auto-generated method stub
		return cityDubboServiceImpl.delCityById(id);
	}
	@Override
	public int insCity(String name) {
		// TODO Auto-generated method stub
		return cityDubboServiceImpl.insCity(name);
	}

}
