package com.store.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.store.entity.MenuMonAn;

public interface MenuMonAnDAO extends JpaRepository<MenuMonAn, Integer> {
	@Query("SELECT o FROM MenuMonAn o WHERE o.hangmuc.maHM LIKE ?1")
	List<MenuMonAn> findByCategoryId(String cid);
}
