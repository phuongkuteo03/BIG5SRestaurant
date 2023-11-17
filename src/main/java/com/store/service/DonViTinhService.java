package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.store.entity.DonViTinh;

public interface DonViTinhService {

	<S extends DonViTinh> List<S> findAll(Example<S> example, Sort sort);

	<S extends DonViTinh> List<S> findAll(Example<S> example);

	void deleteAll();

	DonViTinh getReferenceById(String id);

	void deleteAll(List<? extends DonViTinh> entities);

	void deleteAllById(List<? extends String> ids);

	DonViTinh getById(String id);

	void delete(DonViTinh entity);

	DonViTinh getOne(String id);

	void deleteById(String id);

	void deleteAllInBatch();

	long count();

	<S extends DonViTinh, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<String> ids);

	<S extends DonViTinh> boolean exists(Example<S> example);

	void deleteAllInBatch(List<DonViTinh> entities);

	<S extends DonViTinh> long count(Example<S> example);

	boolean existsById(String id);

	void deleteInBatch(List<DonViTinh> entities);

	DonViTinh findById(String id);

	<S extends DonViTinh> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends DonViTinh> List<S> saveAllAndFlush(List<S> entities);

	<S extends DonViTinh> S saveAndFlush(S entity);

	void flush();

	<S extends DonViTinh> List<S> saveAll(List<S> entities);

	List<DonViTinh> findAllById(List<String> ids);

	List<DonViTinh> findAll(Sort sort);

	Page<DonViTinh> findAll(Pageable pageable);

	List<DonViTinh> findAll();

	<S extends DonViTinh> Optional<S> findOne(Example<S> example);

	<S extends DonViTinh> S save(S entity);

	
}
