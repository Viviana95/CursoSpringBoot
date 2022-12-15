package com.baeldung.boot.jsp.exception;

import com.baeldung.boot.jsp.dto.Book;
import lombok.Getter;

@Getter
public class DuplicateBookException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Book book;

    public DuplicateBookException(Book book) {
        this.book = book;
    }

	public Book getBook() {
		return book;
	}
}