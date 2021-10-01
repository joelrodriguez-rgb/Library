package com.library.app.Service;

import java.util.List;

import com.library.app.entitys.Style;

public interface IStyleService {

	List<Style> getAllStyle();

	Style saveBook(Style style);

	void deleteStyleById(Long id);

	Style getStyleById(Long id);

}
