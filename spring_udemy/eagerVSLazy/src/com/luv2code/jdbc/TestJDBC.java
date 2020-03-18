package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimezone=UTC";
		String user_id = "hbstudent";
		String password = "hbstudent";

		try {

			System.out.println("Connecting to DB: " + jdbcUrl);
			Connection mycon = DriverManager.getConnection(jdbcUrl, user_id, password);
			System.out.println("Connection successful");

			mycon.beginRequest();

			mycon.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Nothin Major");
		}

	}
}
