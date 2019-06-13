package com.zh.service;

import java.util.List;

import com.zh.pojo.Cinema;

public interface CinemaService {
	List<Cinema> selAllCinema();
	
	int selCinemaCountByCid(Integer id);
	
	int delCinemaByCid(Integer id);
	
	int delCinemaById(Integer id);
	
	int insCinema(Cinema cinema);
	
	Cinema selCinemaById(Integer id);
	
	int updCinema(Cinema cinema);
}
