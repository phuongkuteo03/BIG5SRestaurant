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
@Table(name = "Chitietthanhtoan")
public class ChiTietThanhToan implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	Integer soLuong;
	Double giaTien;
	@Column(columnDefinition = "nvarchar(255)")
	String ghiChu;
	
	@ManyToOne  @JoinColumn(name = "menumonan")
	private MenuMonAn menumonan;
	@ManyToOne  @JoinColumn(name = "thanhtoan")
	private ThanhToan thanhtoan;
}
