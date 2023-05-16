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
		Order order1 = new Order();
		order1.setOrderPrice(49);
		order1.setProductName("tabc");
		Order order2 = new Order();
		order2.setOrderPrice(39);
		order2.setProductName("rabc");
		Order order3 = new Order();
		order3.setOrderPrice(29);
		order3.setProductName("6abc");
		orderService.createOrder(order);
		orderService.createOrder(order1);
		orderService.createOrder(order2);
		orderService.createOrder(order3);
		
	}

}
