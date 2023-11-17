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

import com.store.dao.NhapHangDAO;
import com.store.entity.NhapHang;
import com.store.service.NhapHangService;

@Service
public class NhapHangServiceImpl implements NhapHangService{

	@Autowired
	NhapHangDAO nhapHangDAO;

	@Override
	public <S extends NhapHang> S save(S entity) {
		return nhapHangDAO.save(entity);
	}

	@Override
	public <S extends NhapHang> Optional<S> findOne(Example<S> example) {
		return nhapHangDAO.findOne(example);
	}

	@Override
	public List<NhapHang> findAll() {
		return nhapHangDAO.findAll();
	}

	@Override
	public Page<NhapHang> findAll(Pageable pageable) {
		return nhapHangDAO.findAll(pageable);
	}

	@Override
	public List<NhapHang> findAll(Sort sort) {
		return nhapHangDAO.findAll(sort);
	}

	@Override
	public List<NhapHang> findAllById(List<Integer> ids) {
		return nhapHangDAO.findAllById(ids);
	}

	@Override
	public <S extends NhapHang> List<S> saveAll(List<S> entities) {
		return nhapHangDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		nhapHangDAO.flush();
	}

	@Override
	public <S extends NhapHang> S saveAndFlush(S entity) {
		return nhapHangDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends NhapHang> List<S> saveAllAndFlush(List<S> entities) {
		return nhapHangDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends NhapHang> Page<S> findAll(Example<S> example, Pageable pageable) {
		return nhapHangDAO.findAll(example, pageable);
	}

	@Override
	public NhapHang findById(Integer id) {
		return nhapHangDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<NhapHang> entities) {
		nhapHangDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return nhapHangDAO.existsById(id);
	}

	@Override
	public <S extends NhapHang> long count(Example<S> example) {
		return nhapHangDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<NhapHang> entities) {
		nhapHangDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends NhapHang> boolean exists(Example<S> example) {
		return nhapHangDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<Integer> ids) {
		nhapHangDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends NhapHang, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return nhapHangDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return nhapHangDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		nhapHangDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(Integer id) {
		nhapHangDAO.deleteById(id);
	}

	@Override
	public NhapHang getOne(Integer id) {
		return nhapHangDAO.getOne(id);
	}

	@Override
	public void delete(NhapHang entity) {
		nhapHangDAO.delete(entity);
	}

	@Override
	public NhapHang getById(Integer id) {
		return nhapHangDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends Integer> ids) {
		nhapHangDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends NhapHang> entities) {
		nhapHangDAO.deleteAll(entities);
	}

	@Override
	public NhapHang getReferenceById(Integer id) {
		return nhapHangDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		nhapHangDAO.deleteAll();
	}

	@Override
	public <S extends NhapHang> List<S> findAll(Example<S> example) {
		return nhapHangDAO.findAll(example);
	}

	@Override
	public <S extends NhapHang> List<S> findAll(Example<S> example, Sort sort) {
		return nhapHangDAO.findAll(example, sort);
	}
	


}
