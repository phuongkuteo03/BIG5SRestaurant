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
@Table(name = "Thanhtoan")
public class ThanhToan implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Ngaytao")
	Date ngayTao = new Date();
	Double thanhTien;
	@Column(columnDefinition = "nvarchar(255)")
	String ghiChu;
	
	@JsonIgnore
	@OneToMany(mappedBy = "thanhtoan")
	List<Order> orders;
	@JsonIgnore
	@OneToMany(mappedBy = "thanhtoan")
	List<ChiTietThanhToan> chiTietThanhToan;
	
	@ManyToOne  @JoinColumn(name = "ban")
	private Ban ban;
	@ManyToOne  @JoinColumn(name = "taikhoan")
	private TaiKhoan taikhoan;
}
