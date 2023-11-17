package com.store.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity 
@Table(name = "Ban")
public class Ban implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "thoiGianNgoi")
	Date thoiGianNgoi;
	Boolean trangThai;
	
	@JsonIgnore
	@OneToMany(mappedBy = "ban")
	List<Order> orders;
	@JsonIgnore
	@OneToMany(mappedBy = "ban")
	List<PhieuBep> phieuBep;
	@JsonIgnore
	@OneToMany(mappedBy = "ban")
	List<ThanhToan> thanhToan;
}
