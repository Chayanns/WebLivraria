package br.com.weblivraria.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.weblivraria.dao.DAOUsuario;
import br.com.weblivraria.dominio.Usuario;

public class TestDAOUsuario {

	// Vamos realizar os teste em todos os métodos que estão
	// na classe DAOUsuario.

	// Vamos começar testando o cadastro do usuário.
//	@Test
//	public void testCadastroUsuario() {
//		//Realizar a instÂncia da classe Usuario e aplicar dados
//		//fictcios para cadastrar. Está técnica é chamada de dados
//		//mockados
//		Usuario us = new Usuario();
//		us.setNomeusuario("Enzo");
//		us.setSenha("123");
//		us.setEmail("enzo@gmail.com");
//		us.setTelefone("11 9328-9528");
//		us.setNomecompleto("Enzo vongric");
//		us.setCpf("547824521473");
//		
//		//Instância da classe DAOUsuario
//		DAOUsuario daous = new DAOUsuario();
//		assertEquals("Cadastro realizado",daous.Cadastrar(us));*/

//	}
//	@Test
//	public void testListar() {
//		DAOUsuario daous = new DAOUsuario();
//		List<Usuario> resultado = new ArrayList<Usuario>();
//		assertEquals(resultado, daous.listar());
//	}
//	@Test
//	public void testPesquisar() {
//		  
//		 assertEquals("jude", daous.pesquisar(usuario_id).getNomeusuario());
//	}
//
//	@Test
//	public void testAtualizar() {
//		Usuario us_test = new Usuario();
//		us_test.setIdusuario(1);
//		us_test.setNomeusuario("jude Bel");
//		us_test.setEmail("judeb@gmail.com");
//		us_test.setTelefone("11 9658-9628");
//		us_test.setNomecompleto("Jude Victor Belligham");
//		
//		DAOUsuario daous = new DAOUsuario();
//		
//		assertEquals("Atualização realizada", daous.atualizar(us_test));
//		
//		
//	}
	@Test
	public void testLogin() {
		Usuario us = new Usuario();
		us.setNomeusuario("judeb");
		us.setSenha("123");
		
		DAOUsuario daous = new DAOUsuario();
		assertTrue(daous.login(us));
	}
}
