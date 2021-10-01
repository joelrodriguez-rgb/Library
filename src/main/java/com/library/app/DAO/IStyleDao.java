package com.library.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.app.entitys.Style;

public interface IStyleDao extends JpaRepository<Style, Long> {

}
