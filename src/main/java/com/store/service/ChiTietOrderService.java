package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.store.entity.ChiTietOrder;

public interface ChiTietOrderService {

	List<ChiTietOrder> findChiTietByOrder(Integer id);

	<S extends ChiTietOrder> List<S> findAll(Example<S> example, Sort sort);

	<S extends ChiTietOrder> List<S> findAll(Example<S> example);

	void deleteAll();

	ChiTietOrder getReferenceById(Integer id);

	void deleteAll(List<? extends ChiTietOrder> entities);

	void deleteAllById(List<? extends Integer> ids);

	ChiTietOrder getById(Integer id);

	void delete(ChiTietOrder entity);

	ChiTietOrder getOne(Integer id);

	void deleteById(Integer id);

	void deleteAllInBatch();

	long count();

	<S extends ChiTietOrder, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<Integer> ids);

	<S extends ChiTietOrder> boolean exists(Example<S> example);

	void deleteAllInBatch(List<ChiTietOrder> entities);

	<S extends ChiTietOrder> long count(Example<S> example);

	boolean existsById(Integer id);

	void deleteInBatch(List<ChiTietOrder> entities);

	ChiTietOrder findById(Integer id);

	<S extends ChiTietOrder> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends ChiTietOrder> List<S> saveAllAndFlush(List<S> entities);

	<S extends ChiTietOrder> S saveAndFlush(S entity);

	void flush();

	<S extends ChiTietOrder> List<S> saveAll(List<S> entities);

	List<ChiTietOrder> findAllById(List<Integer> ids);

	List<ChiTietOrder> findAll(Sort sort);

	Page<ChiTietOrder> findAll(Pageable pageable);

	List<ChiTietOrder> findAll();

	<S extends ChiTietOrder> Optional<S> findOne(Example<S> example);

	<S extends ChiTietOrder> S save(S entity);

}
