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

import com.store.entity.DanhMuc;
import com.store.service.DanhMucService;


@CrossOrigin("*")
@RestController
@RequestMapping("/rest/danhmuc")
public class DanhMucRestController {
	@Autowired
	DanhMucService danhMucService;
	
	@GetMapping()
	public List<DanhMuc> getAll() {
		return danhMucService.findAll();
	}

	@GetMapping("{id}")
	public DanhMuc getOne(@PathVariable("id") String id) {
		return danhMucService.findById(id);
	}

	@PostMapping
	public DanhMuc create(@RequestBody DanhMuc danhMuc) {
		return danhMucService.save(danhMuc);
	}

	@PutMapping("{id}")
	public DanhMuc update(@PathVariable("id") Integer id, @RequestBody DanhMuc danhMuc) {
		return danhMucService.save(danhMuc);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") String id) {
		danhMucService.deleteById(id);
	}
}
