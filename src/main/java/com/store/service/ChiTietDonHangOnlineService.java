package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.store.entity.ChiTietDonHangOnline;

public interface ChiTietDonHangOnlineService {

	<S extends ChiTietDonHangOnline> List<S> findAll(Example<S> example, Sort sort);

	<S extends ChiTietDonHangOnline> List<S> findAll(Example<S> example);

	void deleteAll();

	ChiTietDonHangOnline getReferenceById(Integer id);

	void deleteAll(List<? extends ChiTietDonHangOnline> entities);

	void deleteAllById(List<? extends Integer> ids);

	ChiTietDonHangOnline getById(Integer id);

	void delete(ChiTietDonHangOnline entity);

	ChiTietDonHangOnline getOne(Integer id);

	void deleteById(Integer id);

	void deleteAllInBatch();

	long count();

	<S extends ChiTietDonHangOnline, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<Integer> ids);

	<S extends ChiTietDonHangOnline> boolean exists(Example<S> example);

	void deleteAllInBatch(List<ChiTietDonHangOnline> entities);

	<S extends ChiTietDonHangOnline> long count(Example<S> example);

	boolean existsById(Integer id);

	void deleteInBatch(List<ChiTietDonHangOnline> entities);

	ChiTietDonHangOnline findById(Integer id);

	<S extends ChiTietDonHangOnline> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends ChiTietDonHangOnline> List<S> saveAllAndFlush(List<S> entities);

	<S extends ChiTietDonHangOnline> S saveAndFlush(S entity);

	void flush();

	<S extends ChiTietDonHangOnline> List<S> saveAll(List<S> entities);

	List<ChiTietDonHangOnline> findAllById(List<Integer> ids);

	List<ChiTietDonHangOnline> findAll(Sort sort);

	Page<ChiTietDonHangOnline> findAll(Pageable pageable);

	List<ChiTietDonHangOnline> findAll();

	<S extends ChiTietDonHangOnline> Optional<S> findOne(Example<S> example);

	<S extends ChiTietDonHangOnline> S save(S entity);


}
