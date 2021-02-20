package com.shop.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.shop.util.DBConn;

public class Shopdao {
	public void insertNewJoin(String id, String password, String name, String gender, String mail, String phone, String address) {
	      Connection conn = null;
	      Statement stmt;

	      String sql = "insert into shop(id,password,name,gender,mail,phone,address) values('%s','%s','%s','%s','%s','%s','%s')";

	      sql = String.format(sql, id, password,name,gender,mail,phone,address);
	      try {
	         conn = DBConn.getInstance();
	         conn.setAutoCommit(false);
	         stmt = conn.createStatement();

	         stmt.executeUpdate(sql);
	         System.out.println(sql);
	         conn.commit();

	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         try {
	            conn.rollback();
	         } catch (SQLException e1) {
	            // TODO Auto-generated catch block
	            e1.printStackTrace();
	         }
	         finally {
	         e.printStackTrace();
	         }
	      }
	      finally {
	      DBConn.dbClose();
	      }
	   }
}

