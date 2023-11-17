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

import com.store.dao.HangMucDAO;
import com.store.entity.HangMuc;
import com.store.service.HangMucService;

@Service
public class HangMucServiceImpl implements HangMucService{
	@Autowired
	HangMucDAO hangMucDAO;

	@Override
	public <S extends HangMuc> S save(S entity) {
		return hangMucDAO.save(entity);
	}

	@Override
	public <S extends HangMuc> Optional<S> findOne(Example<S> example) {
		return hangMucDAO.findOne(example);
	}

	@Override
	public List<HangMuc> findAll() {
		return hangMucDAO.findAll();
	}

	@Override
	public Page<HangMuc> findAll(Pageable pageable) {
		return hangMucDAO.findAll(pageable);
	}

	@Override
	public List<HangMuc> findAll(Sort sort) {
		return hangMucDAO.findAll(sort);
	}

	@Override
	public List<HangMuc> findAllById(List<String> ids) {
		return hangMucDAO.findAllById(ids);
	}

	@Override
	public <S extends HangMuc> List<S> saveAll(List<S> entities) {
		return hangMucDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		hangMucDAO.flush();
	}

	@Override
	public <S extends HangMuc> S saveAndFlush(S entity) {
		return hangMucDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends HangMuc> List<S> saveAllAndFlush(List<S> entities) {
		return hangMucDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends HangMuc> Page<S> findAll(Example<S> example, Pageable pageable) {
		return hangMucDAO.findAll(example, pageable);
	}

	@Override
	public HangMuc findById(String id) {
		return hangMucDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<HangMuc> entities) {
		hangMucDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return hangMucDAO.existsById(id);
	}

	@Override
	public <S extends HangMuc> long count(Example<S> example) {
		return hangMucDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<HangMuc> entities) {
		hangMucDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends HangMuc> boolean exists(Example<S> example) {
		return hangMucDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<String> ids) {
		hangMucDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends HangMuc, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return hangMucDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return hangMucDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		hangMucDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(String id) {
		hangMucDAO.deleteById(id);
	}

	@Override
	public HangMuc getOne(String id) {
		return hangMucDAO.getOne(id);
	}

	@Override
	public void delete(HangMuc entity) {
		hangMucDAO.delete(entity);
	}

	@Override
	public HangMuc getById(String id) {
		return hangMucDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends String> ids) {
		hangMucDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends HangMuc> entities) {
		hangMucDAO.deleteAll(entities);
	}

	@Override
	public HangMuc getReferenceById(String id) {
		return hangMucDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		hangMucDAO.deleteAll();
	}

	@Override
	public <S extends HangMuc> List<S> findAll(Example<S> example) {
		return hangMucDAO.findAll(example);
	}

	@Override
	public <S extends HangMuc> List<S> findAll(Example<S> example, Sort sort) {
		return hangMucDAO.findAll(example, sort);
	}
	
}
