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

import com.store.dao.ChiTietDonHangOnlineDAO;
import com.store.entity.ChiTietDonHangOnline;
import com.store.service.ChiTietDonHangOnlineService;

@Service
public class ChiTietDonHangOnlineServiceImpl implements ChiTietDonHangOnlineService{
	
	@Autowired
	ChiTietDonHangOnlineDAO chiTietDonHangOnlineDAO;
	
	@Override
	public <S extends ChiTietDonHangOnline> S save(S entity) {
		return chiTietDonHangOnlineDAO.save(entity);
	}

	@Override
	public <S extends ChiTietDonHangOnline> Optional<S> findOne(Example<S> example) {
		return chiTietDonHangOnlineDAO.findOne(example);
	}

	@Override
	public List<ChiTietDonHangOnline> findAll() {
		return chiTietDonHangOnlineDAO.findAll();
	}

	@Override
	public Page<ChiTietDonHangOnline> findAll(Pageable pageable) {
		return chiTietDonHangOnlineDAO.findAll(pageable);
	}

	@Override
	public List<ChiTietDonHangOnline> findAll(Sort sort) {
		return chiTietDonHangOnlineDAO.findAll(sort);
	}

	@Override
	public List<ChiTietDonHangOnline> findAllById(List<Integer> ids) {
		return chiTietDonHangOnlineDAO.findAllById(ids);
	}

	@Override
	public <S extends ChiTietDonHangOnline> List<S> saveAll(List<S> entities) {
		return chiTietDonHangOnlineDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		chiTietDonHangOnlineDAO.flush();
	}

	@Override
	public <S extends ChiTietDonHangOnline> S saveAndFlush(S entity) {
		return chiTietDonHangOnlineDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends ChiTietDonHangOnline> List<S> saveAllAndFlush(List<S> entities) {
		return chiTietDonHangOnlineDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends ChiTietDonHangOnline> Page<S> findAll(Example<S> example, Pageable pageable) {
		return chiTietDonHangOnlineDAO.findAll(example, pageable);
	}

	@Override
	public ChiTietDonHangOnline findById(Integer id) {
		return chiTietDonHangOnlineDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<ChiTietDonHangOnline> entities) {
		chiTietDonHangOnlineDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return chiTietDonHangOnlineDAO.existsById(id);
	}

	@Override
	public <S extends ChiTietDonHangOnline> long count(Example<S> example) {
		return chiTietDonHangOnlineDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<ChiTietDonHangOnline> entities) {
		chiTietDonHangOnlineDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends ChiTietDonHangOnline> boolean exists(Example<S> example) {
		return chiTietDonHangOnlineDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<Integer> ids) {
		chiTietDonHangOnlineDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends ChiTietDonHangOnline, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return chiTietDonHangOnlineDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return chiTietDonHangOnlineDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		chiTietDonHangOnlineDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(Integer id) {
		chiTietDonHangOnlineDAO.deleteById(id);
	}

	@Override
	public ChiTietDonHangOnline getOne(Integer id) {
		return chiTietDonHangOnlineDAO.getOne(id);
	}

	@Override
	public void delete(ChiTietDonHangOnline entity) {
		chiTietDonHangOnlineDAO.delete(entity);
	}

	@Override
	public ChiTietDonHangOnline getById(Integer id) {
		return chiTietDonHangOnlineDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends Integer> ids) {
		chiTietDonHangOnlineDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends ChiTietDonHangOnline> entities) {
		chiTietDonHangOnlineDAO.deleteAll(entities);
	}

	@Override
	public ChiTietDonHangOnline getReferenceById(Integer id) {
		return chiTietDonHangOnlineDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
	}

	@Override
	public <S extends ChiTietDonHangOnline> List<S> findAll(Example<S> example) {
		return chiTietDonHangOnlineDAO.findAll(example);
	}

	@Override
	public <S extends ChiTietDonHangOnline> List<S> findAll(Example<S> example, Sort sort) {
		return chiTietDonHangOnlineDAO.findAll(example, sort);
	}
}
