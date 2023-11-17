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

import com.store.entity.MatHang;
import com.store.service.MatHangService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/mathang")
public class MatHangRestController {
	@Autowired
	MatHangService matHangService;
	
	@GetMapping()
	public List<MatHang> getAll() {
		return matHangService.findAll();
	}

	@GetMapping("{id}")
	public MatHang getOne(@PathVariable("id") Integer id) {
		return matHangService.findById(id);
	}

	@PostMapping
	public MatHang create(@RequestBody MatHang matHang) {
		return matHangService.save(matHang);
	}

	@PutMapping("{id}")
	public MatHang update(@PathVariable("id") Integer id, @RequestBody MatHang matHang) {
		return matHangService.save(matHang);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		matHangService.deleteById(id);
	}
}
