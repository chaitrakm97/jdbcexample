//package com.demo.jdbc.common;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.env.Environment;
//
//public class DatabaseConnection {
//
////	 @Autowired
////	 private Environment env;
//
//	public Connection getConnection() {
//		Connection con = null;
//		try {
//			Class.forName(Constants.DBDRIVER);
//			con = DriverManager.getConnection(Constants.DBURL, Constants.DBUSER, Constants.DBPASS);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		return con;
//	}
//
//}
