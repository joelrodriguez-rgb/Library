package com.library.app.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.app.DAO.IStyleDao;
import com.library.app.Service.IStyleService;
import com.library.app.entitys.Style;

@Service
public class StyleServiceImpl implements IStyleService {

	
	@Autowired
	private IStyleDao styleDao;
	
	

	@Override
	public List<Style> getAllStyle() {
		return styleDao.findAll();
	}

	@Override
	public Style saveBook(Style style) {
		return styleDao.save(style);
	}

	@Override
	public void deleteStyleById(Long id) {
		styleDao.deleteById(id);
	}

	@Override
	public Style getStyleById(Long id) {
		return styleDao.findById(id).get();
	}

}
