package com.zh.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zh.pojo.SysUsers;
import com.zh.service.SysUsersService;



@Controller
public class SysUsersController {
	@Autowired
	private SysUsersService sysUsersServiceImpl;
	@RequestMapping("login")
	public String show(String name,String password,HttpSession session){
		List<SysUsers> list = sysUsersServiceImpl.selByNameAndPwd(name, password);
		if (list.size()!=0) {
			session.setAttribute("sysname", name);
			return "main.jsp";
		}else {
			return "index.jsp";
		}
	}
	
	@RequestMapping("modifyPwd")
	public String modify(String name,String password,Model model){
		int temp=sysUsersServiceImpl.updSysUsersPwd(name, password);
		if (temp==1) {
			return "index.jsp";
		}
		return "main.jsp";
	}
}
