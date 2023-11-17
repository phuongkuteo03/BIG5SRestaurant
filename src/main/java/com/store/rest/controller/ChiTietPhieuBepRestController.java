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

import com.store.dao.ChiTietPhieuBepDAO;
import com.store.entity.ChiTietPhieuBep;
import com.store.service.ChiTietPhieuBepService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/chitietphieubep")
public class ChiTietPhieuBepRestController {
	@Autowired
    ChiTietPhieuBepService chiTietPhieuBepService;
	@Autowired
	ChiTietPhieuBepDAO chiTietPhieuBepDAO;

	@GetMapping()
	public List<ChiTietPhieuBep> getAll() {
		return chiTietPhieuBepService.findAll();
	}

	@GetMapping("{id}")
	public List<ChiTietPhieuBep> getAllByOrder(@PathVariable("id") Integer id) {
		return chiTietPhieuBepDAO.findChiTietByPhieuBep(id);
	}

	@PostMapping
	public ChiTietPhieuBep create(@RequestBody ChiTietPhieuBep chiTietPhieuBep) {
		return chiTietPhieuBepService.save(chiTietPhieuBep);
	}

	@PutMapping("{id}")
	public ChiTietPhieuBep update(@PathVariable("id") Integer id, @RequestBody ChiTietPhieuBep chiTietPhieuBep) {
		return chiTietPhieuBepService.save(chiTietPhieuBep);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		chiTietPhieuBepService.deleteById(id);
	}
}
