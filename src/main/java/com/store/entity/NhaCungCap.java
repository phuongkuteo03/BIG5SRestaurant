package com.store.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity 
@Table(name = "Nhacungcap")
public class NhaCungCap implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(columnDefinition = "nvarchar(255)")
	String tenNCC;
	@Column(columnDefinition = "nvarchar(255)")
	String diaChi;
	String sdt;
	
	@JsonIgnore
	@OneToMany(mappedBy = "nhacungcap")
	List<MatHang> mathang;
	@JsonIgnore
	@OneToMany(mappedBy = "nhacungcap")
	List<NhapHang> nhaphang;
}
