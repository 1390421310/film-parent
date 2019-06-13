package com.zh.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.zh.pojo.Category;
import com.zh.pojo.FilmHot;
import com.zh.service.CategoryService;
import com.zh.service.FilmHotService;
import com.zh.service.PhotoService;
import com.zh.utils.FtpUtil;
import com.zh.utils.IDUtils;

@Controller
public class FilmHotController {
	@Autowired
	private FilmHotService filmHotServiceImpl;
	@Autowired
	private CategoryService categoryServiceImpl;
	@Autowired
	private PhotoService photoServiceImpl;
	@RequestMapping("selAllFilmHot")
	public String selAllFilmHot(Model model){
		model.addAttribute("list", filmHotServiceImpl.selAllFilmHot());
		return "showFilmHot.jsp";
	}
	@RequestMapping("delFilmHotById")
	public String delFilmHotById(Integer id){
		if (filmHotServiceImpl.delFilmHotById(id)==1) {
			return "selAllFilmHot";
		}
		return "selAllFilmHot";
	}
	@RequestMapping("pageSkipFilmHot")
	public String pageSkip(Model model){
		List<Category> list = categoryServiceImpl.selAllCategory();
		model.addAttribute("list", list);
		return "addHotFilm.jsp";	
	}
	@RequestMapping("information")
	public String information(Integer id,Model model){
		FilmHot filmHot = filmHotServiceImpl.selFilmHotById(id);
		model.addAttribute("filmhot", filmHot);
		return "/portal/view/info.jsp";
	}
	@RequestMapping("insFilmHot")
	public String insFilmHot(String name,String director,String actor,Integer duration,String country,String description,double score,Date createdate,Integer cid,MultipartFile file,Model model){
		long pid =IDUtils.genItemId();
		createdate = new Date(System.currentTimeMillis());
		String fileName = UUID.randomUUID()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		boolean result = false;
		try {
			result = FtpUtil.uploadFile("192.168.126.130", 21, "ftpuser","07200838","/home/ftpuser/", "/", fileName, file.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result) {
			if (photoServiceImpl.insPhoto(pid, fileName)==1) {
				if (filmHotServiceImpl.insFilmHot(name, director, actor, duration, country, description, score, createdate, pid, cid)==1) {
					return "selAllFilmHot";
				}	
			}
		}
		model.addAttribute("list", categoryServiceImpl.selAllCategory());
		return "addHotFilm.jsp";
	}
}
