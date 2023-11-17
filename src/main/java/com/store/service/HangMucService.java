package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.store.entity.HangMuc;

public interface HangMucService {

	<S extends HangMuc> List<S> findAll(Example<S> example, Sort sort);

	<S extends HangMuc> List<S> findAll(Example<S> example);

	void deleteAll();

	HangMuc getReferenceById(String id);

	void deleteAll(List<? extends HangMuc> entities);

	void deleteAllById(List<? extends String> ids);

	HangMuc getById(String id);

	void delete(HangMuc entity);

	HangMuc getOne(String id);

	void deleteById(String id);

	void deleteAllInBatch();

	long count();

	<S extends HangMuc, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<String> ids);

	<S extends HangMuc> boolean exists(Example<S> example);

	void deleteAllInBatch(List<HangMuc> entities);

	<S extends HangMuc> long count(Example<S> example);

	boolean existsById(String id);

	void deleteInBatch(List<HangMuc> entities);

	HangMuc findById(String id);

	<S extends HangMuc> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends HangMuc> List<S> saveAllAndFlush(List<S> entities);

	<S extends HangMuc> S saveAndFlush(S entity);

	void flush();

	<S extends HangMuc> List<S> saveAll(List<S> entities);

	List<HangMuc> findAllById(List<String> ids);

	List<HangMuc> findAll(Sort sort);

	Page<HangMuc> findAll(Pageable pageable);

	List<HangMuc> findAll();

	<S extends HangMuc> Optional<S> findOne(Example<S> example);

	<S extends HangMuc> S save(S entity);

	

}
