package com.zh.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zh.dubbo.service.AccordDubboService;
import com.zh.pojo.Accord;
import com.zh.service.AccordService;

@Service
public class AccordServiceImpl implements AccordService{
	@Reference
	private AccordDubboService accordDubboService;

	@Override
	public List<Accord> selAccordByFilm(String film) {
		// TODO Auto-generated method stub
		return accordDubboService.selAccordByFilm(film);
	}

	@Override
	public Accord selAccordById(Integer id) {
		// TODO Auto-generated method stub
		return accordDubboService.selAccordById(id);
	}
}
