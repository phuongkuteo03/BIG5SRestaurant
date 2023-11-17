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
@Table(name = "Vaitro")
public class VaiTro implements Serializable {
	@Id
	String maVT;
	@Column(columnDefinition = "nvarchar(255)")
	String tenVT;

	@JsonIgnore
	@OneToMany(mappedBy = "vaitro")
	List<TaiKhoan> taikhoan;
}
