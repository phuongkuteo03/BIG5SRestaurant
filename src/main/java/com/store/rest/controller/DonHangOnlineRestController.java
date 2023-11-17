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
import com.store.entity.DonHangOnline;
import com.store.service.DonHangOnlineService;


@CrossOrigin("*")
@RestController
@RequestMapping("/rest/donhangonline")
public class DonHangOnlineRestController {
	@Autowired
    DonHangOnlineService donHangOnlineService;

	@GetMapping()
	public List<DonHangOnline> getAll() {
		return donHangOnlineService.findAll();
	}

	@GetMapping("{id}")
	public DonHangOnline getOne(@PathVariable("id") Integer id) {
		return donHangOnlineService.findById(id);
	}
	
	@PostMapping()
	public DonHangOnline create(@RequestBody JsonNode donHangOnline) {
		return donHangOnlineService.create(donHangOnline);
	}

	@PutMapping("{id}")
	public DonHangOnline update(@PathVariable("id") Integer id, @RequestBody DonHangOnline donHangOnline) {
		return donHangOnlineService.save(donHangOnline);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		donHangOnlineService.deleteById(id);
	}
}
