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
import org.springframework.stereotype.Service;

import com.store.dao.CaLamViecDAO;
import com.store.entity.CaLamViec;
import com.store.service.CaLamViecService;

@Service
public class CaLamViecServiceImpl implements CaLamViecService{
	@Autowired
	CaLamViecDAO caLamViecDAO;

	@Override
	public <S extends CaLamViec> S save(S entity) {
		return caLamViecDAO.save(entity);
	}

	@Override
	public <S extends CaLamViec> Optional<S> findOne(Example<S> example) {
		return caLamViecDAO.findOne(example);
	}

	@Override
	public List<CaLamViec> findAll() {
		return caLamViecDAO.findAll();
	}

	@Override
	public Page<CaLamViec> findAll(Pageable pageable) {
		return caLamViecDAO.findAll(pageable);
	}

	@Override
	public List<CaLamViec> findAll(Sort sort) {
		return caLamViecDAO.findAll(sort);
	}

	@Override
	public List<CaLamViec> findAllById(List<String> ids) {
		return caLamViecDAO.findAllById(ids);
	}

	@Override
	public <S extends CaLamViec> List<S> saveAll(List<S> entities) {
		return caLamViecDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		caLamViecDAO.flush();
	}

	@Override
	public <S extends CaLamViec> S saveAndFlush(S entity) {
		return caLamViecDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends CaLamViec> List<S> saveAllAndFlush(List<S> entities) {
		return caLamViecDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends CaLamViec> Page<S> findAll(Example<S> example, Pageable pageable) {
		return caLamViecDAO.findAll(example, pageable);
	}

	@Override
	public CaLamViec findById(String id) {
		return caLamViecDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<CaLamViec> entities) {
		caLamViecDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return caLamViecDAO.existsById(id);
	}

	@Override
	public <S extends CaLamViec> long count(Example<S> example) {
		return caLamViecDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<CaLamViec> entities) {
		caLamViecDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends CaLamViec> boolean exists(Example<S> example) {
		return caLamViecDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<String> ids) {
		caLamViecDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends CaLamViec, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return caLamViecDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return caLamViecDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		caLamViecDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(String id) {
		caLamViecDAO.deleteById(id);
	}

	@Override
	public CaLamViec getOne(String id) {
		return caLamViecDAO.getOne(id);
	}

	@Override
	public void delete(CaLamViec entity) {
		caLamViecDAO.delete(entity);
	}

	@Override
	public CaLamViec getById(String id) {
		return caLamViecDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends String> ids) {
		caLamViecDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends CaLamViec> entities) {
		caLamViecDAO.deleteAll(entities);
	}

	@Override
	public CaLamViec getReferenceById(String id) {
		return caLamViecDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		caLamViecDAO.deleteAll();
	}

	@Override
	public <S extends CaLamViec> List<S> findAll(Example<S> example) {
		return caLamViecDAO.findAll(example);
	}

	@Override
	public <S extends CaLamViec> List<S> findAll(Example<S> example, Sort sort) {
		return caLamViecDAO.findAll(example, sort);
	}
	
}
