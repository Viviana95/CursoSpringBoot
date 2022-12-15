package com.exampleCode.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exampleCode.demo.model.Persona;
import com.exampleCode.demo.repo.IPersonaRepo;

@RestController
public class RestDemoController {
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/person")
	public List<Persona>listar(){
		return repo.findAll();
	}
	@PostMapping("/person")
	public void insertar(@RequestBody Persona per) {
		repo.save(per);
	}
	@PutMapping("/person/{id}")
	public void modificar(@PathVariable Integer id, @RequestBody Persona per) {
		repo.save(per);
	}
	@DeleteMapping(value = "person/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}



	

}
