package org.fkjava.fkwx.library.domain;

import org.fkjava.commons.domain.User;

public class DebitItem {

	private User user;
	private Book book;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
}
