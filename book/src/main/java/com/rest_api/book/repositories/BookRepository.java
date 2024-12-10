package com.rest_api.book.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest_api.book.domain.BookEntity;;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, String> {}
