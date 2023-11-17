package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.store.entity.NhaCungCap;

public interface NhaCungCapService{

	<S extends NhaCungCap> List<S> findAll(Example<S> example, Sort sort);

	<S extends NhaCungCap> List<S> findAll(Example<S> example);

	void deleteAll();

	NhaCungCap getReferenceById(Integer id);

	void deleteAll(List<? extends NhaCungCap> entities);

	void deleteAllById(List<? extends Integer> ids);

	NhaCungCap getById(Integer id);

	void delete(NhaCungCap entity);

	NhaCungCap getOne(Integer id);

	void deleteById(Integer id);

	void deleteAllInBatch();

	long count();

	<S extends NhaCungCap, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<Integer> ids);

	<S extends NhaCungCap> boolean exists(Example<S> example);

	void deleteAllInBatch(List<NhaCungCap> entities);

	<S extends NhaCungCap> long count(Example<S> example);

	boolean existsById(Integer id);

	void deleteInBatch(List<NhaCungCap> entities);

	NhaCungCap findById(Integer id);

	<S extends NhaCungCap> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends NhaCungCap> List<S> saveAllAndFlush(List<S> entities);

	<S extends NhaCungCap> S saveAndFlush(S entity);

	void flush();

	<S extends NhaCungCap> List<S> saveAll(List<S> entities);

	List<NhaCungCap> findAllById(List<Integer> ids);

	List<NhaCungCap> findAll(Sort sort);

	Page<NhaCungCap> findAll(Pageable pageable);

	List<NhaCungCap> findAll();

	<S extends NhaCungCap> Optional<S> findOne(Example<S> example);

	<S extends NhaCungCap> S save(S entity);

	

}
