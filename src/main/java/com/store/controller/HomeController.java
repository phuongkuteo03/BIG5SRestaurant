package com.store.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.store.entity.TaiKhoan;
import com.store.service.MenuMonAnService;
import com.store.service.TaiKhoanService;

@Controller
public class HomeController {
    @Autowired
    TaiKhoanService taiKhoanService;
    @Autowired
    MenuMonAnService menuMonAnService;

    @RequestMapping({ "/", "/home/index" })
    public String home(HttpServletRequest request, Model model) throws Exception {
        if (request.getRemoteUser() != null) {
            TaiKhoan user = taiKhoanService.getOne(request.getRemoteUser());
            model.addAttribute("USER", user);
        }
        return "layout/index";
    }

    @RequestMapping({ "/admin", "/admin/home/index" })
    public String admin(HttpServletRequest request, Model model) {
        if (request.getRemoteUser() != null) {
            TaiKhoan user = taiKhoanService.getOne(request.getRemoteUser());
            model.addAttribute("USER", user);
        }
        return "redirect:/assets/admin/index.html";
    }

    @RequestMapping("/contact")
    public String contact(HttpServletRequest request, Model model) {
        if (request.getRemoteUser() != null) {
            TaiKhoan user = taiKhoanService.getOne(request.getRemoteUser());
            model.addAttribute("USER", user);
        }
        return "contact/view";
    }

    @RequestMapping("/about")
    public String about(HttpServletRequest request, Model model) {
        if (request.getRemoteUser() != null) {
            TaiKhoan user = taiKhoanService.getOne(request.getRemoteUser());
            model.addAttribute("USER", user);
        }
        return "about/view";
    }

    @RequestMapping("/news")
    public String news(HttpServletRequest request, Model model) {
        if (request.getRemoteUser() != null) {
            TaiKhoan user = taiKhoanService.getOne(request.getRemoteUser());
            model.addAttribute("USER", user);
        }
        return "news/view";
    }
}
