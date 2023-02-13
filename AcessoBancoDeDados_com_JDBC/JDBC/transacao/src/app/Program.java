package app;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;

		try {
			conn = DB.getConnection();

			st = conn.createStatement();
			
			conn.setAutoCommit(false);	//proteção para integridade
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2900 where DepartmentId = 1");
			
			//forçar uma exceção
			int x = 1;
			if(x < 2) {
				throw new SQLException("Fake error");
			}

			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3900 where DepartmentId = 2");

			conn.commit();	//operação dentro do bloco confirmará apenas aqui. Visa garantir a integralidade do banco de dados
			
			
			System.out.println("Rows1 "+rows1);
			System.out.println("Rows2 "+rows2);
			
		} catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back: "+e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rolled back "+e1.getMessage());
				
			}

		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}