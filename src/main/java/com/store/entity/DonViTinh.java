package com.store.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity 
@Table(name = "Donvitinh")
public class DonViTinh implements Serializable{
	@Id
	String maDVT;
	@Column(columnDefinition = "nvarchar(255)")
	String tenDVT;
	
	@JsonIgnore
	@OneToMany(mappedBy = "donvitinh")
	List<MatHang> matHang;
}
