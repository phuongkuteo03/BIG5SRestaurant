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

import com.store.dao.ChiTietDonHangOnlineDAO;
import com.store.entity.ChiTietDonHangOnline;
import com.store.service.ChiTietDonHangOnlineService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/chitietdonhangonline")
public class ChiTietDonHangOnlineRestController {
	@Autowired
    ChiTietDonHangOnlineService chiTietDonHangOnlineService;
	
	@Autowired
	ChiTietDonHangOnlineDAO chiTietDonHangOnlineDAO;

	@GetMapping()
	public List<ChiTietDonHangOnline> getAll() {
		return chiTietDonHangOnlineService.findAll();
	}

	@GetMapping("{id}")
	public List<ChiTietDonHangOnline> getAllDonHangOnline(@PathVariable("id") Integer id) {
		return chiTietDonHangOnlineDAO.findChiTietByDonHangOnline(id);
	}

	@PostMapping
	public ChiTietDonHangOnline create(@RequestBody ChiTietDonHangOnline chiTietDonHangOnline) {
		return chiTietDonHangOnlineService.save(chiTietDonHangOnline);
	}

	@PutMapping("{id}")
	public ChiTietDonHangOnline update(@PathVariable("id") Integer id, @RequestBody ChiTietDonHangOnline chiTietDonHangOnline) {
		return chiTietDonHangOnlineService.save(chiTietDonHangOnline);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		chiTietDonHangOnlineService.deleteById(id);
	}
}
