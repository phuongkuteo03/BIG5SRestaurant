package com.store.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.store.entity.TaiKhoan;

public interface TaiKhoanDAO extends JpaRepository<TaiKhoan, String> {

    @Query("SELECT DISTINCT tk FROM TaiKhoan tk WHERE tk.vaitro IN ('admin', 'nvtn')")
    List<TaiKhoan> getAdministrators();
}
