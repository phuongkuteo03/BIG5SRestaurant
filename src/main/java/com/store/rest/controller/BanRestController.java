package com.store.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.entity.Ban;
import com.store.service.BanService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/ban")
public class BanRestController {
    @Autowired
    BanService banService;

    @GetMapping()
    public List<Ban> getAll() {
        return banService.getTableWhileNull();
    }
    
    @PutMapping("{id}")
	public Ban update(@PathVariable("id") Integer id, @RequestBody Ban ban) {
		return banService.save(ban);
	}
}
