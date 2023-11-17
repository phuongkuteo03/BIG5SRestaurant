package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.store.entity.VaiTro;

public interface VaiTroService {

	<S extends VaiTro> List<S> findAll(Example<S> example, Sort sort);

	<S extends VaiTro> List<S> findAll(Example<S> example);

	void deleteAll();

	VaiTro getReferenceById(String id);

	void deleteAll(List<? extends VaiTro> entities);

	void deleteAllById(List<? extends String> ids);

	VaiTro getById(String id);

	void delete(VaiTro entity);

	VaiTro getOne(String id);

	void deleteById(String id);

	void deleteAllInBatch();

	long count();

	<S extends VaiTro, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<String> ids);

	<S extends VaiTro> boolean exists(Example<S> example);

	void deleteAllInBatch(List<VaiTro> entities);

	<S extends VaiTro> long count(Example<S> example);

	boolean existsById(String id);

	void deleteInBatch(List<VaiTro> entities);

	VaiTro findById(String id);

	<S extends VaiTro> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends VaiTro> List<S> saveAllAndFlush(List<S> entities);

	<S extends VaiTro> S saveAndFlush(S entity);

	void flush();

	<S extends VaiTro> List<S> saveAll(List<S> entities);

	List<VaiTro> findAllById(List<String> ids);

	List<VaiTro> findAll(Sort sort);

	Page<VaiTro> findAll(Pageable pageable);

	List<VaiTro> findAll();

	<S extends VaiTro> Optional<S> findOne(Example<S> example);

	<S extends VaiTro> S save(S entity);

	

}
