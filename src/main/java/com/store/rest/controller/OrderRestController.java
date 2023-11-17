package com.store.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.store.dao.BanDAO;
import com.store.dao.OrderDAO;
import com.store.entity.Ban;
import com.store.entity.ChiTietOrder;
import com.store.entity.Order;
import com.store.service.BanService;
import com.store.service.OrderService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/order")
public class OrderRestController {
	@Autowired
	OrderService orderService;
	@Autowired
	OrderDAO orderDAO;
	@Autowired
	BanService banService;
	@Autowired
	BanDAO banDAO;

	@GetMapping()
	public List<Order> getAll() {
		return orderService.findAll();
	}

	@GetMapping("{id}")
	public List<ChiTietOrder> findChiTietByOrder(@PathVariable("id") Integer id) {
		Ban ban = banService.findById(id);
		Order order = banDAO.getOrderByTable(ban);
		return orderDAO.findChiTietByOrder(order.getId());
	}

	@PostMapping()
	public Order create(@RequestBody JsonNode order) {
		return orderService.create(order);
	}

	@PutMapping("{id}")
	public Order update(@PathVariable("id") Integer id, @RequestBody Order order) {
		return orderService.save(order);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		orderService.deleteById(id);
	}
}
