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

import com.store.entity.MenuMonAn;
import com.store.service.MenuMonAnService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/menu")
public class MenuMonAnRestController {
	@Autowired
	MenuMonAnService menuMonAnService;
	
	@GetMapping()
	public List<MenuMonAn> getAll() {
		return menuMonAnService.findAll();
	}

	@GetMapping("{id}")
	public MenuMonAn getOne(@PathVariable("id") Integer id) {
		return menuMonAnService.findById(id);
	}

	@PostMapping
	public MenuMonAn create(@RequestBody MenuMonAn menuMonAn) {
		return menuMonAnService.save(menuMonAn);
	}

	@PutMapping("{id}")
	public MenuMonAn update(@PathVariable("id") Integer id, @RequestBody MenuMonAn menuMonAn) {
		return menuMonAnService.save(menuMonAn);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		menuMonAnService.deleteById(id);
	}
}
