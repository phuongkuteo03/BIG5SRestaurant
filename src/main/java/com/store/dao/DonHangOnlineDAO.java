package com.store.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.store.entity.DonHangOnline;

public interface DonHangOnlineDAO extends JpaRepository<DonHangOnline, Integer>{
	@Query("SELECT o FROM DonHangOnline o WHERE o.taikhoan.username=?1")
    List<DonHangOnline> findByUsername(String username);
}
