package com.ismailbakir.librarybackend.dao;

import com.ismailbakir.librarybackend.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
