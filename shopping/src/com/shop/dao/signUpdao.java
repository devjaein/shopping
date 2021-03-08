package com.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.shop.util.DBConn;
import com.show.dto.mainpagedto;
import com.show.dto.signUpdto;

public class signUpdao {
	public void insertNewJoin(String id, String password, String name,String rnn, String gender, String mail, String phone, String address) {
	      Connection conn = null;
	      Statement stmt;

	      String sql = "insert into member(id,password,name,rnn,gender,mail,phone,address) values('%s','%s','%s','%s','%s','%s','%s','%s')";

	      sql = String.format(sql, id, password,name,rnn,gender,mail,phone,address);
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
	
	public int checkId(String id) {
		DBConn.getInstance();
		int result = 0;
		String sql = "select id from member where id='" + id + "'";
		System.out.println(sql);
		ResultSet rs = DBConn.statementQuery(sql);

		try {
			if (rs.next()) {
				result = 1;
				System.out.println(id + " = 존재합니다. ");

			} else {
				result = -1;
				System.out.println(id + " 로 회원가입이 가능합니다. ");
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

		DBConn.dbClose();
		return result;
	}
	

}

