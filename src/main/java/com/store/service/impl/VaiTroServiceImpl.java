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

import com.store.dao.VaiTroDAO;
import com.store.entity.VaiTro;
import com.store.service.VaiTroService;

@Service
public class VaiTroServiceImpl implements VaiTroService{
	@Autowired
	VaiTroDAO vaiTroDAO;

	@Override
	public <S extends VaiTro> S save(S entity) {
		return vaiTroDAO.save(entity);
	}

	@Override
	public <S extends VaiTro> Optional<S> findOne(Example<S> example) {
		return vaiTroDAO.findOne(example);
	}

	@Override
	public List<VaiTro> findAll() {
		return vaiTroDAO.findAll();
	}

	@Override
	public Page<VaiTro> findAll(Pageable pageable) {
		return vaiTroDAO.findAll(pageable);
	}

	@Override
	public List<VaiTro> findAll(Sort sort) {
		return vaiTroDAO.findAll(sort);
	}

	@Override
	public List<VaiTro> findAllById(List<String> ids) {
		return vaiTroDAO.findAllById(ids);
	}

	@Override
	public <S extends VaiTro> List<S> saveAll(List<S> entities) {
		return vaiTroDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		vaiTroDAO.flush();
	}

	@Override
	public <S extends VaiTro> S saveAndFlush(S entity) {
		return vaiTroDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends VaiTro> List<S> saveAllAndFlush(List<S> entities) {
		return vaiTroDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends VaiTro> Page<S> findAll(Example<S> example, Pageable pageable) {
		return vaiTroDAO.findAll(example, pageable);
	}

	@Override
	public VaiTro findById(String id) {
		return vaiTroDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<VaiTro> entities) {
		vaiTroDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(String id) {
		return vaiTroDAO.existsById(id);
	}

	@Override
	public <S extends VaiTro> long count(Example<S> example) {
		return vaiTroDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<VaiTro> entities) {
		vaiTroDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends VaiTro> boolean exists(Example<S> example) {
		return vaiTroDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<String> ids) {
		vaiTroDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends VaiTro, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return vaiTroDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return vaiTroDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		vaiTroDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(String id) {
		vaiTroDAO.deleteById(id);
	}

	@Override
	public VaiTro getOne(String id) {
		return vaiTroDAO.getOne(id);
	}

	@Override
	public void delete(VaiTro entity) {
		vaiTroDAO.delete(entity);
	}

	@Override
	public VaiTro getById(String id) {
		return vaiTroDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends String> ids) {
		vaiTroDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends VaiTro> entities) {
		vaiTroDAO.deleteAll(entities);
	}

	@Override
	public VaiTro getReferenceById(String id) {
		return vaiTroDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		vaiTroDAO.deleteAll();
	}

	@Override
	public <S extends VaiTro> List<S> findAll(Example<S> example) {
		return vaiTroDAO.findAll(example);
	}

	@Override
	public <S extends VaiTro> List<S> findAll(Example<S> example, Sort sort) {
		return vaiTroDAO.findAll(example, sort);
	}

	
	
}
