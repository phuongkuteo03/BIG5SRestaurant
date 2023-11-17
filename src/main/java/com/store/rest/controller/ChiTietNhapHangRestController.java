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

import com.store.dao.ChiTietNhapHangDAO;
import com.store.entity.ChiTietNhapHang;
import com.store.service.ChiTietNhapHangService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/chitietnhaphang")
public class ChiTietNhapHangRestController {
	@Autowired
    ChiTietNhapHangService chiTietNhapHangService;
	@Autowired
	ChiTietNhapHangDAO chiTietNhapHangDAO;

	@GetMapping()
	public List<ChiTietNhapHang> getAll() {
		return chiTietNhapHangService.findAll();
	}

	@GetMapping("{id}")
	public List<ChiTietNhapHang> getAllByNhapHang(@PathVariable("id") Integer id) {
		return chiTietNhapHangDAO.findChiTietByNhapHang(id);
	}

	@PostMapping
	public ChiTietNhapHang create(@RequestBody ChiTietNhapHang chiTietNhapHang) {
		return chiTietNhapHangService.save(chiTietNhapHang);
	}

	@PutMapping("{id}")
	public ChiTietNhapHang update(@PathVariable("id") Integer id, @RequestBody ChiTietNhapHang chiTietNhapHang) {
		return chiTietNhapHangService.save(chiTietNhapHang);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		chiTietNhapHangService.deleteById(id);
	}

}
