package com.store.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.store.entity.ChiTietOrder;
import com.store.entity.Order;

public interface OrderDAO extends JpaRepository<Order, Integer>{
	@Query("SELECT o FROM DonHangOnline o WHERE o.taikhoan.username=?1")
    List<Order> findByUsername(String username);
	@Query("SELECT o FROM ChiTietOrder o WHERE o.orders.id=?1")
    List<ChiTietOrder> findChiTietByOrder(Integer id);
}
