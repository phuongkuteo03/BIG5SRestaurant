package com.store.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.entity.VaiTro;
import com.store.service.VaiTroService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/vaitro")
public class VaiTroRestController {
	@Autowired
	VaiTroService vaiTroService;

    @GetMapping()
    public List<VaiTro> getAll() {
        return vaiTroService.findAll();
    }
}
