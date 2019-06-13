package com.zh.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zh.dubbo.service.AccordDubboService;
import com.zh.mapper.AccordMapper;
import com.zh.pojo.Accord;

public class AccordDubboServiceImpl implements AccordDubboService{
	@Autowired
	private AccordMapper  accordMapper;

	@Override
	public List<Accord> selAccordByFilm(String film) {
		// TODO Auto-generated method stub
		return accordMapper.selAccordByFilm(film);
	}

	@Override
	public Accord selAccordById(Integer id) {
		// TODO Auto-generated method stub
		return accordMapper.selAccordById(id);
	}
}
