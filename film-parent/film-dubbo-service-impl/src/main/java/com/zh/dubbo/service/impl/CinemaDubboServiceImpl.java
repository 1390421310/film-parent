package com.zh.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zh.dubbo.service.CinemaDubboService;
import com.zh.mapper.CinemaMapper;
import com.zh.pojo.Cinema;

public class CinemaDubboServiceImpl implements CinemaDubboService{
	@Autowired
	private CinemaMapper cinemaMapper;
	@Override
	public List<Cinema> selAllCinema() {
		// TODO Auto-generated method stub
		return cinemaMapper.selAllCinema();
	}
	@Override
	public int selCinemaCountByCid(Integer id) {
		// TODO Auto-generated method stub
		return cinemaMapper.selCinemaCountByCid(id);
	}
	@Override
	public int delCinemaByCid(Integer id) {
		// TODO Auto-generated method stub
		return cinemaMapper.delCinemaByCid(id);
	}
	@Override
	public int delCinemaById(Integer id) {
		// TODO Auto-generated method stub
		return cinemaMapper.delCinemaById(id);
	}
	@Override
	public int insCinema(Cinema cinema) {
		// TODO Auto-generated method stub
		return cinemaMapper.insCinema(cinema);
	}
	@Override
	public Cinema selCinemaById(Integer id) {
		// TODO Auto-generated method stub
		return cinemaMapper.selCinemaById(id);
	}
	@Override
	public int updCinema(Cinema cinema) {
		// TODO Auto-generated method stub
		return cinemaMapper.updCinema(cinema);
	}
}
