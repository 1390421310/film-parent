package com.zh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zh.pojo.Room;
import com.zh.service.CinemaService;
import com.zh.service.RoomService;

@Controller
public class RoomController {
	@Autowired
	private RoomService roomServiceImpl;
	@Autowired
	private CinemaService cinemaServiceImpl;
	@RequestMapping("selAllRoom")
	public String selAllRoom(Model model){
		model.addAttribute("list", roomServiceImpl.selAllRoom());
		return "showRoom.jsp";
	}
	@RequestMapping("pageSkipRoom")
	public String pageSkipRoom(Model model){
		model.addAttribute("list", cinemaServiceImpl.selAllCinema());
		return "addRoom.jsp";
	}
	@RequestMapping("insRoom")
	public String insRoom(Room room,Model model){
		if (roomServiceImpl.insRoom(room)==1) {
			model.addAttribute("flag", "true");
			return "selAllRoom";
		}
		model.addAttribute("flag", "false");
		return "selAllRoom";
	}
	@RequestMapping("delRoom")
	public String delRoom(Integer id,Model model){
		if (roomServiceImpl.delRoomById(id)==1) {
			model.addAttribute("temp", "true");
			return "selAllRoom";
		}
		model.addAttribute("temp", "false");
		return "selAllRoom";
	}	
	@RequestMapping("pageSkipModifyRoom")
	public String pageSkipRoom(Integer id,Model model){
		model.addAttribute("room", roomServiceImpl.selRoomById(id));
		return "modifyRoom.jsp";
	}
	@RequestMapping("modifyRoom")
	public String modifyRoom(Room room,Model model){
		if (roomServiceImpl.updRoom(room)==1) {
			model.addAttribute("var", "true");
			return "selAllRoom";
		}
		model.addAttribute("var", "false");
		return "selAllRoom";
	}
}
