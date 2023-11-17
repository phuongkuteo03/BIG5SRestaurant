package com.store.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.store.dao.ChiTietPhieuBepDAO;
import com.store.dao.PhieuBepDAO;
import com.store.entity.ChiTietOrder;
import com.store.entity.ChiTietPhieuBep;
import com.store.entity.Order;
import com.store.entity.PhieuBep;
import com.store.service.PhieuBepService;

@Service
public class PhieuBepServiceImpl implements PhieuBepService{
	@Autowired
	PhieuBepDAO phieuBepDAO;
	@Autowired
	ChiTietPhieuBepDAO chiTietPhieuBepDAO;

	@Override
	public <S extends PhieuBep> S save(S entity) {
		return phieuBepDAO.save(entity);
	}

	@Override
	public <S extends PhieuBep> Optional<S> findOne(Example<S> example) {
		return phieuBepDAO.findOne(example);
	}

	@Override
	public List<PhieuBep> findAll() {
		return phieuBepDAO.findAll();
	}

	@Override
	public Page<PhieuBep> findAll(Pageable pageable) {
		return phieuBepDAO.findAll(pageable);
	}

	@Override
	public List<PhieuBep> findAll(Sort sort) {
		return phieuBepDAO.findAll(sort);
	}

	@Override
	public List<PhieuBep> findAllById(List<Integer> ids) {
		return phieuBepDAO.findAllById(ids);
	}

	@Override
	public <S extends PhieuBep> List<S> saveAll(List<S> entities) {
		return phieuBepDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		phieuBepDAO.flush();
	}

	@Override
	public <S extends PhieuBep> S saveAndFlush(S entity) {
		return phieuBepDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends PhieuBep> List<S> saveAllAndFlush(List<S> entities) {
		return phieuBepDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends PhieuBep> Page<S> findAll(Example<S> example, Pageable pageable) {
		return phieuBepDAO.findAll(example, pageable);
	}

	@Override
	public PhieuBep findById(Integer id) {
		return phieuBepDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<PhieuBep> entities) {
		phieuBepDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return phieuBepDAO.existsById(id);
	}

	@Override
	public <S extends PhieuBep> long count(Example<S> example) {
		return phieuBepDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<PhieuBep> entities) {
		phieuBepDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends PhieuBep> boolean exists(Example<S> example) {
		return phieuBepDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<Integer> ids) {
		phieuBepDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends PhieuBep, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return phieuBepDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return phieuBepDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		phieuBepDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(Integer id) {
		phieuBepDAO.deleteById(id);
	}

	@Override
	public PhieuBep getOne(Integer id) {
		return phieuBepDAO.getOne(id);
	}

	@Override
	public void delete(PhieuBep entity) {
		phieuBepDAO.delete(entity);
	}

	@Override
	public PhieuBep getById(Integer id) {
		return phieuBepDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends Integer> ids) {
		phieuBepDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends PhieuBep> entities) {
		phieuBepDAO.deleteAll(entities);
	}

	@Override
	public PhieuBep getReferenceById(Integer id) {
		return phieuBepDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		phieuBepDAO.deleteAll();
	}

	@Override
	public <S extends PhieuBep> List<S> findAll(Example<S> example) {
		return phieuBepDAO.findAll(example);
	}

	@Override
	public <S extends PhieuBep> List<S> findAll(Example<S> example, Sort sort) {
		return phieuBepDAO.findAll(example, sort);
	}
	
	@Override
	public PhieuBep create(JsonNode orderData) {
		ObjectMapper mapper = new ObjectMapper();

		PhieuBep phieubep = mapper.convertValue(orderData, PhieuBep.class);
		phieuBepDAO.save(phieubep);

		TypeReference<List<ChiTietPhieuBep>> type = new TypeReference<List<ChiTietPhieuBep>>() {
		};
		List<ChiTietPhieuBep> details = mapper.convertValue(orderData.get("chiTietPhieuBep"), type)
				.stream().peek(d -> d.setPhieubep(phieubep)).collect(Collectors.toList());
		chiTietPhieuBepDAO.saveAll(details);

		return phieubep;

	}
	
}
