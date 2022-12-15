package com.exampleCode.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleCode.demo.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}
