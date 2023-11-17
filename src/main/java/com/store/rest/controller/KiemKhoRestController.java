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

import com.store.entity.KiemKho;
import com.store.service.KiemKhoService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/kiemkho")
public class KiemKhoRestController {
	
	@Autowired
	KiemKhoService kiemKhoService;
	
	@GetMapping()
    public List<KiemKho> getAll() {
        return kiemKhoService.findAll();
    }
    
    @GetMapping("{id}")
	public KiemKho getOne(@PathVariable("id") Integer id) {
		return kiemKhoService.findById(id);
	}

	@PostMapping
	public KiemKho create(@RequestBody KiemKho kiemKho) {
		return kiemKhoService.save(kiemKho);
	}

	@PutMapping("{id}")
	public KiemKho update(@PathVariable("id") String id, @RequestBody KiemKho kiemKho) {
		return kiemKhoService.save(kiemKho);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		kiemKhoService.deleteById(id);
	}

}
