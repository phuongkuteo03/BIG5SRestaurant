package com.store.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;

import com.store.entity.TaiKhoan;

public interface TaiKhoanService {

	
	List<TaiKhoan> getAdministrators();

	public void loginFromOAuth2(OAuth2AuthenticationToken oauth2);

	<S extends TaiKhoan> List<S> findAll(Example<S> example, Sort sort);

	<S extends TaiKhoan> List<S> findAll(Example<S> example);

	void deleteAll();

	TaiKhoan getReferenceById(String id);

	void deleteAll(List<? extends TaiKhoan> entities);

	void deleteAllById(List<? extends String> ids);

	TaiKhoan getById(String id);

	void delete(TaiKhoan entity);

	TaiKhoan getOne(String id);

	void deleteById(String id);

	void deleteAllInBatch();

	long count();

	<S extends TaiKhoan, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void deleteAllByIdInBatch(List<String> ids);

	<S extends TaiKhoan> boolean exists(Example<S> example);

	void deleteAllInBatch(List<TaiKhoan> entities);

	<S extends TaiKhoan> long count(Example<S> example);

	boolean existsById(String id);

	void deleteInBatch(List<TaiKhoan> entities);

	TaiKhoan findById(String id);

	<S extends TaiKhoan> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends TaiKhoan> List<S> saveAllAndFlush(List<S> entities);

	<S extends TaiKhoan> S saveAndFlush(S entity);

	void flush();

	<S extends TaiKhoan> List<S> saveAll(List<S> entities);

	List<TaiKhoan> findAllById(List<String> ids);

	List<TaiKhoan> findAll(Sort sort);

	Page<TaiKhoan> findAll(Pageable pageable);

	List<TaiKhoan> findAll();

	<S extends TaiKhoan> Optional<S> findOne(Example<S> example);

	<S extends TaiKhoan> S save(S entity);

}
