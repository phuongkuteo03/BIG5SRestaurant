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
@Table(name = "Kiemkho")
public class KiemKho implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Temporal(TemporalType.DATE)
	@Column(name = "Ngaytao")
	Date ngayTao = new Date();
	@Temporal(TemporalType.DATE)
	@Column(name = "Ngaykiem")
	Date ngayKiem = new Date();
	@Column(columnDefinition = "nvarchar(255)")
	String ghiChu;
	
	@ManyToOne  @JoinColumn(name = "taikhoan")
	private TaiKhoan taikhoan;
}
