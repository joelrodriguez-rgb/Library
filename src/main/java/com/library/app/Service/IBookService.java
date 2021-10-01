package com.library.app.Service;

import java.util.List;


import com.library.app.entitys.Book;

public interface IBookService {
	
	List<Book> getAllBook();
	
	Book saveBook(Book book);
	
	void deleteBookById(Long id);
	
	Book getBookById(Long id);

}
