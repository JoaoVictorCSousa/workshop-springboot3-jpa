package com.joaovictor.portfolio1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovictor.portfolio1.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
