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

import com.store.dao.ChiTietPhieuBepDAO;
import com.store.entity.ChiTietPhieuBep;
import com.store.service.ChiTietPhieuBepService;

@Service
public class ChiTietPhieuBepServiceImpl implements ChiTietPhieuBepService{
	@Autowired
	ChiTietPhieuBepDAO chiTietPhieuBepDAO;

	@Override
	public <S extends ChiTietPhieuBep> S save(S entity) {
		return chiTietPhieuBepDAO.save(entity);
	}

	@Override
	public <S extends ChiTietPhieuBep> Optional<S> findOne(Example<S> example) {
		return chiTietPhieuBepDAO.findOne(example);
	}

	@Override
	public List<ChiTietPhieuBep> findAll() {
		return chiTietPhieuBepDAO.findAll();
	}

	@Override
	public Page<ChiTietPhieuBep> findAll(Pageable pageable) {
		return chiTietPhieuBepDAO.findAll(pageable);
	}

	@Override
	public List<ChiTietPhieuBep> findAll(Sort sort) {
		return chiTietPhieuBepDAO.findAll(sort);
	}

	@Override
	public List<ChiTietPhieuBep> findAllById(List<Integer> ids) {
		return chiTietPhieuBepDAO.findAllById(ids);
	}

	@Override
	public <S extends ChiTietPhieuBep> List<S> saveAll(List<S> entities) {
		return chiTietPhieuBepDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		chiTietPhieuBepDAO.flush();
	}

	@Override
	public <S extends ChiTietPhieuBep> S saveAndFlush(S entity) {
		return chiTietPhieuBepDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends ChiTietPhieuBep> List<S> saveAllAndFlush(List<S> entities) {
		return chiTietPhieuBepDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends ChiTietPhieuBep> Page<S> findAll(Example<S> example, Pageable pageable) {
		return chiTietPhieuBepDAO.findAll(example, pageable);
	}

	@Override
	public ChiTietPhieuBep findById(Integer id) {
		return chiTietPhieuBepDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<ChiTietPhieuBep> entities) {
		chiTietPhieuBepDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return chiTietPhieuBepDAO.existsById(id);
	}

	@Override
	public <S extends ChiTietPhieuBep> long count(Example<S> example) {
		return chiTietPhieuBepDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<ChiTietPhieuBep> entities) {
		chiTietPhieuBepDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends ChiTietPhieuBep> boolean exists(Example<S> example) {
		return chiTietPhieuBepDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<Integer> ids) {
		chiTietPhieuBepDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends ChiTietPhieuBep, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return chiTietPhieuBepDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return chiTietPhieuBepDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		chiTietPhieuBepDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(Integer id) {
		chiTietPhieuBepDAO.deleteById(id);
	}

	@Override
	public ChiTietPhieuBep getOne(Integer id) {
		return chiTietPhieuBepDAO.getOne(id);
	}

	@Override
	public void delete(ChiTietPhieuBep entity) {
		chiTietPhieuBepDAO.delete(entity);
	}

	@Override
	public ChiTietPhieuBep getById(Integer id) {
		return chiTietPhieuBepDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends Integer> ids) {
		chiTietPhieuBepDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends ChiTietPhieuBep> entities) {
		chiTietPhieuBepDAO.deleteAll(entities);
	}

	@Override
	public ChiTietPhieuBep getReferenceById(Integer id) {
		return chiTietPhieuBepDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		chiTietPhieuBepDAO.deleteAll();
	}

	@Override
	public <S extends ChiTietPhieuBep> List<S> findAll(Example<S> example) {
		return chiTietPhieuBepDAO.findAll(example);
	}

	@Override
	public <S extends ChiTietPhieuBep> List<S> findAll(Example<S> example, Sort sort) {
		return chiTietPhieuBepDAO.findAll(example, sort);
	}
	
}
