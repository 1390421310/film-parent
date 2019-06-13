package com.zh.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zh.pojo.Cinema;
import com.zh.service.CinemaService;
import com.zh.service.CityService;
import com.zh.service.RoomService;

@Controller
public class CinemaController {
	@Autowired
	private CinemaService cinemaServiceImpl;
	@Autowired
	private CityService cityServiceImpl;
	@Autowired
	private RoomService roomServiceImpl;
	@RequestMapping("selAllCinema")
	public String selAllCinema(Model model){
		model.addAttribute("list", cinemaServiceImpl.selAllCinema());
		return "showCinema.jsp";
	}
	@RequestMapping("delCinema")
	public String delCinema(Integer id,Model model){
		if (roomServiceImpl.selCountByCid(id)==roomServiceImpl.delRoomByCid(id)) {
			if (cinemaServiceImpl.delCinemaById(id)==1) {
				model.addAttribute("flag", "true");
				return "selAllCinema";
			}
		}
		model.addAttribute("flag", "false");
		return "selAllCinema";
	}
	@RequestMapping("insCinema")
	public String insCinema(Cinema cinema,Model model){
		if (cinemaServiceImpl.insCinema(cinema)==1) {
			model.addAttribute("var", "true");
			return "selAllCinema";
		}
		model.addAttribute("var", "false");
		return "selAllCinema";
	}
	@RequestMapping("pageSkipCinema")
	public String pageSkip(Integer id,Model model){
		model.addAttribute("id", id);
		model.addAttribute("cinema", cinemaServiceImpl.selCinemaById(id));
		model.addAttribute("list", cityServiceImpl.selAllCity());
		return "modifyCinema.jsp";
	}
	@RequestMapping("modifyCinema")
	public String modifyCinema(Cinema cinema,Model model){
		if (cinemaServiceImpl.updCinema(cinema)==1) {
			model.addAttribute("temp", "true");
			model.addAttribute("list", cinemaServiceImpl.selAllCinema());
			return "showCinema.jsp";
		}
		model.addAttribute("temp", "false");
		model.addAttribute("list", cinemaServiceImpl.selAllCinema());
		return "showCinema.jsp";
	}
}
