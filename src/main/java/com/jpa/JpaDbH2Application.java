package com.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.model.Order;
import com.jpa.service.OrderService;

@SpringBootApplication
public class JpaDbH2Application implements CommandLineRunner{
@Autowired private OrderService orderService;
	public static void main(String[] args) {
		SpringApplication.run(JpaDbH2Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Order order = new Order();
		order.setOrderPrice(9);
		order.setProductName("abc");
		orderService.createOrder(order);
		
	}

}
