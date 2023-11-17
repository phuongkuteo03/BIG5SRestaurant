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

import com.store.entity.CaLamViec;
import com.store.service.CaLamViecService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/calamviec")
public class CaLamViecRestController {
	@Autowired
    CaLamViecService caLamViecService;

    @GetMapping()
    public List<CaLamViec> getAll() {
        return caLamViecService.findAll();
    }
    
    @GetMapping("{id}")
	public CaLamViec getOne(@PathVariable("id") String id) {
		return caLamViecService.findById(id);
	}

	@PostMapping
	public CaLamViec create(@RequestBody CaLamViec caLamViec) {
		return caLamViecService.save(caLamViec);
	}

	@PutMapping("{id}")
	public CaLamViec update(@PathVariable("id") String id, @RequestBody CaLamViec caLamViec) {
		return caLamViecService.save(caLamViec);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") String id) {
		caLamViecService.deleteById(id);
	}
}
