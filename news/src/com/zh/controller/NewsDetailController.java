package com.zh.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zh.service.impl.NewsDetailServiceImpl;

@Controller
public class NewsDetailController {
	@Resource
	private NewsDetailServiceImpl newsDetailServiceImpl;
	
	@RequestMapping("show")
	public ModelAndView selAll(){
		ModelAndView mav = new ModelAndView("/show.jsp");
		mav.addObject("list", newsDetailServiceImpl.selAll());
		return mav;
	}
	@RequestMapping("search")
	public ModelAndView selByTitle(@RequestParam("title") String title){
		ModelAndView mav = new ModelAndView("/show.jsp");
		//String title = (String) req.getAttribute("title");
		mav.addObject("title",title);
		mav.addObject("list", newsDetailServiceImpl.selByTitle(title));
		return mav;
	}
	@RequestMapping("delete/{newsid}")
	public String delete(@PathVariable Integer newsid,Model model){
		model.addAttribute("flag", newsDetailServiceImpl.delNewsAndComment(newsid));
		model.addAttribute("list", newsDetailServiceImpl.selAll());
		return "redirect:/show.jsp";
	}
}
