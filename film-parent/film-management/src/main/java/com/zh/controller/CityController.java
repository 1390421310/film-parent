package com.zh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zh.service.CinemaService;
import com.zh.service.CityService;

@Controller
public class CityController {
	@Autowired
	private CityService cityServiceImpl;
	@Autowired
	private CinemaService cinemaServiceImpl;
	
	@RequestMapping("queryAllCity")
	public String queryAllCity(Model model){
		model.addAttribute("list", cityServiceImpl.selAllCity());
		return "addCinema.jsp";
	}
	@RequestMapping("selAllCity")
	public String selAllCity(Model model){
		model.addAttribute("list", cityServiceImpl.selAllCity());
		return "showCity.jsp";
	}
	@RequestMapping("delCity")
	public String delCityById(Integer id,Model model){
		if (cinemaServiceImpl.selCinemaCountByCid(id)==cinemaServiceImpl.delCinemaByCid(id)) {
			if (cityServiceImpl.delCityById(id)==1) {
				model.addAttribute("flag", "true");
				return "selAllCity";
			}
		}
		model.addAttribute("flag", "false");
		return "selAllCity";
	}
	@RequestMapping("insCity")
	public String addCity(String name,Model model){
		if (cityServiceImpl.insCity(name)==1) {
			model.addAttribute("temp", "true");
			return "selAllCity";
		}
		model.addAttribute("temp", "false");
		return "selAllCity";
	}
}
