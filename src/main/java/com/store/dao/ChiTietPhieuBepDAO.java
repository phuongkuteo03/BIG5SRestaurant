package com.store.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.store.entity.ChiTietPhieuBep;

public interface ChiTietPhieuBepDAO extends JpaRepository<ChiTietPhieuBep, Integer>{
	@Query("SELECT o FROM ChiTietPhieuBep o WHERE o.phieubep.id = ?1")
    List<ChiTietPhieuBep> findChiTietByPhieuBep(Integer id);
}
