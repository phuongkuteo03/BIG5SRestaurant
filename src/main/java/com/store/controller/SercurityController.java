package com.store.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.store.entity.TaiKhoan;
import com.store.service.TaiKhoanService;

@Controller
public class SercurityController {
	@Autowired
	TaiKhoanService taiKhoanService;

	@RequestMapping("/security/login/form")
	public String loginForm(Model model) {
		model.addAttribute("message", "Vui lòng đăng nhập!");
		return "security/login";
	}

	@RequestMapping("/security/login/success")
	public String loginSuccess(HttpServletRequest request, Model model) {
		TaiKhoan user = taiKhoanService.getOne(request.getRemoteUser());
		model.addAttribute("USER", user);
		model.addAttribute("message", "Đăng nhập thành công!");
		return "layout/index";
	}

	@RequestMapping("/security/login/error")
	public String loginError(Model model) {
		model.addAttribute("message", "Sai thông tin đăng nhâp!");
		return "security/login";
	}

	@RequestMapping("/security/unauthoried")
	public String unauthoried(Model model) {
		model.addAttribute("message", "Không có quyền truy xuất!");
		return "security/login";
	}

	@RequestMapping("/security/logoff/success")
	public String logoffSuccess(Model model) {
		model.addAttribute("message", "Bạn đã đăng xuất!");
		return "security/login";
	}

	// OAuth 2
	@RequestMapping("/oauth2/login/success")
	public String success(OAuth2AuthenticationToken oauth2) {
		taiKhoanService.loginFromOAuth2(oauth2);
		return "forward:/security/login/success";
	}

	@RequestMapping("/security/register")
	public String register(Model model) {
		return "security/register";
	}
}
