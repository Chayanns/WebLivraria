package br.com.weblivraria.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.weblivraria.dominio.Pedido;

public class DAOPedido extends Conexao implements CRUDLivraria<Pedido> {

	@Override
	public String Cadastrar(Pedido dados) {
		String msg = "";
		try {
			if(abrirConexao()){
			String sql = "Insert into pedido(idusuario,totalpedido)values(?,?)";
			pst = con.prepareStatement(sql);
			pst.setInt(1,dados.getIdusuario());
			pst.setDouble(2, dados.getTotalpedido());
			
			if(pst.executeUpdate()>0) {
				msg = "Pedido efetuado";
			}
			else {
				msg = "Não foi possível realizar o pedido";
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
	public List<Pedido> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido pesquisar(Pedido dados) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String atualizar(Pedido dados) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String apagar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
