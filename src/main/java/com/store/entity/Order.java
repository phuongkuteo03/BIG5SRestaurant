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
@Table(name = "Orders")
public class Order implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Ngaytao")
	Date ngayTao = new Date();
	@Column(columnDefinition = "nvarchar(255)")
	String ghiChu;
	Boolean trangThai;
	
	@JsonIgnore
	@OneToMany(mappedBy = "orders")
	List<ChiTietOrder> chiTietOrder;
	@JsonIgnore
	@OneToMany(mappedBy = "orders")
	List<ChiTietPhieuBep> chiTietPhieuBep;
	
	@ManyToOne  @JoinColumn(name = "taikhoan")
	private TaiKhoan taikhoan;
	@ManyToOne  @JoinColumn(name = "ban")
	private Ban ban;
	@ManyToOne  @JoinColumn(name = "thanhtoan")
	private ThanhToan thanhtoan;
	@ManyToOne  @JoinColumn(name = "phieubep")
	private PhieuBep phieubep;
}
