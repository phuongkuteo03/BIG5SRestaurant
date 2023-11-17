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
import com.store.entity.DonHangOnline;


public interface DonHangOnlineService {

	<S extends DonHangOnline> List<S> findAll(Example<S> example, Sort sort);

	<S extends DonHangOnline> List<S> findAll(Example<S> example);

	void deleteAll();

	DonHangOnline getReferenceById(Integer id);

	void deleteAll(List<? extends DonHangOnline> entities);

	void deleteAllById(List<? extends Integer> ids);

	DonHangOnline getById(Integer id);

	void delete(DonHangOnline entity);

	DonHangOnline getOne(Integer id);

	void deleteById(Integer id);

	void deleteAllInBatch();

	long count();

	<S extends DonHangOnline, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<Integer> ids);

	<S extends DonHangOnline> boolean exists(Example<S> example);

	void deleteAllInBatch(List<DonHangOnline> entities);

	<S extends DonHangOnline> long count(Example<S> example);

	boolean existsById(Integer id);

	void deleteInBatch(List<DonHangOnline> entities);

	DonHangOnline findById(Integer id);

	<S extends DonHangOnline> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends DonHangOnline> List<S> saveAllAndFlush(List<S> entities);

	<S extends DonHangOnline> S saveAndFlush(S entity);

	void flush();

	<S extends DonHangOnline> List<S> saveAll(List<S> entities);

	List<DonHangOnline> findAllById(List<Integer> ids);

	List<DonHangOnline> findAll(Sort sort);

	Page<DonHangOnline> findAll(Pageable pageable);

	List<DonHangOnline> findAll();

	<S extends DonHangOnline> Optional<S> findOne(Example<S> example);

	<S extends DonHangOnline> S save(S entity);
	
	DonHangOnline create(JsonNode orderData);
	
	List<DonHangOnline> findByUsername(String username);
}
