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

import com.store.dao.ChiTietOrderDAO;
import com.store.entity.ChiTietOrder;
import com.store.service.ChiTietOrderService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/chitietorder")
public class ChiTietOrderRestController {
	@Autowired
	ChiTietOrderService chiTietOrderService;
	@Autowired
	ChiTietOrderDAO chiTietOrderDAO;
	
	@GetMapping()
	public List<ChiTietOrder> getAll() {
		return chiTietOrderService.findAll();
	}

	@GetMapping("{id}")
	public List<ChiTietOrder> getAllByOrder(@PathVariable("id") Integer id) {
		return chiTietOrderDAO.findChiTietByOrder(id);
	}

	@PostMapping
	public ChiTietOrder create(@RequestBody ChiTietOrder chiTietOrder) {
		return chiTietOrderService.save(chiTietOrder);
	}

	@PutMapping("{id}")
	public List<ChiTietOrder> updateAll(@PathVariable("id") Integer id, @RequestBody List<ChiTietOrder> chiTietOrder) {
		return chiTietOrderService.saveAll(chiTietOrder);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		chiTietOrderService.deleteById(id);
	}
	
}
