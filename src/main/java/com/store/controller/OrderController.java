package com.store.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.store.entity.TaiKhoan;
import com.store.service.DonHangOnlineService;
import com.store.service.OrderService;
import com.store.service.TaiKhoanService;

@Controller
public class OrderController {
	@Autowired
	TaiKhoanService taiKhoanService;
	@Autowired
	DonHangOnlineService donHangOnlineService;
	@Autowired
	OrderService orderService;

	@RequestMapping("/order/checkout")
	public String checkout(HttpServletRequest request, Model model) {
		if (request.getRemoteUser() != null) {
			TaiKhoan user = taiKhoanService.getOne(request.getRemoteUser());
			model.addAttribute("USER", user);
		}
		return "order/checkout";
	}

	@RequestMapping("/donhang")
	public String donhang(HttpServletRequest request, Model model) {
		if (request.getRemoteUser() != null) {
			TaiKhoan user = taiKhoanService.getOne(request.getRemoteUser());
			model.addAttribute("USER", user);
		}
		String username = request.getRemoteUser();
		model.addAttribute("orders", donHangOnlineService.findByUsername(username));
		return "order/donhang";
	}

	@RequestMapping("/donhang/detail/{id}")
	public String chitietdonhang(@PathVariable("id") Integer id, HttpServletRequest request, Model model) {
		if (request.getRemoteUser() != null) {
			TaiKhoan user = taiKhoanService.getOne(request.getRemoteUser());
			model.addAttribute("USER", user);
		}
		model.addAttribute("dathang", donHangOnlineService.findById(id));
		return "order/chitietdonhang";
	}

	@RequestMapping("/order")
	public String order(HttpServletRequest request, Model model) {
		if (request.getRemoteUser() != null) {
			TaiKhoan user = taiKhoanService.getOne(request.getRemoteUser());
			model.addAttribute("USER", user);
		}
		return "order/view";
	}
}
