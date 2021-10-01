package com.library.app.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.app.DAO.IBookDao;
import com.library.app.Service.IBookService;
import com.library.app.entitys.Book;

@Service

public class BookServiceImpl implements IBookService {

	@Autowired
	private IBookDao bookDao;
	
	


	@Override
	public List<Book> getAllBook() {
		return bookDao.findAll();
	}

	@Override
	public Book saveBook(Book book) {
		return bookDao.save(book);
	}

	@Override
	public void deleteBookById(Long id) {
		bookDao.deleteById(id);
	}

	@Override
	public Book getBookById(Long id) {
		return bookDao.findById(id).get();
	}

}
