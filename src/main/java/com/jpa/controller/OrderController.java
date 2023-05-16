package com.jpa.controller;

import java.util.Iterator;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.model.Order;
import com.jpa.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {

	private final OrderService orderService;
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@GetMapping("getAll")
	public Iterable<Order> getAllOrder(){
		return this.orderService.getAllOrder();
	}
	@GetMapping("getById/{id}")
	public Order getOrderById(@PathVariable("id") Integer id) {
		return this.orderService.getOrderById(id);
	}
	@PostMapping("create")
	public Order createOrder(@RequestBody Order order) {
		return this.orderService.createOrder(order);
	}
	@PutMapping("update/{id}")
	public Order updateById(@RequestBody Order order, @PathVariable("id") Integer id) {
		return this.orderService.updateById(order,id);
	}
	@DeleteMapping("delete/{id}")
	public void deleteById(@PathVariable("id") Integer id) {
		this.orderService.deleteById(id);
	}
	
	
}
