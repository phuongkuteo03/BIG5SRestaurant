package com.store.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.store.entity.ChiTietNhapHang;


public interface ChiTietNhapHangDAO extends JpaRepository<ChiTietNhapHang,Integer >{
	@Query("SELECT o FROM  ChiTietNhapHang  o WHERE o.nhaphang.id = ?1")
    List<ChiTietNhapHang> findChiTietByNhapHang(Integer id);
}
