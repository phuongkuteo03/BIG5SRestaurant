package com.store.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.store.entity.ChiTietOrder;

public interface ChiTietOrderDAO extends JpaRepository<ChiTietOrder, Integer>{
	@Query("SELECT o FROM ChiTietOrder o WHERE o.orders.id = ?1")
    List<ChiTietOrder> findChiTietByOrder(Integer id);
}
