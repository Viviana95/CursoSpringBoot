package com.viviCode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viviCode.model.Usuario;


public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{

}
