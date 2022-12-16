package com.viviCode.repo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.viviCode.model.Usuario;

@SpringBootTest
class IUsuarioRepoTest {
	
	@Autowired
	private IUsuarioRepo usuRepo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	

	@Test
	void testAgregar() {
		Usuario usu = new Usuario(0, "Vivi", encoder.encode("queFuncione"));
		Usuario usuRetorno = usuRepo.save(usu);
		assertEquals(usu.getNombre(), usuRetorno.getNombre());
		
	}

}
