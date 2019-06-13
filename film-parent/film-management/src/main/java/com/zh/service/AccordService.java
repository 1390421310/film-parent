package com.zh.service;

import java.util.List;

import com.zh.pojo.Accord;

public interface AccordService {
	List<Accord> selAccordByFilm(String film);
	
	Accord selAccordById(Integer id);
}
