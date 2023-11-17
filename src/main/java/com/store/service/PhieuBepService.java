package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.fasterxml.jackson.databind.JsonNode;
import com.store.entity.PhieuBep;

public interface PhieuBepService {

	<S extends PhieuBep> List<S> findAll(Example<S> example, Sort sort);

	<S extends PhieuBep> List<S> findAll(Example<S> example);

	void deleteAll();

	PhieuBep getReferenceById(Integer id);

	void deleteAll(List<? extends PhieuBep> entities);

	void deleteAllById(List<? extends Integer> ids);

	PhieuBep getById(Integer id);

	void delete(PhieuBep entity);

	PhieuBep getOne(Integer id);

	void deleteById(Integer id);

	void deleteAllInBatch();

	long count();

	<S extends PhieuBep, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<Integer> ids);

	<S extends PhieuBep> boolean exists(Example<S> example);

	void deleteAllInBatch(List<PhieuBep> entities);

	<S extends PhieuBep> long count(Example<S> example);

	boolean existsById(Integer id);

	void deleteInBatch(List<PhieuBep> entities);

	PhieuBep findById(Integer id);

	<S extends PhieuBep> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends PhieuBep> List<S> saveAllAndFlush(List<S> entities);

	<S extends PhieuBep> S saveAndFlush(S entity);

	void flush();

	<S extends PhieuBep> List<S> saveAll(List<S> entities);

	List<PhieuBep> findAllById(List<Integer> ids);

	List<PhieuBep> findAll(Sort sort);

	Page<PhieuBep> findAll(Pageable pageable);

	List<PhieuBep> findAll();

	<S extends PhieuBep> Optional<S> findOne(Example<S> example);

	<S extends PhieuBep> S save(S entity);

	PhieuBep create(JsonNode orderData);

}
