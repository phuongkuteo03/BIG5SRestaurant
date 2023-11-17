package com.store.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.store.entity.ChiTietDonHangOnline;

public interface ChiTietDonHangOnlineDAO extends JpaRepository<ChiTietDonHangOnline, Integer>{
	@Query("SELECT o FROM ChiTietDonHangOnline o WHERE o.donhangonline.id = ?1")
    List<ChiTietDonHangOnline> findChiTietByDonHangOnline(Integer id);
}
