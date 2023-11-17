package com.store.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Service;

import com.store.dao.TaiKhoanDAO;
import com.store.entity.TaiKhoan;
import com.store.service.TaiKhoanService;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {
	@Autowired
	TaiKhoanDAO taiKhoanDAO;
	@Autowired
	BCryptPasswordEncoder pe;

	@Override
	public <S extends TaiKhoan> S save(S entity) {
		return taiKhoanDAO.save(entity);
	}

	@Override
	public <S extends TaiKhoan> Optional<S> findOne(Example<S> example) {
		return taiKhoanDAO.findOne(example);
	}

	@Override
	public List<TaiKhoan> findAll() {
		return taiKhoanDAO.findAll();
	}

	@Override
	public Page<TaiKhoan> findAll(Pageable pageable) {
		return taiKhoanDAO.findAll(pageable);
	}

	@Override
	public List<TaiKhoan> findAll(Sort sort) {
		return taiKhoanDAO.findAll(sort);
	}

	@Override
	public List<TaiKhoan> findAllById(List<String> ids) {
		return taiKhoanDAO.findAllById(ids);
	}

	@Override
	public <S extends TaiKhoan> List<S> saveAll(List<S> entities) {
		return taiKhoanDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		taiKhoanDAO.flush();
	}

	@Override
	public <S extends TaiKhoan> S saveAndFlush(S entity) {
		return taiKhoanDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends TaiKhoan> List<S> saveAllAndFlush(List<S> entities) {
		return taiKhoanDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends TaiKhoan> Page<S> findAll(Example<S> example, Pageable pageable) {
		return taiKhoanDAO.findAll(example, pageable);
	}

	@Override
	public TaiKhoan findById(String id) {
		return taiKhoanDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<TaiKhoan> entities) {
		taiKhoanDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return taiKhoanDAO.existsById(id);
	}

	@Override
	public <S extends TaiKhoan> long count(Example<S> example) {
		return taiKhoanDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<TaiKhoan> entities) {
		taiKhoanDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends TaiKhoan> boolean exists(Example<S> example) {
		return taiKhoanDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<String> ids) {
		taiKhoanDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends TaiKhoan, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return taiKhoanDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return taiKhoanDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		taiKhoanDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(String id) {
		taiKhoanDAO.deleteById(id);
	}

	@Override
	public TaiKhoan getOne(String id) {
		return taiKhoanDAO.getOne(id);
	}

	@Override
	public void delete(TaiKhoan entity) {
		taiKhoanDAO.delete(entity);
	}

	@Override
	public TaiKhoan getById(String id) {
		return taiKhoanDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends String> ids) {
		taiKhoanDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends TaiKhoan> entities) {
		taiKhoanDAO.deleteAll(entities);
	}

	@Override
	public TaiKhoan getReferenceById(String id) {
		return taiKhoanDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		taiKhoanDAO.deleteAll();
	}

	@Override
	public <S extends TaiKhoan> List<S> findAll(Example<S> example) {
		return taiKhoanDAO.findAll(example);
	}

	@Override
	public <S extends TaiKhoan> List<S> findAll(Example<S> example, Sort sort) {
		return taiKhoanDAO.findAll(example, sort);
	}

	@Override
	public List<TaiKhoan> getAdministrators() {
		return taiKhoanDAO.getAdministrators();
	}

	@Override
	public void loginFromOAuth2(OAuth2AuthenticationToken oauth2) {
		// String fullname = oauth2.getPrincipal().getAttribute("name");
		String email = oauth2.getPrincipal().getAttribute("email");
		String password = Long.toHexString(System.currentTimeMillis());

		UserDetails user = User.withUsername(email)
				.password(pe.encode(password)).roles("CUST").build();
		Authentication auth = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
		SecurityContextHolder.getContext().setAuthentication(auth);
	}

}
