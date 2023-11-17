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

import com.store.entity.NhaCungCap;
import com.store.service.NhaCungCapService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/nhacungcap")
public class NhaCungCapRestController {
	@Autowired
	NhaCungCapService nhaCungCapService;

	@GetMapping()
    public List<NhaCungCap> getAll() {
        return nhaCungCapService.findAll();
    }
    
    @GetMapping("{id}")
	public NhaCungCap getOne(@PathVariable("id") Integer id) {
		return nhaCungCapService.findById(id);
	}

	@PostMapping
	public NhaCungCap create(@RequestBody NhaCungCap nhaCungCap) {
		return nhaCungCapService.save(nhaCungCap);
	}

	@PutMapping("{id}")
	public NhaCungCap update(@PathVariable("id") String id, @RequestBody NhaCungCap nhaCungCap) {
		return nhaCungCapService.save(nhaCungCap);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		nhaCungCapService.deleteById(id);
	}
}
