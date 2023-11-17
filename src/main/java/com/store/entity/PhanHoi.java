package com.store.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity 
@Table(name = "Phanhoi")
public class PhanHoi implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length = 5)
	Integer danhGia;
	@Column(columnDefinition = "nvarchar(255)")
	String phanHoi;
	
	@ManyToOne  @JoinColumn(name = "khachhang")
	private KhachHang khachhang;
}
