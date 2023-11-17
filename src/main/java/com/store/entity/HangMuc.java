package com.store.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "Hangmuc")
public class HangMuc {
	@Id
	String maHM;
	@Column(columnDefinition = "nvarchar(255)")
	String tenHM;
	Boolean trangThai;

	@JsonIgnore
	@OneToMany(mappedBy = "hangmuc")
	List<MenuMonAn> menuMonAn;
}
