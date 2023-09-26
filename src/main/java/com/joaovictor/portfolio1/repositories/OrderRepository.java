package com.joaovictor.portfolio1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovictor.portfolio1.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
