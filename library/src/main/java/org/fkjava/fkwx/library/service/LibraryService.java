package org.fkjava.fkwx.library.service;

import org.fkjava.fkwx.library.domain.Book;
import org.fkjava.fkwx.library.domain.DebitList;
import org.springframework.data.domain.Page;

public interface LibraryService {

	Page<Book> search(String keyword, int pageNumber);

	void add(DebitList list, String bookId);

	void remove(DebitList list, String id);

}
