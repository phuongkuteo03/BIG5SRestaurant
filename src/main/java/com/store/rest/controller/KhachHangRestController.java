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

import com.store.entity.KhachHang;
import com.store.service.KhachHangService;



@CrossOrigin("*")
@RestController
@RequestMapping("/rest/khachhang")
public class KhachHangRestController {
	@Autowired
    KhachHangService khachHangService;

	@GetMapping()
	public List<KhachHang> getAll() {
		return khachHangService.findAll();
	}

	@GetMapping("{id}")
	public KhachHang getOne(@PathVariable("id") Integer id) {
		return khachHangService.findById(id);
	}

	@PostMapping
	public KhachHang create(@RequestBody KhachHang KhachHang) {
		return khachHangService.save(KhachHang);
	}

	@PutMapping("{id}")
	public KhachHang update(@PathVariable("id") Integer id, @RequestBody KhachHang KhachHang) {
		return khachHangService.save(KhachHang);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		khachHangService.deleteById(id);
	}
}
