package application;

import java.sql.Connection;


import db.DB;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException {


		Connection conn =  DB.getConnection();
		DB.closeConnection();
		
		System.out.println("oi");
		
	}

}