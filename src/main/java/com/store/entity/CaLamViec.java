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
@Table(name = "Calamviec")
public class CaLamViec implements Serializable {
	@Id
	String maCLV;
	@Column(name = "thoigianbatdau")
	String thoiGianBatDau;
	@Column(name = "thoigianketthuc")
	String thoiGianKetThuc;
	@Column(columnDefinition = "nvarchar(255)")
	String ghiChu;

	@JsonIgnore
	@OneToMany(mappedBy = "calamviec")
	List<ChamCong> chamcong;
	@JsonIgnore
	@OneToMany(mappedBy = "calamviec")
	List<Luong> luong;
	@JsonIgnore
	@OneToMany(mappedBy = "calamviec")
	List<TaiKhoan> taikhoan;
}
