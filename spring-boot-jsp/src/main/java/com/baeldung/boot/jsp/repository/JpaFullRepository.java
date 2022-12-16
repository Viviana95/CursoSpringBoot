package com.baeldung.boot.jsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baeldung.boot.jsp.repository.model.BookData;

public interface JpaFullRepository extends JpaRepository<BookData, String> {


}
