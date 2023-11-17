package com.store.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.entity.DonViTinh;
import com.store.service.DonViTinhService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/donvitinh")
public class DonViTinhRestController {
	@Autowired
	DonViTinhService donViTinhService;

    @GetMapping()
    public List<DonViTinh> getAll() {
        return donViTinhService.findAll();
    }
}
