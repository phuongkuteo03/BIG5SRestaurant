package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.store.entity.NhapHang;

public interface NhapHangService {

	<S extends NhapHang> List<S> findAll(Example<S> example, Sort sort);

	<S extends NhapHang> List<S> findAll(Example<S> example);

	void deleteAll();

	NhapHang getReferenceById(Integer id);

	void deleteAll(List<? extends NhapHang> entities);

	void deleteAllById(List<? extends Integer> ids);

	NhapHang getById(Integer id);

	void delete(NhapHang entity);

	NhapHang getOne(Integer id);

	void deleteById(Integer id);

	void deleteAllInBatch();

	long count();

	<S extends NhapHang, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<Integer> ids);

	<S extends NhapHang> boolean exists(Example<S> example);

	void deleteAllInBatch(List<NhapHang> entities);

	<S extends NhapHang> long count(Example<S> example);

	boolean existsById(Integer id);

	void deleteInBatch(List<NhapHang> entities);

	NhapHang findById(Integer id);

	<S extends NhapHang> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends NhapHang> List<S> saveAllAndFlush(List<S> entities);

	<S extends NhapHang> S saveAndFlush(S entity);

	void flush();

	<S extends NhapHang> List<S> saveAll(List<S> entities);

	List<NhapHang> findAllById(List<Integer> ids);

	List<NhapHang> findAll(Sort sort);

	Page<NhapHang> findAll(Pageable pageable);

	List<NhapHang> findAll();

	<S extends NhapHang> Optional<S> findOne(Example<S> example);

	<S extends NhapHang> S save(S entity);


}
