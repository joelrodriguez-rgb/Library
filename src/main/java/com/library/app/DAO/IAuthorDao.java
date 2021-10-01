package com.library.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.library.app.entitys.Author;

public interface IAuthorDao extends JpaRepository<Author, Long> {

	@Query( value = "SELECT a FROM author a "
			+ "WHERE a.name = :name" )
   Author findAuthorByName(String name);
	
	
}
