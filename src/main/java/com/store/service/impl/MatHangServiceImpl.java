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

import com.store.dao.MatHangDAO;
import com.store.entity.MatHang;
import com.store.service.MatHangService;

@Service
public class MatHangServiceImpl implements MatHangService{
	@Autowired
	MatHangDAO matHangDAO;

	@Override
	public <S extends MatHang> S save(S entity) {
		return matHangDAO.save(entity);
	}

	@Override
	public <S extends MatHang> Optional<S> findOne(Example<S> example) {
		return matHangDAO.findOne(example);
	}

	@Override
	public List<MatHang> findAll() {
		return matHangDAO.findAll();
	}

	@Override
	public Page<MatHang> findAll(Pageable pageable) {
		return matHangDAO.findAll(pageable);
	}

	@Override
	public List<MatHang> findAll(Sort sort) {
		return matHangDAO.findAll(sort);
	}

	@Override
	public List<MatHang> findAllById(Iterable<Integer> ids) {
		return matHangDAO.findAllById(ids);
	}

	@Override
	public <S extends MatHang> List<S> saveAll(Iterable<S> entities) {
		return matHangDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		matHangDAO.flush();
	}

	@Override
	public <S extends MatHang> S saveAndFlush(S entity) {
		return matHangDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends MatHang> List<S> saveAllAndFlush(Iterable<S> entities) {
		return matHangDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends MatHang> Page<S> findAll(Example<S> example, Pageable pageable) {
		return matHangDAO.findAll(example, pageable);
	}

	@Override
	public MatHang findById(Integer id) {
		return matHangDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(Iterable<MatHang> entities) {
		matHangDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return matHangDAO.existsById(id);
	}

	@Override
	public <S extends MatHang> long count(Example<S> example) {
		return matHangDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<MatHang> entities) {
		matHangDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends MatHang> boolean exists(Example<S> example) {
		return matHangDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		matHangDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends MatHang, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return matHangDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return matHangDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		matHangDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(Integer id) {
		matHangDAO.deleteById(id);
	}

	@Override
	public MatHang getOne(Integer id) {
		return matHangDAO.getOne(id);
	}

	@Override
	public void delete(MatHang entity) {
		matHangDAO.delete(entity);
	}

	@Override
	public MatHang getById(Integer id) {
		return matHangDAO.getById(id);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		matHangDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends MatHang> entities) {
		matHangDAO.deleteAll(entities);
	}

	@Override
	public MatHang getReferenceById(Integer id) {
		return matHangDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		matHangDAO.deleteAll();
	}

	@Override
	public <S extends MatHang> List<S> findAll(Example<S> example) {
		return matHangDAO.findAll(example);
	}

	@Override
	public <S extends MatHang> List<S> findAll(Example<S> example, Sort sort) {
		return matHangDAO.findAll(example, sort);
	}

	
}
