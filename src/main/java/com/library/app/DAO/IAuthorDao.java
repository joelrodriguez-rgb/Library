package com.library.app.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.library.app.entitys.Author;

public interface IAuthorDao extends JpaRepository<Author, Long> {

        List<Author> findByName(String name);	
	
}
