package com.jpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer>{

}
