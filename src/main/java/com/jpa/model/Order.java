package com.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="order_table")
@Data
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="order_id")
	private Integer orderId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="order_price")
	private Integer orderPrice;
	
}
