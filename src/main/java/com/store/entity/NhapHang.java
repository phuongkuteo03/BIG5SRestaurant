package com.store.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity 
@Table(name = "Nhaphang")
public class NhapHang implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Ngaynhap")
	Date ngayNhap = new Date();
	@Column(columnDefinition = "nvarchar(255)")
	String ghiChu;
	
	@JsonIgnore
	@OneToMany(mappedBy = "nhaphang")
	List<ChiTietNhapHang> chiTietNhapHang;
	
	@ManyToOne  @JoinColumn(name = "nhacungcap")
	private NhaCungCap nhacungcap;
}
