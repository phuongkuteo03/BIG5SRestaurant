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

import com.store.dao.KhachHangDAO;
import com.store.entity.KhachHang;
import com.store.service.KhachHangService;

@Service
public class KhachHangServiceImpl implements KhachHangService{
	@Autowired
	KhachHangDAO khachHangDAO;

	@Override
	public <S extends KhachHang> S save(S entity) {
		return khachHangDAO.save(entity);
	}

	@Override
	public <S extends KhachHang> Optional<S> findOne(Example<S> example) {
		return khachHangDAO.findOne(example);
	}

	@Override
	public List<KhachHang> findAll() {
		return khachHangDAO.findAll();
	}

	@Override
	public Page<KhachHang> findAll(Pageable pageable) {
		return khachHangDAO.findAll(pageable);
	}

	@Override
	public List<KhachHang> findAll(Sort sort) {
		return khachHangDAO.findAll(sort);
	}

	@Override
	public List<KhachHang> findAllById(List<Integer> ids) {
		return khachHangDAO.findAllById(ids);
	}

	@Override
	public <S extends KhachHang> List<S> saveAll(List<S> entities) {
		return khachHangDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		khachHangDAO.flush();
	}

	@Override
	public <S extends KhachHang> S saveAndFlush(S entity) {
		return khachHangDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends KhachHang> List<S> saveAllAndFlush(List<S> entities) {
		return khachHangDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends KhachHang> Page<S> findAll(Example<S> example, Pageable pageable) {
		return khachHangDAO.findAll(example, pageable);
	}

	@Override
	public KhachHang findById(Integer id) {
		return khachHangDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<KhachHang> entities) {
		khachHangDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return khachHangDAO.existsById(id);
	}

	@Override
	public <S extends KhachHang> long count(Example<S> example) {
		return khachHangDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<KhachHang> entities) {
		khachHangDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends KhachHang> boolean exists(Example<S> example) {
		return khachHangDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<Integer> ids) {
		khachHangDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends KhachHang, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return khachHangDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return khachHangDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		khachHangDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(Integer id) {
		khachHangDAO.deleteById(id);
	}

	@Override
	public KhachHang getOne(Integer id) {
		return khachHangDAO.getOne(id);
	}

	@Override
	public void delete(KhachHang entity) {
		khachHangDAO.delete(entity);
	}

	@Override
	public KhachHang getById(Integer id) {
		return khachHangDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends Integer> ids) {
		khachHangDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends KhachHang> entities) {
		khachHangDAO.deleteAll(entities);
	}

	@Override
	public KhachHang getReferenceById(Integer id) {
		return khachHangDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
	}

	@Override
	public <S extends KhachHang> List<S> findAll(Example<S> example) {
		return khachHangDAO.findAll(example);
	}

	@Override
	public <S extends KhachHang> List<S> findAll(Example<S> example, Sort sort) {
		return khachHangDAO.findAll(example, sort);
	}
	
}
