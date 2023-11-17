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
import com.store.dao.ChiTietDonHangOnlineDAO;
import com.store.dao.DonHangOnlineDAO;
import com.store.entity.ChiTietDonHangOnline;
import com.store.entity.DonHangOnline;
import com.store.service.DonHangOnlineService;


@Service
public class DonHangOnlineServiceImpl implements DonHangOnlineService{
	@Autowired
	DonHangOnlineDAO donHangOnlineDAO;
	@Autowired
	ChiTietDonHangOnlineDAO chiTietDonHangOnlineDAO;

	@Override
	public <S extends DonHangOnline> S save(S entity) {
		return donHangOnlineDAO.save(entity);
	}

	@Override
	public <S extends DonHangOnline> Optional<S> findOne(Example<S> example) {
		return donHangOnlineDAO.findOne(example);
	}

	@Override
	public List<DonHangOnline> findAll() {
		return donHangOnlineDAO.findAll();
	}

	@Override
	public Page<DonHangOnline> findAll(Pageable pageable) {
		return donHangOnlineDAO.findAll(pageable);
	}

	@Override
	public List<DonHangOnline> findAll(Sort sort) {
		return donHangOnlineDAO.findAll(sort);
	}

	@Override
	public List<DonHangOnline> findAllById(List<Integer> ids) {
		return donHangOnlineDAO.findAllById(ids);
	}

	@Override
	public <S extends DonHangOnline> List<S> saveAll(List<S> entities) {
		return donHangOnlineDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		donHangOnlineDAO.flush();
	}

	@Override
	public <S extends DonHangOnline> S saveAndFlush(S entity) {
		return donHangOnlineDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends DonHangOnline> List<S> saveAllAndFlush(List<S> entities) {
		return donHangOnlineDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends DonHangOnline> Page<S> findAll(Example<S> example, Pageable pageable) {
		return donHangOnlineDAO.findAll(example, pageable);
	}

	@Override
	public DonHangOnline findById(Integer id) {
		return donHangOnlineDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<DonHangOnline> entities) {
		donHangOnlineDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return donHangOnlineDAO.existsById(id);
	}

	@Override
	public <S extends DonHangOnline> long count(Example<S> example) {
		return donHangOnlineDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<DonHangOnline> entities) {
		donHangOnlineDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends DonHangOnline> boolean exists(Example<S> example) {
		return donHangOnlineDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<Integer> ids) {
		donHangOnlineDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends DonHangOnline, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return donHangOnlineDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return donHangOnlineDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		donHangOnlineDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(Integer id) {
		donHangOnlineDAO.deleteById(id);
	}

	@Override
	public DonHangOnline getOne(Integer id) {
		return donHangOnlineDAO.getOne(id);
	}

	@Override
	public void delete(DonHangOnline entity) {
		donHangOnlineDAO.delete(entity);
	}

	@Override
	public DonHangOnline getById(Integer id) {
		return donHangOnlineDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends Integer> ids) {
		donHangOnlineDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends DonHangOnline> entities) {
		donHangOnlineDAO.deleteAll(entities);
	}

	@Override
	public DonHangOnline getReferenceById(Integer id) {
		return donHangOnlineDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		donHangOnlineDAO.deleteAll();
	}

	@Override
	public <S extends DonHangOnline> List<S> findAll(Example<S> example) {
		return donHangOnlineDAO.findAll(example);
	}

	@Override
	public <S extends DonHangOnline> List<S> findAll(Example<S> example, Sort sort) {
		return donHangOnlineDAO.findAll(example, sort);
	}

	@Override
	public DonHangOnline create(JsonNode orderData) {
		ObjectMapper mapper = new ObjectMapper();

		DonHangOnline order = mapper.convertValue(orderData, DonHangOnline.class);
		donHangOnlineDAO.save(order);

		TypeReference<List<ChiTietDonHangOnline>> type = new TypeReference<List<ChiTietDonHangOnline>>() {
		};
		List<ChiTietDonHangOnline> details = mapper.convertValue(orderData.get("chiTietDonHangOnline"), type)
				.stream().peek(d -> d.setDonhangonline(order)).collect(Collectors.toList());
		chiTietDonHangOnlineDAO.saveAll(details);

		return order;

	}
	
	@Override
	public List<DonHangOnline> findByUsername(String username) {
		return donHangOnlineDAO.findByUsername(username);
	}
	
}
