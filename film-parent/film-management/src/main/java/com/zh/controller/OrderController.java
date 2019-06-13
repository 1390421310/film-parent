package com.zh.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zh.pojo.Accord;
import com.zh.pojo.Order;
import com.zh.service.AccordService;
import com.zh.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderServiceImpl;
	@Autowired
	private AccordService accordServiceImpl;
	@RequestMapping("commit")
	@ResponseBody
	public String commit(Order order,Integer id,String seat,String times,Integer uid){
		Accord accord = accordServiceImpl.selAccordById(id);
		order.setFilm(accord.getFilm());
		order.setCinema(accord.getCinema());
		order.setRoom(accord.getRoom());
		order.setSeat(seat);
		order.setTimes(times);
		order.setPrice(accord.getPrice());
		order.setState("未支付");
		order.setUid(uid);
		String result = "";
		if (orderServiceImpl.selOrderByCinemaRoomSeat(accord.getCinema(), accord.getRoom(),seat,times)==null) {
			if (orderServiceImpl.insOrder(order)==1) {
				result = "success";
			}
		}else {
			result = "false";
		}
					
		return result;
	}
	@RequestMapping("showOrder")
	public String myorder(HttpSession session,Model model){
		Integer id = (Integer) session.getAttribute("id");
		List<Order> list = orderServiceImpl.selOrderByUid(id);
		model.addAttribute("list", list);
		return "/portal/view/myorder.jsp";
	}
	@RequestMapping("selAllOrder")
	public String selAllOrder(Model model){
		model.addAttribute("list", orderServiceImpl.selAllOrder());
		return "showOrder.jsp";
	}
	@RequestMapping("delOrder")
	public String exit(Integer id){
		orderServiceImpl.delOrder(id);
		return "showOrder";
	}
	@RequestMapping("pay")
	public String pay(Integer price,Model model){
		model.addAttribute("price", price);
		return "/portal/view/pay.jsp";
	}
}
