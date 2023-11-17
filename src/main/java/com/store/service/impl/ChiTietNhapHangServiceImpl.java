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

import com.store.dao.ChiTietNhapHangDAO;
import com.store.entity.ChiTietNhapHang;
import com.store.service.ChiTietNhapHangService;

@Service
public class ChiTietNhapHangServiceImpl implements ChiTietNhapHangService {
	@Autowired
	ChiTietNhapHangDAO chiTietNhapHangDAO;

	@Override
	public List<ChiTietNhapHang> findChiTietNhapHang(Integer id) {
		return chiTietNhapHangDAO.findChiTietByNhapHang(id);
	}

	@Override
	public <S extends ChiTietNhapHang> S save(S entity) {
		return chiTietNhapHangDAO.save(entity);
	}

	@Override
	public <S extends ChiTietNhapHang> Optional<S> findOne(Example<S> example) {
		return chiTietNhapHangDAO.findOne(example);
	}

	@Override
	public List<ChiTietNhapHang> findAll() {
		return chiTietNhapHangDAO.findAll();
	}

	@Override
	public Page<ChiTietNhapHang> findAll(Pageable pageable) {
		return chiTietNhapHangDAO.findAll(pageable);
	}

	@Override
	public List<ChiTietNhapHang> findAll(Sort sort) {
		return chiTietNhapHangDAO.findAll(sort);
	}

	@Override
	public List<ChiTietNhapHang> findAllById(List<Integer> ids) {
		return chiTietNhapHangDAO.findAllById(ids);
	}

	@Override
	public <S extends ChiTietNhapHang> List<S> saveAll(List<S> entities) {
		return chiTietNhapHangDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		chiTietNhapHangDAO.flush();
	}

	@Override
	public <S extends ChiTietNhapHang> S saveAndFlush(S entity) {
		return chiTietNhapHangDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends ChiTietNhapHang> List<S> saveAllAndFlush(List<S> entities) {
		return chiTietNhapHangDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends ChiTietNhapHang> Page<S> findAll(Example<S> example, Pageable pageable) {
		return chiTietNhapHangDAO.findAll(example, pageable);
	}

	@Override
	public ChiTietNhapHang findById(Integer id) {
		return chiTietNhapHangDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<ChiTietNhapHang> entities) {
		chiTietNhapHangDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return chiTietNhapHangDAO.existsById(id);
	}

	@Override
	public <S extends ChiTietNhapHang> long count(Example<S> example) {
		return chiTietNhapHangDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<ChiTietNhapHang> entities) {
		chiTietNhapHangDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends ChiTietNhapHang> boolean exists(Example<S> example) {
		return chiTietNhapHangDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<Integer> ids) {
		chiTietNhapHangDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends ChiTietNhapHang, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return chiTietNhapHangDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return chiTietNhapHangDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		chiTietNhapHangDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(Integer id) {
		chiTietNhapHangDAO.deleteById(id);
	}

	@Override
	public ChiTietNhapHang getOne(Integer id) {
		return chiTietNhapHangDAO.getOne(id);
	}

	@Override
	public void delete(ChiTietNhapHang entity) {
		chiTietNhapHangDAO.delete(entity);
	}

	@Override
	public ChiTietNhapHang getById(Integer id) {
		return chiTietNhapHangDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends Integer> ids) {
		chiTietNhapHangDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends ChiTietNhapHang> entities) {
		chiTietNhapHangDAO.deleteAll(entities);
	}

	@Override
	public ChiTietNhapHang getReferenceById(Integer id) {
		return chiTietNhapHangDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		chiTietNhapHangDAO.deleteAll();
	}

	@Override
	public <S extends ChiTietNhapHang> List<S> findAll(Example<S> example) {
		return chiTietNhapHangDAO.findAll(example);
	}

	@Override
	public <S extends ChiTietNhapHang> List<S> findAll(Example<S> example, Sort sort) {
		return chiTietNhapHangDAO.findAll(example, sort);
	}

}
