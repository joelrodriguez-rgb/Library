package com.library.app.Service;

import java.util.List;

import com.library.app.entitys.Theme;

public interface IThemeService {

	List<Theme> getAllAuthor();

	Theme saveTheme(Theme theme);

	void deleteThemeById(Long id);

	Theme getThemeById(Long id);

}
