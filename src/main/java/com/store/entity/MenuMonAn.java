package com.store.entity;

import java.io.Serializable;
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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity 
@Table(name = "Menumonan")
public class MenuMonAn implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(columnDefinition = "nvarchar(255)")
	String tenMonAn;
	Double giaTien;
	@Column(columnDefinition = "nvarchar(255)")
	String anhMonAn;
	Boolean trangThai;
	
	@JsonIgnore
	@OneToMany(mappedBy = "menumonan")
	List<ChiTietOrder> chiTietOrder;
	@JsonIgnore
	@OneToMany(mappedBy = "menumonan")
	List<ChiTietPhieuBep> chiTietPhieuBep;
	@JsonIgnore
	@OneToMany(mappedBy = "menumonan")
	List<ChiTietThanhToan> chiTietThanhToan;
	@JsonIgnore
	@OneToMany(mappedBy = "menumonan")
	List<ChiTietDonHangOnline> chiTietDonHangOnline;
	
	@ManyToOne  @JoinColumn(name = "hangmuc")
	private HangMuc hangmuc;
}
