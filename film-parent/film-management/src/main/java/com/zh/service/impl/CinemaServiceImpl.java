package com.zh.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zh.dubbo.service.CinemaDubboService;
import com.zh.dubbo.service.CityDubboService;
import com.zh.pojo.Cinema;
import com.zh.service.CinemaService;

@Service
public class CinemaServiceImpl implements CinemaService{
	@Reference
	private CinemaDubboService cinemaDubboService;
	@Reference
	private CityDubboService cityDubboService;
	@Override
	public List<Cinema> selAllCinema() {
		// TODO Auto-generated method stub
		List<Cinema> list = cinemaDubboService.selAllCinema();
		for (Cinema cinema : list) {
			cinema.setCity(cityDubboService.selById(cinema.getCid()));
		}
		return list;
	}
	@Override
	public int selCinemaCountByCid(Integer id) {
		// TODO Auto-generated method stub
		return cinemaDubboService.selCinemaCountByCid(id);
	}
	@Override
	public int delCinemaByCid(Integer id) {
		// TODO Auto-generated method stub
		return cinemaDubboService.delCinemaByCid(id);
	}
	@Override
	public int delCinemaById(Integer id) {
		// TODO Auto-generated method stub
		return cinemaDubboService.delCinemaById(id);
	}
	@Override
	public int insCinema(Cinema cinema) {
		// TODO Auto-generated method stub
		return cinemaDubboService.insCinema(cinema);
	}
	@Override
	public Cinema selCinemaById(Integer id) {
		Cinema cinema = cinemaDubboService.selCinemaById(id);
		cinema.setCity(cityDubboService.selById(cinema.getCid()));
		return cinema;
	}
	@Override
	public int updCinema(Cinema cinema) {
		// TODO Auto-generated method stub
		return cinemaDubboService.updCinema(cinema);
	}
}
