package com.zh.controller;

import java.sql.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zh.service.CommentService;
import com.zh.service.OrderService;

@Controller
public class CommentController {
	@Autowired
	private CommentService commentServiceImpl;
	@Autowired
	private OrderService orderServiceImpl;
	@RequestMapping("selAllComment")
	public String selAllComment(Model model){
		model.addAttribute("list", commentServiceImpl.selAllComment());
		return "showComment.jsp";
	}
	@RequestMapping("pageskipComment")
	public String page(Integer id,Model model){
		String fname = orderServiceImpl.selFilmById(id);
		model.addAttribute("fname", fname);
		return "/portal/view/comment.jsp";
	}
	@RequestMapping("addComment")
	public String addComment(String fname,String content,String uname){
		System.out.println(fname);
		Date date = new Date(System.currentTimeMillis());
		commentServiceImpl.insComment(fname, uname, content, date);
		return "redirect:/portal/view/index.jsp";
	}
	@RequestMapping("delComment")
	public String delComment(Integer id,Model model){
		if (commentServiceImpl.delComment(id)==1) {
			model.addAttribute("flag", "true");
			return "selAllComment";
		}
		model.addAttribute("flag", "false");
		return "selAllComment";
	}
}
