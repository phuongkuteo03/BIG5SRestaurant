
package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.store.entity.CaLamViec;

public interface CaLamViecService {

	<S extends CaLamViec> List<S> findAll(Example<S> example, Sort sort);

	<S extends CaLamViec> List<S> findAll(Example<S> example);

	void deleteAll();

	CaLamViec getReferenceById(String id);

	void deleteAll(List<? extends CaLamViec> entities);

	void deleteAllById(List<? extends String> ids);

	CaLamViec getById(String id);

	void delete(CaLamViec entity);

	CaLamViec getOne(String id);

	void deleteById(String id);

	void deleteAllInBatch();

	long count();

	<S extends CaLamViec, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<String> ids);

	<S extends CaLamViec> boolean exists(Example<S> example);

	void deleteAllInBatch(List<CaLamViec> entities);

	<S extends CaLamViec> long count(Example<S> example);

	boolean existsById(String id);

	void deleteInBatch(List<CaLamViec> entities);

	CaLamViec findById(String id);

	<S extends CaLamViec> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends CaLamViec> List<S> saveAllAndFlush(List<S> entities);

	<S extends CaLamViec> S saveAndFlush(S entity);

	void flush();

	<S extends CaLamViec> List<S> saveAll(List<S> entities);

	List<CaLamViec> findAllById(List<String> ids);

	List<CaLamViec> findAll(Sort sort);

	Page<CaLamViec> findAll(Pageable pageable);

	List<CaLamViec> findAll();

	<S extends CaLamViec> Optional<S> findOne(Example<S> example);

	<S extends CaLamViec> S save(S entity);

}
