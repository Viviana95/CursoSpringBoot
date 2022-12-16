package com.viviCode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viviCode.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}
