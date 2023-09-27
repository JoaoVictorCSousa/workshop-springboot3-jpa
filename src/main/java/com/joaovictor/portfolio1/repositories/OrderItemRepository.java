package com.joaovictor.portfolio1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovictor.portfolio1.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
