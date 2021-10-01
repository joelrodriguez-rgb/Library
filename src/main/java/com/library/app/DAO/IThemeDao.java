package com.library.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.app.entitys.Theme;

public interface IThemeDao extends JpaRepository<Theme, Long>{

}
