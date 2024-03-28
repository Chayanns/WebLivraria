package br.com.weblivraria.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.weblivraria.dao.DAOUsuario;
import br.com.weblivraria.dominio.Usuario;

public class TestDAOUsuario {
	
	//Vamos realizar os teste em todos os métodos que estão 
	//na classe DAOUsuario.
	
	//Vamos começar testando o cadastro do usuário.
	@Test
	public void testCadastroUsuario() {
		//Realizar a instÂncia da classe Usuario e aplicar dados
		//fictcios para cadastrar. Está técnica é chamada de dados
		//mockados
		Usuario us = new Usuario();
		us.setNomeusuario("Jude");
		us.setSenha("123");
		us.setEmail("jude@gmail.com");
		us.setTelefone("11 9658-9628");
		us.setNomecompleto("Jude Victor Belligham");
		us.setCpf("54782414556");
		
		//Instância da classe DAOUsuario
		DAOUsuario daous = new DAOUsuario();
		assertEquals("Cadastro realizado",daous.Cadastrar(us));
		
	}	
}
	
