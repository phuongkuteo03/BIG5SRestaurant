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

import com.store.dao.MenuMonAnDAO;
import com.store.entity.MenuMonAn;
import com.store.service.MenuMonAnService;

@Service
public class MenuMonAnServiceImpl implements MenuMonAnService {
	@Autowired
	MenuMonAnDAO menuMonAnDAO;

	@Override
	public <S extends MenuMonAn> S save(S entity) {
		return menuMonAnDAO.save(entity);
	}

	@Override
	public <S extends MenuMonAn> Optional<S> findOne(Example<S> example) {
		return menuMonAnDAO.findOne(example);
	}

	@Override
	public List<MenuMonAn> findAll() {
		return menuMonAnDAO.findAll();
	}

	@Override
	public Page<MenuMonAn> findAll(Pageable pageable) {
		return menuMonAnDAO.findAll(pageable);
	}

	@Override
	public List<MenuMonAn> findAll(Sort sort) {
		return menuMonAnDAO.findAll(sort);
	}

	@Override
	public List<MenuMonAn> findAllById(List<Integer> ids) {
		return menuMonAnDAO.findAllById(ids);
	}

	@Override
	public <S extends MenuMonAn> List<S> saveAll(List<S> entities) {
		return menuMonAnDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		menuMonAnDAO.flush();
	}

	@Override
	public <S extends MenuMonAn> S saveAndFlush(S entity) {
		return menuMonAnDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends MenuMonAn> List<S> saveAllAndFlush(List<S> entities) {
		return menuMonAnDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends MenuMonAn> Page<S> findAll(Example<S> example, Pageable pageable) {
		return menuMonAnDAO.findAll(example, pageable);
	}

	@Override
	public MenuMonAn findById(Integer id) {
		return menuMonAnDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<MenuMonAn> entities) {
		menuMonAnDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return menuMonAnDAO.existsById(id);
	}

	@Override
	public <S extends MenuMonAn> long count(Example<S> example) {
		return menuMonAnDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<MenuMonAn> entities) {
		menuMonAnDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends MenuMonAn> boolean exists(Example<S> example) {
		return menuMonAnDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<Integer> ids) {
		menuMonAnDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends MenuMonAn, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return menuMonAnDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return menuMonAnDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		menuMonAnDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(Integer id) {
		menuMonAnDAO.deleteById(id);
	}

	@Override
	public MenuMonAn getOne(Integer id) {
		return menuMonAnDAO.getOne(id);
	}

	@Override
	public void delete(MenuMonAn entity) {
		menuMonAnDAO.delete(entity);
	}

	@Override
	public MenuMonAn getById(Integer id) {
		return menuMonAnDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends Integer> ids) {
		menuMonAnDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends MenuMonAn> entities) {
		menuMonAnDAO.deleteAll(entities);
	}

	@Override
	public MenuMonAn getReferenceById(Integer id) {
		return menuMonAnDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		menuMonAnDAO.deleteAll();
	}

	@Override
	public <S extends MenuMonAn> List<S> findAll(Example<S> example) {
		return menuMonAnDAO.findAll(example);
	}

	@Override
	public <S extends MenuMonAn> List<S> findAll(Example<S> example, Sort sort) {
		return menuMonAnDAO.findAll(example, sort);
	}

	@Override
	public List<MenuMonAn> findByCategory(String cid) {
		return menuMonAnDAO.findByCategoryId(cid);
	}

}
