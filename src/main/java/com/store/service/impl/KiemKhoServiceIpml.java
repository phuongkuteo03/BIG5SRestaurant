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

import com.store.dao.KiemKhoDAO;
import com.store.entity.KiemKho;
import com.store.service.KiemKhoService;

@Service
public class KiemKhoServiceIpml implements KiemKhoService{
	
	@Autowired
	KiemKhoDAO kiemKhoDAO;

	@Override
	public <S extends KiemKho> S save(S entity) {
		return kiemKhoDAO.save(entity);
	}

	@Override
	public <S extends KiemKho> Optional<S> findOne(Example<S> example) {
		return kiemKhoDAO.findOne(example);
	}

	@Override
	public List<KiemKho> findAll() {
		return kiemKhoDAO.findAll();
	}

	@Override
	public Page<KiemKho> findAll(Pageable pageable) {
		return kiemKhoDAO.findAll(pageable);
	}

	@Override
	public List<KiemKho> findAll(Sort sort) {
		return kiemKhoDAO.findAll(sort);
	}

	@Override
	public List<KiemKho> findAllById(List<Integer> ids) {
		return kiemKhoDAO.findAllById(ids);
	}

	@Override
	public <S extends KiemKho> List<S> saveAll(List<S> entities) {
		return kiemKhoDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		kiemKhoDAO.flush();
	}

	@Override
	public <S extends KiemKho> S saveAndFlush(S entity) {
		return kiemKhoDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends KiemKho> List<S> saveAllAndFlush(List<S> entities) {
		return kiemKhoDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends KiemKho> Page<S> findAll(Example<S> example, Pageable pageable) {
		return kiemKhoDAO.findAll(example, pageable);
	}

	@Override
	public KiemKho findById(Integer id) {
		return kiemKhoDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<KiemKho> entities) {
		kiemKhoDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return kiemKhoDAO.existsById(id);
	}

	@Override
	public <S extends KiemKho> long count(Example<S> example) {
		return kiemKhoDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<KiemKho> entities) {
		kiemKhoDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends KiemKho> boolean exists(Example<S> example) {
		return kiemKhoDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<Integer> ids) {
		kiemKhoDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends KiemKho, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return kiemKhoDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return kiemKhoDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		kiemKhoDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(Integer id) {
		kiemKhoDAO.deleteById(id);
	}

	@Override
	public KiemKho getOne(Integer id) {
		return kiemKhoDAO.getOne(id);
	}

	@Override
	public void delete(KiemKho entity) {
		kiemKhoDAO.delete(entity);
	}

	@Override
	public KiemKho getById(Integer id) {
		return kiemKhoDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends Integer> ids) {
		kiemKhoDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends KiemKho> entities) {
		kiemKhoDAO.deleteAll(entities);
	}

	@Override
	public KiemKho getReferenceById(Integer id) {
		return kiemKhoDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		kiemKhoDAO.deleteAll();
	}

	@Override
	public <S extends KiemKho> List<S> findAll(Example<S> example) {
		return kiemKhoDAO.findAll(example);
	}

	@Override
	public <S extends KiemKho> List<S> findAll(Example<S> example, Sort sort) {
		return kiemKhoDAO.findAll(example, sort);
	}
	
	
}
