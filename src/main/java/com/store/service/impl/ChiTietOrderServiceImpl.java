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

import com.store.dao.ChiTietOrderDAO;
import com.store.entity.ChiTietOrder;
import com.store.service.ChiTietOrderService;

@Service
public class ChiTietOrderServiceImpl implements ChiTietOrderService{
	@Autowired
	ChiTietOrderDAO chiTietOrderDAO;

	@Override
	public List<ChiTietOrder> findChiTietByOrder(Integer id) {
		return chiTietOrderDAO.findChiTietByOrder(id);
	}

	@Override
	public <S extends ChiTietOrder> S save(S entity) {
		return chiTietOrderDAO.save(entity);
	}

	@Override
	public <S extends ChiTietOrder> Optional<S> findOne(Example<S> example) {
		return chiTietOrderDAO.findOne(example);
	}

	@Override
	public List<ChiTietOrder> findAll() {
		return chiTietOrderDAO.findAll();
	}

	@Override
	public Page<ChiTietOrder> findAll(Pageable pageable) {
		return chiTietOrderDAO.findAll(pageable);
	}

	@Override
	public List<ChiTietOrder> findAll(Sort sort) {
		return chiTietOrderDAO.findAll(sort);
	}

	@Override
	public List<ChiTietOrder> findAllById(List<Integer> ids) {
		return chiTietOrderDAO.findAllById(ids);
	}

	@Override
	public <S extends ChiTietOrder> List<S> saveAll(List<S> entities) {
		return chiTietOrderDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		chiTietOrderDAO.flush();
	}

	@Override
	public <S extends ChiTietOrder> S saveAndFlush(S entity) {
		return chiTietOrderDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends ChiTietOrder> List<S> saveAllAndFlush(List<S> entities) {
		return chiTietOrderDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends ChiTietOrder> Page<S> findAll(Example<S> example, Pageable pageable) {
		return chiTietOrderDAO.findAll(example, pageable);
	}

	@Override
	public ChiTietOrder findById(Integer id) {
		return chiTietOrderDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<ChiTietOrder> entities) {
		chiTietOrderDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return chiTietOrderDAO.existsById(id);
	}

	@Override
	public <S extends ChiTietOrder> long count(Example<S> example) {
		return chiTietOrderDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<ChiTietOrder> entities) {
		chiTietOrderDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends ChiTietOrder> boolean exists(Example<S> example) {
		return chiTietOrderDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<Integer> ids) {
		chiTietOrderDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends ChiTietOrder, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return chiTietOrderDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return chiTietOrderDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		chiTietOrderDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(Integer id) {
		chiTietOrderDAO.deleteById(id);
	}

	@Override
	public ChiTietOrder getOne(Integer id) {
		return chiTietOrderDAO.getOne(id);
	}

	@Override
	public void delete(ChiTietOrder entity) {
		chiTietOrderDAO.delete(entity);
	}

	@Override
	public ChiTietOrder getById(Integer id) {
		return chiTietOrderDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends Integer> ids) {
		chiTietOrderDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends ChiTietOrder> entities) {
		chiTietOrderDAO.deleteAll(entities);
	}

	@Override
	public ChiTietOrder getReferenceById(Integer id) {
		return chiTietOrderDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		chiTietOrderDAO.deleteAll();
	}

	@Override
	public <S extends ChiTietOrder> List<S> findAll(Example<S> example) {
		return chiTietOrderDAO.findAll(example);
	}

	@Override
	public <S extends ChiTietOrder> List<S> findAll(Example<S> example, Sort sort) {
		return chiTietOrderDAO.findAll(example, sort);
	}

	
	
}
