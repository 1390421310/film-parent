package com.zh.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zh.service.CategoryService;

@Controller
public class CategoryController {
	@Autowired
	private CategoryService categoryServiceImpl;
	
	@RequestMapping("selAllCategory")
	public String selAllCategory(Model model){
		model.addAttribute("list", categoryServiceImpl.selAllCategory());
		return "showCategory.jsp";
	}
	@RequestMapping("insCategory")
	public String insCategory(String name,Model model){
		if (categoryServiceImpl.insCategory(name)==1) {
			model.addAttribute("var", "true");
			return "selAllCategory";
		}
		model.addAttribute("var", "false");
		return "selAllCategory";
	}
	@RequestMapping("delCategory")
	public String delCategory(Integer id,Model model){
		if (categoryServiceImpl.delCategory(id)==1) {
			model.addAttribute("flag", "true");
			return "selAllCategory";
		}
		model.addAttribute("flag", "false");
		return "selAllCategory";
	}
	@RequestMapping("modifyCategory")
	public String updCategory(Integer id,String name,Model model){
		if (categoryServiceImpl.updCategory(id, name)==1) {
			model.addAttribute("temp", "true");
			return "selAllCategory";
		}
		model.addAttribute("temp", "false");
		return "selAllCategory";
	}
	@RequestMapping("pageSkipCategory")
	public String pageSkip(Integer id,Model model){
		model.addAttribute("id", id);
		model.addAttribute("name", categoryServiceImpl.selNameById(id));			
		return "modifyCategory.jsp";
	}
}
