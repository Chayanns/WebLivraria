package br.com.weblivraria.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.weblivraria.dominio.DetalhePedido;

public class DAODetalhe extends Conexao implements CRUDLivraria<DetalhePedido>{

	@Override
	public String Cadastrar(DetalhePedido dados) {
		String msg = "";
		try {
		if(abrirConexao()) {
			String sql = "insert into detalhepedido(idlivro,idpedido,precototal,quantidade)values(?,?,?,?)";
			pst = con.prepareStatement(sql);
			pst.setInt(1,dados.getIdLivro());
			pst.setInt(2, dados.getIdpedido());
			pst.setDouble(3,dados.getPrecototal());
			pst.setInt(4, dados.getQuantidade());
			
			if(pst.executeUpdate()>0) {
				msg = "Cadastro efetuado";
			}
			else {
				msg = "Não foi possível cadastrar ";
			}
		}
			else {
				msg = "Não foi possível abrir a conexão com o banco";
			}
		}
		catch(SQLException se) {
			msg = "Erro na consulta. "+se.getMessage();
		}
		catch(Exception e) {
			msg = "Erro inesperado. "+e.getMessage();
		}
		finally {
			fecharConexao();
		}

		return msg;

}

	@Override
	public List<DetalhePedido> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DetalhePedido pesquisar(DetalhePedido dados) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String atualizar(DetalhePedido dados) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String apagar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
