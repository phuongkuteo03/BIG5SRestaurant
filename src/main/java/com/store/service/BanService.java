package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.store.entity.Ban;
import com.store.entity.Order;

public interface BanService {

	<S extends Ban> List<S> findAll(Example<S> example, Sort sort);

	<S extends Ban> List<S> findAll(Example<S> example);

	void deleteAll();

	Ban getReferenceById(Integer id);

	void deleteAll(List<? extends Ban> entities);

	void deleteAllById(List<? extends Integer> ids);

	Ban getById(Integer id);

	void delete(Ban entity);

	Ban getOne(Integer id);

	void deleteById(Integer id);

	void deleteAllInBatch();

	long count();

	<S extends Ban, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<Integer> ids);

	<S extends Ban> boolean exists(Example<S> example);

	void deleteAllInBatch(List<Ban> entities);

	<S extends Ban> long count(Example<S> example);

	boolean existsById(Integer id);

	void deleteInBatch(List<Ban> entities);

	Ban findById(Integer id);

	<S extends Ban> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends Ban> List<S> saveAllAndFlush(List<S> entities);

	<S extends Ban> S saveAndFlush(S entity);

	void flush();

	<S extends Ban> List<S> saveAll(List<S> entities);

	List<Ban> findAllById(List<Integer> ids);

	List<Ban> findAll(Sort sort);

	Page<Ban> findAll(Pageable pageable);

	List<Ban> findAll();

	<S extends Ban> Optional<S> findOne(Example<S> example);

	<S extends Ban> S save(S entity);

	Order getOrderByTable(Ban id);

	List<Ban> getTableWhileNull();

}
