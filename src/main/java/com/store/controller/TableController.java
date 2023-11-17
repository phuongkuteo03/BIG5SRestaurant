package com.store.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.store.dao.BanDAO;
import com.store.dao.ChiTietOrderDAO;
import com.store.entity.Ban;
import com.store.entity.ChiTietOrder;
import com.store.entity.Order;
import com.store.entity.TaiKhoan;
import com.store.service.BanService;
import com.store.service.OrderService;
import com.store.service.TaiKhoanService;

@Controller
public class TableController {
	@Autowired
	TaiKhoanService taiKhoanService;
	@Autowired
	BanService banService;
	@Autowired
	BanDAO banDAO;
	@Autowired
	OrderService orderService;
	@Autowired
	ChiTietOrderDAO chiTietOrderDAO;

	@RequestMapping("/table")
	public String viewsTable(HttpServletRequest request, Model model) {
		if (request.getRemoteUser() != null) {
			TaiKhoan user = taiKhoanService.getOne(request.getRemoteUser());
			model.addAttribute("USER", user);
		}
		List<Ban> items = banService.findAll();
		model.addAttribute("items", items);
		return "table/view";
	}
	
	@RequestMapping("/table/detail/{id}")
	public String viewsDetailsTable(HttpServletRequest request, @PathVariable("id") Integer id, Model model) {
		if (request.getRemoteUser() != null) {
			TaiKhoan user = taiKhoanService.getOne(request.getRemoteUser());
			model.addAttribute("USER", user);
		}
		Ban ban = banService.findById(id);
		Order order = banDAO.getOrderByTable(ban);
		double amount = 0;
		for(ChiTietOrder cto: order.getChiTietOrder()) {
			amount += cto.getSoLuong() * cto.getGiaTien();	
		}
		model.addAttribute("amount",amount);
		model.addAttribute("idban",id);
		model.addAttribute("hoadon", banDAO.getOrderByTable(ban));
		return "table/details";
	}
}
