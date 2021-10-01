package com.library.app.entitys;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String surname;
	
	@Embedded()
	private Contact contact;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Book> listBook;
	
	@JoinColumn
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Style style;
	

	public Author(String name, String surname, Contact contact, Book book, Style style) {
		super();
		this.name = name;
		this.surname = surname;
		this.contact = contact;
		
		List<Book> list = new ArrayList<Book>();
		list.add(book);
		this.listBook = list;
		
		this.style = style;
	}
	
	
	public Author(String name, String surname, Contact contact, List<Book> listBook, Style style) {
		super();
		this.name = name;
		this.surname = surname;
		this.contact = contact;
		this.listBook = listBook;
		this.style = style;
	}

	public Contact getContact() {
		return contact;
	}


	public void setContact(Contact contact) {
		this.contact = contact;
	}


	public Style getStyle() {
		return style;
	}


	public void setStyle(Style style) {
		this.style = style;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<Book> getListBook() {
		return listBook;
	}

	public void setListBook(List<Book> listBook) {
		this.listBook = listBook;
	}

	@Override
	public int hashCode() {
		return this.getId().intValue();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (listBook == null) {
			if (other.listBook != null)
				return false;
		} else if (!listBook.equals(other.listBook))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", surname=" + surname + ", contact=" + contact + ", listBook="
				+ listBook + ", style=" + style + "]";
	}
	
	
	
	
}
