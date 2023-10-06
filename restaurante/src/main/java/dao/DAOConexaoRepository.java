package dao;

import java.sql.Connection;

import connection.SingleConnection;

public abstract class DAOConexaoRepository {
	protected Connection conexao;

	public DAOConexaoRepository() {
		conexao = SingleConnection.getConnection();
	}
}
