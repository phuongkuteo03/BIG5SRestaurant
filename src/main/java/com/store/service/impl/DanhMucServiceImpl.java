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

import com.store.dao.DanhMucDAO;
import com.store.entity.DanhMuc;
import com.store.service.DanhMucService;

@Service
public class DanhMucServiceImpl implements DanhMucService{
	@Autowired
	DanhMucDAO danhMucDAO;

	@Override
	public <S extends DanhMuc> S save(S entity) {
		return danhMucDAO.save(entity);
	}

	@Override
	public <S extends DanhMuc> Optional<S> findOne(Example<S> example) {
		return danhMucDAO.findOne(example);
	}

	@Override
	public List<DanhMuc> findAll() {
		return danhMucDAO.findAll();
	}

	@Override
	public Page<DanhMuc> findAll(Pageable pageable) {
		return danhMucDAO.findAll(pageable);
	}

	@Override
	public List<DanhMuc> findAll(Sort sort) {
		return danhMucDAO.findAll(sort);
	}

	@Override
	public List<DanhMuc> findAllById(List<String> ids) {
		return danhMucDAO.findAllById(ids);
	}

	@Override
	public <S extends DanhMuc> List<S> saveAll(List<S> entities) {
		return danhMucDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		danhMucDAO.flush();
	}

	@Override
	public <S extends DanhMuc> S saveAndFlush(S entity) {
		return danhMucDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends DanhMuc> List<S> saveAllAndFlush(List<S> entities) {
		return danhMucDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends DanhMuc> Page<S> findAll(Example<S> example, Pageable pageable) {
		return danhMucDAO.findAll(example, pageable);
	}

	@Override
	public DanhMuc findById(String id) {
		return danhMucDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<DanhMuc> entities) {
		danhMucDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return danhMucDAO.existsById(id);
	}

	@Override
	public <S extends DanhMuc> long count(Example<S> example) {
		return danhMucDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<DanhMuc> entities) {
		danhMucDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends DanhMuc> boolean exists(Example<S> example) {
		return danhMucDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<String> ids) {
		danhMucDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends DanhMuc, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return danhMucDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return danhMucDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		danhMucDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(String id) {
		danhMucDAO.deleteById(id);
	}

	@Override
	public DanhMuc getOne(String id) {
		return danhMucDAO.getOne(id);
	}

	@Override
	public void delete(DanhMuc entity) {
		danhMucDAO.delete(entity);
	}

	@Override
	public DanhMuc getById(String id) {
		return danhMucDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends String> ids) {
		danhMucDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends DanhMuc> entities) {
		danhMucDAO.deleteAll(entities);
	}

	@Override
	public DanhMuc getReferenceById(String id) {
		return danhMucDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		danhMucDAO.deleteAll();
	}

	@Override
	public <S extends DanhMuc> List<S> findAll(Example<S> example) {
		return danhMucDAO.findAll(example);
	}

	@Override
	public <S extends DanhMuc> List<S> findAll(Example<S> example, Sort sort) {
		return danhMucDAO.findAll(example, sort);
	}
	
}
