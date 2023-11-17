package com.store.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.store.entity.Ban;
import com.store.entity.Order;

public interface BanDAO extends JpaRepository<Ban, Integer>{
	@Query("SELECT o FROM Order o WHERE o.ban =?1 AND o.trangThai = false")
    Order getOrderByTable(Ban id);
	@Query("SELECT o FROM Ban o WHERE o.trangThai = false")
    List<Ban> getTableWhileNull();
}
