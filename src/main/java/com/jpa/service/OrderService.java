package com.jpa.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.dao.OrderRepository;
import com.jpa.model.Order;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public Iterable<Order> getAllOrder(){
	
		return this.orderRepository.findAll();
	}
	public Order getOrderById(Integer id) {
		return this.orderRepository.findById(id).orElse(new Order());
	}
	public Order createOrder(Order order) {
		return this.orderRepository.save(order);
	}
	public Order updateById(Order order,Integer id) {
		Order newOrder = new Order();
		newOrder = order;
		newOrder.setOrderId(id);
		
		return this.orderRepository.save(newOrder);
	}
	public void deleteById(Integer id) {
		this.orderRepository.deleteById(id);
	}
}
