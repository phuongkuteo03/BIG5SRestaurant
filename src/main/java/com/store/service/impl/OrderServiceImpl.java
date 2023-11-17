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
import com.store.dao.ChiTietOrderDAO;
import com.store.dao.OrderDAO;
import com.store.entity.ChiTietOrder;
import com.store.entity.Order;
import com.store.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderDAO orderDAO;
	@Autowired
	ChiTietOrderDAO chiTietOrderDAO;

	@Override
	public <S extends Order> S save(S entity) {
		return orderDAO.save(entity);
	}

	@Override
	public <S extends Order> Optional<S> findOne(Example<S> example) {
		return orderDAO.findOne(example);
	}

	@Override
	public List<Order> findAll() {
		return orderDAO.findAll();
	}

	@Override
	public Page<Order> findAll(Pageable pageable) {
		return orderDAO.findAll(pageable);
	}

	@Override
	public List<Order> findAll(Sort sort) {
		return orderDAO.findAll(sort);
	}

	@Override
	public List<Order> findAllById(List<Integer> ids) {
		return orderDAO.findAllById(ids);
	}

	@Override
	public <S extends Order> List<S> saveAll(List<S> entities) {
		return orderDAO.saveAll(entities);
	}

	@Override
	public void flush() {
		orderDAO.flush();
	}

	@Override
	public <S extends Order> S saveAndFlush(S entity) {
		return orderDAO.saveAndFlush(entity);
	}

	@Override
	public <S extends Order> List<S> saveAllAndFlush(List<S> entities) {
		return orderDAO.saveAllAndFlush(entities);
	}

	@Override
	public <S extends Order> Page<S> findAll(Example<S> example, Pageable pageable) {
		return orderDAO.findAll(example, pageable);
	}

	@Override
	public Order findById(Integer id) {
		return orderDAO.findById(id).get();
	}

	@Override
	public void deleteInBatch(List<Order> entities) {
		orderDAO.deleteInBatch(entities);
	}

	@Override
	public boolean existsById(Integer id) {
		return orderDAO.existsById(id);
	}

	@Override
	public <S extends Order> long count(Example<S> example) {
		return orderDAO.count(example);
	}

	@Override
	public void deleteAllInBatch(List<Order> entities) {
		orderDAO.deleteAllInBatch(entities);
	}

	@Override
	public <S extends Order> boolean exists(Example<S> example) {
		return orderDAO.exists(example);
	}

	@Override
	public void deleteAllByIdInBatch(List<Integer> ids) {
		orderDAO.deleteAllByIdInBatch(ids);
	}

	@Override
	public <S extends Order, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return orderDAO.findBy(example, queryFunction);
	}

	@Override
	public long count() {
		return orderDAO.count();
	}

	@Override
	public void deleteAllInBatch() {
		orderDAO.deleteAllInBatch();
	}

	@Override
	public void deleteById(Integer id) {
		orderDAO.deleteById(id);
	}

	@Override
	public Order getOne(Integer id) {
		return orderDAO.getOne(id);
	}

	@Override
	public void delete(Order entity) {
		orderDAO.delete(entity);
	}

	@Override
	public Order getById(Integer id) {
		return orderDAO.getById(id);
	}

	@Override
	public void deleteAllById(List<? extends Integer> ids) {
		orderDAO.deleteAllById(ids);
	}

	@Override
	public void deleteAll(List<? extends Order> entities) {
		orderDAO.deleteAll(entities);
	}

	@Override
	public Order getReferenceById(Integer id) {
		return orderDAO.getReferenceById(id);
	}

	@Override
	public void deleteAll() {
		orderDAO.deleteAll();
	}

	@Override
	public <S extends Order> List<S> findAll(Example<S> example) {
		return orderDAO.findAll(example);
	}

	@Override
	public <S extends Order> List<S> findAll(Example<S> example, Sort sort) {
		return orderDAO.findAll(example, sort);
	}
	
	@Override
	public Order create(JsonNode orderData) {
		ObjectMapper mapper = new ObjectMapper();

		Order order = mapper.convertValue(orderData, Order.class);
		orderDAO.save(order);

		TypeReference<List<ChiTietOrder>> type = new TypeReference<List<ChiTietOrder>>() {
		};
		List<ChiTietOrder> details = mapper.convertValue(orderData.get("chiTietOrder"), type)
				.stream().peek(d -> d.setOrders(order)).collect(Collectors.toList());
		chiTietOrderDAO.saveAll(details);

		return order;
	}
	
	@Override
	public Order update(JsonNode orderData) {
		ObjectMapper mapper = new ObjectMapper();

		Order order = mapper.convertValue(orderData, Order.class);
		orderDAO.save(order);
		
		System.out.println(order.getId());

		TypeReference<List<ChiTietOrder>> type = new TypeReference<List<ChiTietOrder>>() {
		};
		List<ChiTietOrder> details = mapper.convertValue(orderData.get("chiTietOrder"), type)
				.stream().peek(d -> d.setOrders(order)).collect(Collectors.toList());
		chiTietOrderDAO.saveAll(details);

		return order;
	}
	
	@Override
	public List<Order> findByUsername(String username) {
		return orderDAO.findByUsername(username);
	}
}
