package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.store.entity.ChiTietNhapHang;

public interface ChiTietNhapHangService {

	<S extends ChiTietNhapHang> List<S> findAll(Example<S> example, Sort sort);

	<S extends ChiTietNhapHang> List<S> findAll(Example<S> example);

	void deleteAll();

	ChiTietNhapHang getReferenceById(Integer id);

	void deleteAll(List<? extends ChiTietNhapHang> entities);

	void deleteAllById(List<? extends Integer> ids);

	ChiTietNhapHang getById(Integer id);

	void delete(ChiTietNhapHang entity);

	ChiTietNhapHang getOne(Integer id);

	void deleteById(Integer id);

	void deleteAllInBatch();

	long count();

	<S extends ChiTietNhapHang, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<Integer> ids);

	<S extends ChiTietNhapHang> boolean exists(Example<S> example);

	void deleteAllInBatch(List<ChiTietNhapHang> entities);

	<S extends ChiTietNhapHang> long count(Example<S> example);

	boolean existsById(Integer id);

	void deleteInBatch(List<ChiTietNhapHang> entities);

	ChiTietNhapHang findById(Integer id);

	<S extends ChiTietNhapHang> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends ChiTietNhapHang> List<S> saveAllAndFlush(List<S> entities);

	<S extends ChiTietNhapHang> S saveAndFlush(S entity);

	void flush();

	<S extends ChiTietNhapHang> List<S> saveAll(List<S> entities);

	List<ChiTietNhapHang> findAllById(List<Integer> ids);

	List<ChiTietNhapHang> findAll(Sort sort);

	Page<ChiTietNhapHang> findAll(Pageable pageable);

	List<ChiTietNhapHang> findAll();

	<S extends ChiTietNhapHang> Optional<S> findOne(Example<S> example);

	<S extends ChiTietNhapHang> S save(S entity);

	List<ChiTietNhapHang> findChiTietNhapHang(Integer id);

}
