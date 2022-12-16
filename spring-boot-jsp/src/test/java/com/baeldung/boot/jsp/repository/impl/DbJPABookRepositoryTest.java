package com.baeldung.boot.jsp.repository.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baeldung.boot.jsp.repository.BookRepository;
import com.baeldung.boot.jsp.repository.model.BookData;



@SpringBootTest
class DbJPABookRepositoryTest {
	
	@Autowired
	BookRepository bookRepo;


	@Test
	void testFindAll() {
		System.out.println("All "+ bookRepo.findAll());
		assertEquals(3, bookRepo.findAll().size());
	}

	@Test
	void testFindById() {
		assertEquals("El principito", bookRepo.findById("675").get().getName());
	}

	@Test
	void testAdd() {
		
	}

}
