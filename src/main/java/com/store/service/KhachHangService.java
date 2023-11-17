package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.store.entity.KhachHang;

public interface KhachHangService {

	<S extends KhachHang> List<S> findAll(Example<S> example, Sort sort);

	<S extends KhachHang> List<S> findAll(Example<S> example);

	void deleteAll();

	KhachHang getReferenceById(Integer id);

	void deleteAll(List<? extends KhachHang> entities);

	void deleteAllById(List<? extends Integer> ids);

	KhachHang getById(Integer id);

	void delete(KhachHang entity);

	KhachHang getOne(Integer id);

	void deleteById(Integer id);

	void deleteAllInBatch();

	long count();

	<S extends KhachHang, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<Integer> ids);

	<S extends KhachHang> boolean exists(Example<S> example);

	void deleteAllInBatch(List<KhachHang> entities);

	<S extends KhachHang> long count(Example<S> example);

	boolean existsById(Integer id);

	void deleteInBatch(List<KhachHang> entities);

	KhachHang findById(Integer id);

	<S extends KhachHang> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends KhachHang> List<S> saveAllAndFlush(List<S> entities);

	<S extends KhachHang> S saveAndFlush(S entity);

	void flush();

	<S extends KhachHang> List<S> saveAll(List<S> entities);

	List<KhachHang> findAllById(List<Integer> ids);

	List<KhachHang> findAll(Sort sort);

	Page<KhachHang> findAll(Pageable pageable);

	List<KhachHang> findAll();

	<S extends KhachHang> Optional<S> findOne(Example<S> example);

	<S extends KhachHang> S save(S entity);


}
