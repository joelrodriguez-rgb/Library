package com.library.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.app.entitys.Book;

@Repository
public interface IBookDao extends JpaRepository<Book, Long>{

}
