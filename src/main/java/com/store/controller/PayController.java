package com.store.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.store.entity.TaiKhoan;
import com.store.service.TaiKhoanService;

@Controller
public class PayController {
	@Autowired
	TaiKhoanService taiKhoanService;

	@RequestMapping("/pay")
	public String pays(HttpServletRequest request, Model model) {
		if (request.getRemoteUser() != null) {
			TaiKhoan user = taiKhoanService.getOne(request.getRemoteUser());
			model.addAttribute("USER", user);
		}
		return "pay/view";
	}
}
