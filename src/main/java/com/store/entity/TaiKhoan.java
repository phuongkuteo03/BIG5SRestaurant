package com.store.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "Taikhoan")
public class TaiKhoan implements Serializable {
	@Id
	String username;
	String password;
	@Column(columnDefinition = "nvarchar(255)")
	String hoTen;
	String email;
	String anh;
	Boolean trangThai;

	@JsonIgnore
	@OneToMany(mappedBy = "taikhoan",cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	List<KiemKho> kiemKho;
	@JsonIgnore
	@OneToMany(mappedBy = "taikhoan",cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	List<Order> orders;
	@JsonIgnore
	@OneToMany(mappedBy = "taikhoan",cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	List<Luong> luong;
	@JsonIgnore
	@OneToMany(mappedBy = "taikhoan",cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	List<ChamCong> chamCong;
	@JsonIgnore
	@OneToMany(mappedBy = "taikhoan",cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	List<PhieuBep> phieuBep;
	@JsonIgnore
	@OneToMany(mappedBy = "taikhoan",cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	List<ThanhToan> thanhToan;
	@JsonIgnore
	@OneToMany(mappedBy = "taikhoan",cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	List<DonHangOnline> donHangOnline;

	@ManyToOne
	@JoinColumn(name = "calamviec")
	private CaLamViec calamviec;
	@ManyToOne
	@JoinColumn(name = "vaitro")
	private VaiTro vaitro;
}
