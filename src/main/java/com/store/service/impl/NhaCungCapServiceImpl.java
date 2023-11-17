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

import com.store.dao.NhaCungCapDAO;
import com.store.entity.NhaCungCap;
import com.store.service.NhaCungCapService;

@Service
public class NhaCungCapServiceImpl implements NhaCungCapService{
	@Autowired
	NhaCungCapDAO nhaCungCapDAO;

	@Override
	public <S extends NhaCungCap> S save(S entity) {
		return nhaCungCapDAO.save(entity);
	}

	@Override
	public <S extends NhaCungCap> Optional<S> findOne(Example<S> example) {
		return nhaCungCapDAO.findOne(example);
	}

	@Override
	public List<NhaCungCap> findAll() {
		return nhaCungCapDAO.findAll();
	}

	@Override
	public Page<NhaCungCap> findAll(Pageable pageable) {
		return nhaCungCapDAO.findAll(pageable);
	}

	@Override
	public List<NhaCungCap> findAll(Sort sort) {
		return nhaCungCapDAO.findAll(sort);
	}

	@Override
	public List<NhaCungCap> findAllById(List<Integer> ids) {
		return nhaCungCapDAO.findAllById(ids);
	}

	@Override
	public <S extends NhaCungCap> List<S> saveAll(List<S> entities) {
		return nhaCungCapDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		nhaCungCapDAO.flush();
	}

	@Override
	public <S extends NhaCungCap> S saveAndFlush(S entity) {
		return nhaCungCapDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends NhaCungCap> List<S> saveAllAndFlush(List<S> entities) {
		return nhaCungCapDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends NhaCungCap> Page<S> findAll(Example<S> example, Pageable pageable) {
		return nhaCungCapDAO.findAll(example, pageable);
	}

	@Override
	public NhaCungCap findById(Integer id) {
		return nhaCungCapDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<NhaCungCap> entities) {
		nhaCungCapDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return nhaCungCapDAO.existsById(id);
	}

	@Override
	public <S extends NhaCungCap> long count(Example<S> example) {
		return nhaCungCapDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<NhaCungCap> entities) {
		nhaCungCapDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends NhaCungCap> boolean exists(Example<S> example) {
		return nhaCungCapDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<Integer> ids) {
		nhaCungCapDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends NhaCungCap, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return nhaCungCapDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return nhaCungCapDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		nhaCungCapDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(Integer id) {
		nhaCungCapDAO.deleteById(id);
	}

	@Override
	public NhaCungCap getOne(Integer id) {
		return nhaCungCapDAO.getOne(id);
	}

	@Override
	public void delete(NhaCungCap entity) {
		nhaCungCapDAO.delete(entity);
	}

	@Override
	public NhaCungCap getById(Integer id) {
		return nhaCungCapDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends Integer> ids) {
		nhaCungCapDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends NhaCungCap> entities) {
		nhaCungCapDAO.deleteAll(entities);
	}

	@Override
	public NhaCungCap getReferenceById(Integer id) {
		return nhaCungCapDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		nhaCungCapDAO.deleteAll();
	}

	@Override
	public <S extends NhaCungCap> List<S> findAll(Example<S> example) {
		return nhaCungCapDAO.findAll(example);
	}

	@Override
	public <S extends NhaCungCap> List<S> findAll(Example<S> example, Sort sort) {
		return nhaCungCapDAO.findAll(example, sort);
	}
}
