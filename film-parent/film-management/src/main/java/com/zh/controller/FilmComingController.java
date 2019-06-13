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
import com.zh.pojo.FilmComing;
import com.zh.service.CategoryService;
import com.zh.service.FilmComingService;
import com.zh.service.PhotoService;
import com.zh.utils.FtpUtil;
import com.zh.utils.IDUtils;

@Controller
public class FilmComingController {
	@Autowired
	private FilmComingService filmComingServiceImpl;
	@Autowired
	private CategoryService categoryServiceImpl;
	@Autowired
	private PhotoService photoServiceImpl;
	@RequestMapping("selAllFilmComing")
	public String selAllFilmComing(Model model){
		List<FilmComing> list = filmComingServiceImpl.selAllFilmComing();
			model.addAttribute("list", list);
			return "showFilmComing.jsp";
	}
	@RequestMapping("delFilmComingById")
	public String delFilmComingById(Integer id,Model model){
		int i = filmComingServiceImpl.delFilmComingById(id);
		if (i==1) {
			return "selAllFilmComing";
		}else {
			return "selAllFilmComing";
		}
	}
	@RequestMapping("info")
	public String info(Integer id,Model model){
		FilmComing filmComing = filmComingServiceImpl.selFilmComingById(id);
		model.addAttribute("filmcoming", filmComing);
		return "/portal/view/info2.jsp";
	}
	@RequestMapping("pageSkipFilmComing")
	public String pageSkip(Model model){
		List<Category> list = categoryServiceImpl.selAllCategory();
		model.addAttribute("list", list);
		return "addComingFilm.jsp";	
	}
	@RequestMapping("insFilmComing")
	public String insFilmComing(String name,String director,String actor,Integer duration,String country,String description,Date createdate,Integer cid,MultipartFile file,Model model){
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
				if (filmComingServiceImpl.insFilmComing(name, director, actor, duration, country, description,createdate, pid, cid)==1) {
					return "selAllFilmComing";
				}	
			}
		}
		model.addAttribute("list", categoryServiceImpl.selAllCategory());
		return "addComingFilm.jsp";
	}
}
