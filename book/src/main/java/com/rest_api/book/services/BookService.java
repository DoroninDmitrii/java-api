package com.rest_api.book.services;

import java.util.Optional;
import java.util.List;

import com.rest_api.book.domain.Book;

public interface BookService {

  boolean isBookExists(Book book);
  
  Book create(Book book);

  Optional<Book> findById(String isbn);

  List<Book> listBooks();

  void deleteBookById(String isbn);
  
}
