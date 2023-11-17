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

import com.store.entity.NhapHang;
import com.store.service.NhapHangService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/nhaphang")
public class NhapHangRestController {
	@Autowired
	NhapHangService nhapHangService;
	  @GetMapping()
	    public List<NhapHang> getAll() {
	        return nhapHangService.findAll();
	    }
	    
	    @GetMapping("{id}")
		public NhapHang getOne(@PathVariable("id") Integer id) {
			return nhapHangService.findById(id);
		}

		@PostMapping
		public NhapHang create(@RequestBody NhapHang nhapHang ) {
			return nhapHangService.save(nhapHang);
		}

		@PutMapping("{id}")
		public NhapHang update(@PathVariable("id") String id, @RequestBody NhapHang nhapHang) {
			return nhapHangService.save(nhapHang);
		}

		@DeleteMapping("{id}")
		public void delete(@PathVariable("id") Integer id) {
			nhapHangService.deleteById(id);
		}



}
