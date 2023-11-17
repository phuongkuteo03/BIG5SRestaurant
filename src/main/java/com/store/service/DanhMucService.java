package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.store.entity.DanhMuc;

public interface DanhMucService {

	<S extends DanhMuc> List<S> findAll(Example<S> example, Sort sort);

	<S extends DanhMuc> List<S> findAll(Example<S> example);

	void deleteAll();

	DanhMuc getReferenceById(String id);

	void deleteAll(List<? extends DanhMuc> entities);

	void deleteAllById(List<? extends String> ids);

	DanhMuc getById(String id);

	void delete(DanhMuc entity);

	DanhMuc getOne(String id);

	void deleteById(String id);

	void deleteAllInBatch();

	long count();

	<S extends DanhMuc, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<String> ids);

	<S extends DanhMuc> boolean exists(Example<S> example);

	void deleteAllInBatch(List<DanhMuc> entities);

	<S extends DanhMuc> long count(Example<S> example);

	boolean existsById(String id);

	void deleteInBatch(List<DanhMuc> entities);

	DanhMuc findById(String id);

	<S extends DanhMuc> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends DanhMuc> List<S> saveAllAndFlush(List<S> entities);

	<S extends DanhMuc> S saveAndFlush(S entity);

	void flush();

	<S extends DanhMuc> List<S> saveAll(List<S> entities);

	List<DanhMuc> findAllById(List<String> ids);

	List<DanhMuc> findAll(Sort sort);

	Page<DanhMuc> findAll(Pageable pageable);

	List<DanhMuc> findAll();

	<S extends DanhMuc> Optional<S> findOne(Example<S> example);

	<S extends DanhMuc> S save(S entity);

}
