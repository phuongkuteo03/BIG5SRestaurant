package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.store.entity.MatHang;

public interface MatHangService {

	<S extends MatHang> List<S> findAll(Example<S> example, Sort sort);

	<S extends MatHang> List<S> findAll(Example<S> example);

	void deleteAll();

	MatHang getReferenceById(Integer id);

	void deleteAll(Iterable<? extends MatHang> entities);

	void deleteAllById(Iterable<? extends Integer> ids);

	MatHang getById(Integer id);

	void delete(MatHang entity);

	MatHang getOne(Integer id);

	void deleteById(Integer id);

	void deleteAllInBatch();

	long count();

	<S extends MatHang, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(Iterable<Integer> ids);

	<S extends MatHang> boolean exists(Example<S> example);

	void deleteAllInBatch(Iterable<MatHang> entities);

	<S extends MatHang> long count(Example<S> example);

	boolean existsById(Integer id);

	void deleteInBatch(Iterable<MatHang> entities);

	MatHang findById(Integer id);

	<S extends MatHang> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends MatHang> List<S> saveAllAndFlush(Iterable<S> entities);

	<S extends MatHang> S saveAndFlush(S entity);

	void flush();

	<S extends MatHang> List<S> saveAll(Iterable<S> entities);

	List<MatHang> findAllById(Iterable<Integer> ids);

	List<MatHang> findAll(Sort sort);

	Page<MatHang> findAll(Pageable pageable);

	List<MatHang> findAll();

	<S extends MatHang> Optional<S> findOne(Example<S> example);

	<S extends MatHang> S save(S entity);

}
