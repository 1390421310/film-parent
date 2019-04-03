package com.zh.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zh.pojo.NewsComment;
import com.zh.service.impl.NewsCommentServiceImpl;

@Controller
public class NewsCommentController {
	@Resource
	private NewsCommentServiceImpl newsCommentServiceImpl;
	@RequestMapping("showComment/{newsid}")
	public String showComment(@PathVariable Integer newsid,Model model){
		model.addAttribute("list", newsCommentServiceImpl.selCommentByNewsID(newsid));
		return "/showComment.jsp";
	}
	@RequestMapping("addComment/{newsid}/{content}/{author}")
	public String addComment(NewsComment newsComment,Model model){
		newsComment.setCreateDate(new Date());
		newsCommentServiceImpl.insComment(newsComment);
		return "/showComment"+"/"+newsComment.getNewsid();
	}
	@RequestMapping("addCommentController/{newsid}")
	public String addCommentController(@PathVariable Integer newsid,Model model){
		model.addAttribute("newsid", newsid);
		return "/addComment.jsp";
	}
}
