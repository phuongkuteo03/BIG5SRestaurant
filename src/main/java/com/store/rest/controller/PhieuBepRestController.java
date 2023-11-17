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
import com.store.entity.PhieuBep;
import com.store.service.PhieuBepService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/phieubep")
public class PhieuBepRestController {
	@Autowired
    PhieuBepService phieuBepService;

    @GetMapping()
    public List<PhieuBep> getAll() {
        return phieuBepService.findAll();
    }
    
    @GetMapping("{id}")
	public PhieuBep getOne(@PathVariable("id") Integer id) {
		return phieuBepService.findById(id);
	}

	@PostMapping
	public PhieuBep create(@RequestBody JsonNode phieuBep) {
		return phieuBepService.create(phieuBep);
	}

	@PutMapping("{id}")
	public PhieuBep update(@PathVariable("id") Integer id, @RequestBody PhieuBep phieuBep) {
		return phieuBepService.save(phieuBep);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		phieuBepService.deleteById(id);
	}
}
