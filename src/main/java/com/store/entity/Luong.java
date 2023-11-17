package com.store.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity 
@Table(name = "Luong")
public class Luong implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Temporal(TemporalType.DATE)
	@Column(name = "Thangnam")
	Date thangNam = new Date();
	Double tongLuong;
	@Column(columnDefinition = "nvarchar(255)")
	String ghiChu;
	
	@ManyToOne  @JoinColumn(name = "taikhoan")
	private TaiKhoan taikhoan;
	@ManyToOne  @JoinColumn(name = "calamviec")
	private CaLamViec calamviec;
}
