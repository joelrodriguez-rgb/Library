package com.library.app.Service;

import java.util.List;

import com.library.app.entitys.Author;

public interface IAuthorService {

	/**************** CRUD ***********************/

	List<Author> getAllAuthor();

	Author saveAuthor(Author author);

	void deleteAuthorById(Long id);

	Author getAuthorById(Long id);

	/****************** BUSQUEDAS *********************/

	 List<Author> getAuthorByName(String name);

}
