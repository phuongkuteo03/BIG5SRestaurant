package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.store.entity.ChiTietPhieuBep;

public interface ChiTietPhieuBepService {

	<S extends ChiTietPhieuBep> List<S> findAll(Example<S> example, Sort sort);

	<S extends ChiTietPhieuBep> List<S> findAll(Example<S> example);

	void deleteAll();

	ChiTietPhieuBep getReferenceById(Integer id);

	void deleteAll(List<? extends ChiTietPhieuBep> entities);

	void deleteAllById(List<? extends Integer> ids);

	ChiTietPhieuBep getById(Integer id);

	void delete(ChiTietPhieuBep entity);

	ChiTietPhieuBep getOne(Integer id);

	void deleteById(Integer id);

	void deleteAllInBatch();

	long count();

	<S extends ChiTietPhieuBep, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<Integer> ids);

	<S extends ChiTietPhieuBep> boolean exists(Example<S> example);

	void deleteAllInBatch(List<ChiTietPhieuBep> entities);

	<S extends ChiTietPhieuBep> long count(Example<S> example);

	boolean existsById(Integer id);

	void deleteInBatch(List<ChiTietPhieuBep> entities);

	ChiTietPhieuBep findById(Integer id);

	<S extends ChiTietPhieuBep> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends ChiTietPhieuBep> List<S> saveAllAndFlush(List<S> entities);

	<S extends ChiTietPhieuBep> S saveAndFlush(S entity);

	void flush();

	<S extends ChiTietPhieuBep> List<S> saveAll(List<S> entities);

	List<ChiTietPhieuBep> findAllById(List<Integer> ids);

	List<ChiTietPhieuBep> findAll(Sort sort);

	Page<ChiTietPhieuBep> findAll(Pageable pageable);

	List<ChiTietPhieuBep> findAll();

	<S extends ChiTietPhieuBep> Optional<S> findOne(Example<S> example);

	<S extends ChiTietPhieuBep> S save(S entity);

}
