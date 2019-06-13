package com.zh.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zh.pojo.Users;
import com.zh.service.AccordService;
import com.zh.service.CinemaService;
import com.zh.service.FilmComingService;
import com.zh.service.FilmHotService;
import com.zh.service.UsersService;

@Controller
public class UsersController {
	
	@Autowired
	private UsersService usersServiceImpl;
	@Autowired
	private FilmHotService filmHotServiceImpl;
	@Autowired
	private AccordService accordServiceImpl;
	@Autowired
	private CinemaService cinemaServiceImpl;
	@Autowired
	private FilmComingService filmComingServiceImpl;
	/*
	 * 查询全部用户
	 */
	@RequestMapping("selAllUser")
	public String selAllUser(Model model){
		model.addAttribute("list",usersServiceImpl.selAllUser());
		return "showUser.jsp";
	}
	/*
	 * 登录验证
	 */
	@RequestMapping("userlogin")
	@ResponseBody
	public String userlogin(String name,String password,String code,HttpSession session){
		String codeSession = session.getAttribute("code").toString();
		String result = "";
		List<Users> list = usersServiceImpl.selUserByNameAndPwd(name, password);
		if(codeSession.equals(code)){
			if(list.size()!=0){
				result = "success";
				session.setAttribute("name", name);
				session.setAttribute("id",list.get(0).getId());
				session.setAttribute("hot",filmHotServiceImpl.selAllFilmHot());
				session.setAttribute("cinema",cinemaServiceImpl.selAllCinema());
				return result;
			}else {
				return result;
			}
		}
		result = "false";
		return result;
	}
	/*
	 * 根据id查询个人信息
	 */
	@RequestMapping("selUserById")
	public String selUserById(Integer id,Model model){
		List<Users> list = usersServiceImpl.selUserById(id);
		model.addAttribute("list", list);
		return "/portal/view/information.jsp";
	}
	/*
	 * 修改个人信息时的跳转方法
	 */
	@RequestMapping("pageSkipInformation")
	public String pageSkipInformation(Integer id,Model model){
		model.addAttribute("id", id);
		return "/portal/view/modifyInformation.jsp";
	}
	/*
	 * 注销账户
	 */
	@RequestMapping("delUser")
	public String delUser(Integer id,HttpSession session){
		if (usersServiceImpl.delUser(id)==1) {		
			session.removeAttribute("name");
		}
		return "redirect:/portal/view/index.jsp";
	}
	/*
	 * 修改个人信息
	 */
	@RequestMapping("modifyInformation")
	@ResponseBody
	public String modifyInformarion(Integer id, String name, String password, String phone, String email,HttpSession session){
		String result = "";
		int i = usersServiceImpl.updUserById(id, name, password, phone, email);
		if (i==1) {
			result = "success";
			session.removeAttribute("name");			
		}
		return result;
	}
	/*
	 * 退出登录
	 */
	@RequestMapping("logout")
	public String logout(HttpSession session){
		session.removeAttribute("name");
		return "redirect:/portal/view/index.jsp";
	}
	/*
	 * 用户注册
	 */
	@RequestMapping("register")
	@ResponseBody
	public String register(Users users,String code,HttpSession session){
		String codeSession = session.getAttribute("code").toString();
		String result = "";
		List<Users> list = usersServiceImpl.selUserByName(users.getName());
		if(codeSession.equals(code)){
			if (list.size()==0) {
				if (usersServiceImpl.register(users)==1) {
					result = "success";
					return result;
				}
			}else {
				return result ;
			}
		}
		result = "false";
		return result;
	}
	/*
	 * 购票页面跳转
	 */
	@RequestMapping("buyPage")
	public String buy(Integer id,Model model){
		model.addAttribute("filmhot",filmHotServiceImpl.selFilmHotById(id));
		model.addAttribute("accord", accordServiceImpl.selAccordByFilm(filmHotServiceImpl.selFilmHotById(id).getName()));
		return "/portal/view/buy.jsp";
	}
	/*
	 * 修改密码
	 */
	@RequestMapping("modifyPassWord")
	@ResponseBody
	public String modifyPwd(String name,String password){
		String result = "";
		if (usersServiceImpl.updPassWordByName(name, password)==1) {
			result = "success";
		}
		return result;
	}
	/*
	 * 展示全部热映影片
	 */
	@RequestMapping("filmhot")
	public String filmhot(Model model){
		model.addAttribute("list", filmHotServiceImpl.selAllFilmHot());
		return "/portal/view/filmhot.jsp";
	}
	@RequestMapping("filmcoming")
	public String filmcoming(Model model){
		model.addAttribute("list", filmComingServiceImpl.selAllFilmComing());
		return "/portal/view/filmcoming.jsp";
	}
}
