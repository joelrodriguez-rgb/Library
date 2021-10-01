package com.library.app.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.library.app.DAO.IAuthorDao;
import com.library.app.Service.IAuthorService;
import com.library.app.entitys.Author;

@Service
@Transactional
public class AuthorServiceImpl implements IAuthorService {

	@Autowired
	private IAuthorDao authorDao;
	



	/**************** CRUD ***********************/

	@Override
	public List<Author> getAllAuthor() {
		return authorDao.findAll();
	}

	@Override
	public Author saveAuthor(Author author) {
		return authorDao.save(author);
	}

	@Override
	public void deleteAuthorById(Long id) {
		authorDao.deleteById(id);
	}

	@Override
	public Author getAuthorById(Long id) {
		return authorDao.findById(id).get();
	}

	/****************** BUSQUEDAS *********************/
	@Override
	public Author getAuthorByName(String name) {
		return authorDao.findAuthorByName(name);

	}
	


}
