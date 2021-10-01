package com.library.app.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.app.DAO.IThemeDao;
import com.library.app.Service.IThemeService;
import com.library.app.entitys.Theme;

@Service
public class ThemeServiceImpl implements IThemeService {

	@Autowired
	private IThemeDao themeDao;

	@Override
	public List<Theme> getAllAuthor() {
		return themeDao.findAll();
	}

	@Override
	public Theme saveTheme(Theme theme) {
		return themeDao.save(theme);
	}

	@Override
	public void deleteThemeById(Long id) {
		themeDao.deleteById(id);
	}

	@Override
	public Theme getThemeById(Long id) {
		return themeDao.findById(id).get();
	}

}
