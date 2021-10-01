package com.library.app;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.library.app.Service.IAuthorService;
import com.library.app.entitys.Author;
import com.library.app.entitys.Book;
import com.library.app.entitys.Contact;
import com.library.app.entitys.Style;
import com.library.app.entitys.Theme;

@SpringBootApplication

public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	private IAuthorService authorService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	

	
	

	@Override
	public void run(String... args) throws Exception {
//		LocalDate date = LocalDate.of(2010, 9, 5);
//
//		Contact ca = new Contact("errores@gmail.com", 55555);
//
//		Theme ta = new Theme("tema 2");
//
//		Book ba = new Book("titulo 2", date, ta);
//
//		Style sa = new Style("estilo 2", "descripcion 2");
//
//		Author a = new Author("1", "2", ca, ba, sa);
//
//		authorService.saveAuthor(a);

//		 Author a3 = authorService.getAuthorByName("pepe");
//
//		System.out.println("OBJETO: "+ a3.getName() + a3.getContact()+ a3.getStyle()  );

	}

}
