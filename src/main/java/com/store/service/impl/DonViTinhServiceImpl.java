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

import com.store.dao.DonViTinhDAO;
import com.store.entity.DonViTinh;
import com.store.service.DonViTinhService;

@Service
public class DonViTinhServiceImpl implements DonViTinhService{
	@Autowired
	DonViTinhDAO donViTinhDAO;

	@Override
	public <S extends DonViTinh> S save(S entity) {
		return donViTinhDAO.save(entity);
	}

	@Override
	public <S extends DonViTinh> Optional<S> findOne(Example<S> example) {
		return donViTinhDAO.findOne(example);
	}

	@Override
	public List<DonViTinh> findAll() {
		return donViTinhDAO.findAll();
	}

	@Override
	public Page<DonViTinh> findAll(Pageable pageable) {
		return donViTinhDAO.findAll(pageable);
	}

	@Override
	public List<DonViTinh> findAll(Sort sort) {
		return donViTinhDAO.findAll(sort);
	}

	@Override
	public List<DonViTinh> findAllById(List<String> ids) {
		return donViTinhDAO.findAllById(ids);
	}

	@Override
	public <S extends DonViTinh> List<S> saveAll(List<S> entities) {
		return donViTinhDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		donViTinhDAO.flush();
	}

	@Override
	public <S extends DonViTinh> S saveAndFlush(S entity) {
		return donViTinhDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends DonViTinh> List<S> saveAllAndFlush(List<S> entities) {
		return donViTinhDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends DonViTinh> Page<S> findAll(Example<S> example, Pageable pageable) {
		return donViTinhDAO.findAll(example, pageable);
	}

	@Override
	public DonViTinh findById(String id) {
		return donViTinhDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<DonViTinh> entities) {
		donViTinhDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return donViTinhDAO.existsById(id);
	}

	@Override
	public <S extends DonViTinh> long count(Example<S> example) {
		return donViTinhDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<DonViTinh> entities) {
		donViTinhDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends DonViTinh> boolean exists(Example<S> example) {
		return donViTinhDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<String> ids) {
		donViTinhDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends DonViTinh, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return donViTinhDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return donViTinhDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		donViTinhDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(String id) {
		donViTinhDAO.deleteById(id);
	}

	@Override
	public DonViTinh getOne(String id) {
		return donViTinhDAO.getOne(id);
	}

	@Override
	public void delete(DonViTinh entity) {
		donViTinhDAO.delete(entity);
	}

	@Override
	public DonViTinh getById(String id) {
		return donViTinhDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends String> ids) {
		donViTinhDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends DonViTinh> entities) {
		donViTinhDAO.deleteAll(entities);
	}

	@Override
	public DonViTinh getReferenceById(String id) {
		return donViTinhDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		donViTinhDAO.deleteAll();
	}

	@Override
	public <S extends DonViTinh> List<S> findAll(Example<S> example) {
		return donViTinhDAO.findAll(example);
	}

	@Override
	public <S extends DonViTinh> List<S> findAll(Example<S> example, Sort sort) {
		return donViTinhDAO.findAll(example, sort);
	}

	
}
