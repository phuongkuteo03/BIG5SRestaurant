package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.store.entity.KiemKho;

public interface KiemKhoService {

	<S extends KiemKho> List<S> findAll(Example<S> example, Sort sort);

	<S extends KiemKho> List<S> findAll(Example<S> example);

	void deleteAll();

	KiemKho getReferenceById(Integer id);

	void deleteAll(List<? extends KiemKho> entities);

	void deleteAllById(List<? extends Integer> ids);

	KiemKho getById(Integer id);

	void delete(KiemKho entity);

	KiemKho getOne(Integer id);

	void deleteById(Integer id);

	void deleteAllInBatch();

	long count();

	<S extends KiemKho, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<Integer> ids);

	<S extends KiemKho> boolean exists(Example<S> example);

	void deleteAllInBatch(List<KiemKho> entities);

	<S extends KiemKho> long count(Example<S> example);

	boolean existsById(Integer id);

	void deleteInBatch(List<KiemKho> entities);

	KiemKho findById(Integer id);

	<S extends KiemKho> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends KiemKho> List<S> saveAllAndFlush(List<S> entities);

	<S extends KiemKho> S saveAndFlush(S entity);

	void flush();

	<S extends KiemKho> List<S> saveAll(List<S> entities);

	List<KiemKho> findAllById(List<Integer> ids);

	List<KiemKho> findAll(Sort sort);

	Page<KiemKho> findAll(Pageable pageable);

	List<KiemKho> findAll();

	<S extends KiemKho> Optional<S> findOne(Example<S> example);

	<S extends KiemKho> S save(S entity);

}
