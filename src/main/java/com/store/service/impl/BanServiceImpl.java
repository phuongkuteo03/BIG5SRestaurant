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

import com.store.dao.BanDAO;
import com.store.entity.Ban;
import com.store.entity.Order;
import com.store.service.BanService;

@Service
public class BanServiceImpl implements BanService{
	@Autowired
	BanDAO banDAO;

	@Override
	public Order getOrderByTable(Ban id) {
		return banDAO.getOrderByTable(id);
	}

	@Override
	public <S extends Ban> S save(S entity) {
		return banDAO.save(entity);
	}

	@Override
	public <S extends Ban> Optional<S> findOne(Example<S> example) {
		return banDAO.findOne(example);
	}

	@Override
	public List<Ban> findAll() {
		return banDAO.findAll();
	}

	@Override
	public Page<Ban> findAll(Pageable pageable) {
		return banDAO.findAll(pageable);
	}

	@Override
	public List<Ban> findAll(Sort sort) {
		return banDAO.findAll(sort);
	}

	@Override
	public List<Ban> findAllById(List<Integer> ids) {
		return banDAO.findAllById(ids);
	}

	@Override
	public <S extends Ban> List<S> saveAll(List<S> entities) {
		return banDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		banDAO.flush();
	}

	@Override
	public <S extends Ban> S saveAndFlush(S entity) {
		return banDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends Ban> List<S> saveAllAndFlush(List<S> entities) {
		return banDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends Ban> Page<S> findAll(Example<S> example, Pageable pageable) {
		return banDAO.findAll(example, pageable);
	}

	@Override
	public Ban findById(Integer id) {
		return banDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<Ban> entities) {
		banDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return banDAO.existsById(id);
	}

	@Override
	public <S extends Ban> long count(Example<S> example) {
		return banDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<Ban> entities) {
		banDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends Ban> boolean exists(Example<S> example) {
		return banDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<Integer> ids) {
		banDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends Ban, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return banDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return banDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		banDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(Integer id) {
		banDAO.deleteById(id);
	}

	@Override
	public Ban getOne(Integer id) {
		return banDAO.getOne(id);
	}

	@Override
	public void delete(Ban entity) {
		banDAO.delete(entity);
	}

	@Override
	public Ban getById(Integer id) {
		return banDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends Integer> ids) {
		banDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends Ban> entities) {
		banDAO.deleteAll(entities);
	}

	@Override
	public Ban getReferenceById(Integer id) {
		return banDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		banDAO.deleteAll();
	}

	@Override
	public <S extends Ban> List<S> findAll(Example<S> example) {
		return banDAO.findAll(example);
	}

	@Override
	public <S extends Ban> List<S> findAll(Example<S> example, Sort sort) {
		return banDAO.findAll(example, sort);
	}

	@Override
	public List<Ban> getTableWhileNull() {
		return banDAO.getTableWhileNull();
	}
}
