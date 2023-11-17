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

import com.store.entity.HangMuc;
import com.store.service.HangMucService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/hangmuc")
public class HangMucRestController {
	@Autowired
	HangMucService hangMucService;
	
	@GetMapping()
	public List<HangMuc> getAll() {
		return hangMucService.findAll();
	}

	@GetMapping("{id}")
	public HangMuc getOne(@PathVariable("id") String id) {
		return hangMucService.findById(id);
	}

	@PostMapping
	public HangMuc create(@RequestBody HangMuc hangMuc) {
		return hangMucService.save(hangMuc);
	}

	@PutMapping("{id}")
	public HangMuc update(@PathVariable("id") Integer id, @RequestBody HangMuc hangMuc) {
		return hangMucService.save(hangMuc);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") String id) {
		hangMucService.deleteById(id);
	}
}
