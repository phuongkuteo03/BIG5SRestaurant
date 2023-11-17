package com.store.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.store.entity.TaiKhoan;
import com.store.service.TaiKhoanService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/taikhoan")
public class TaiKhoanRestController {
    @Autowired
    TaiKhoanService taiKhoanService;

    @GetMapping
    public List<TaiKhoan> getAccounts(@RequestParam("admin") Optional<Boolean> admin) {
        if (admin.orElse(false)) {
            return taiKhoanService.getAdministrators();
        }
        return taiKhoanService.findAll();
    }

    @GetMapping("{username}")
    public TaiKhoan getOne(@PathVariable("username") String id) {
        return taiKhoanService.findById(id);
    }

    @PostMapping
    public TaiKhoan create(@RequestBody TaiKhoan taiKhoan) {
        return taiKhoanService.save(taiKhoan);
    }

    @PutMapping("{username}")
    public TaiKhoan update(@PathVariable("username") String username, @RequestBody TaiKhoan taiKhoan) {
        return taiKhoanService.save(taiKhoan);
    }

    @DeleteMapping("{username}")
    public void delete(@PathVariable("username") String id) {
        taiKhoanService.deleteById(id);
    }
}
