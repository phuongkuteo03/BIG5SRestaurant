package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.store.entity.MenuMonAn;

public interface MenuMonAnService {

	List<MenuMonAn> findByCategory(String cid);

	<S extends MenuMonAn> List<S> findAll(Example<S> example, Sort sort);

	<S extends MenuMonAn> List<S> findAll(Example<S> example);

	void deleteAll();

	MenuMonAn getReferenceById(Integer id);

	void deleteAll(List<? extends MenuMonAn> entities);

	void deleteAllById(List<? extends Integer> ids);

	MenuMonAn getById(Integer id);

	void delete(MenuMonAn entity);

	MenuMonAn getOne(Integer id);

	void deleteById(Integer id);

	void deleteAllInBatch();

	long count();

	<S extends MenuMonAn, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<Integer> ids);

	<S extends MenuMonAn> boolean exists(Example<S> example);

	void deleteAllInBatch(List<MenuMonAn> entities);

	<S extends MenuMonAn> long count(Example<S> example);

	boolean existsById(Integer id);

	void deleteInBatch(List<MenuMonAn> entities);

	MenuMonAn findById(Integer id);

	<S extends MenuMonAn> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends MenuMonAn> List<S> saveAllAndFlush(List<S> entities);

	<S extends MenuMonAn> S saveAndFlush(S entity);

	void flush();

	<S extends MenuMonAn> List<S> saveAll(List<S> entities);

	List<MenuMonAn> findAllById(List<Integer> ids);

	List<MenuMonAn> findAll(Sort sort);

	Page<MenuMonAn> findAll(Pageable pageable);

	List<MenuMonAn> findAll();

	<S extends MenuMonAn> Optional<S> findOne(Example<S> example);

	<S extends MenuMonAn> S save(S entity);


}
