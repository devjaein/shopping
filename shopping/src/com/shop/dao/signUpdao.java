package com.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.shop.dto.mainpagedto;
import com.shop.dto.signUpdto;
import com.shop.util.DBConn;

public class signUpdao {
	   public void insertNewJoin(String id, String password, String name, String rnn1, String rnn2, String gender,
		         String mail1, String mai12, String phone1, String phone2, String phone3, String address1, String address2,
		         String address3, String address4) {
		      // TODO Auto-generated method stub
		      Connection conn = null;
		      Statement stmt;

		      String sql = "insert into member(ID, PASSWORD, NAME, RNN, GENDER, MAIL, PHONE, ADDRESS)"
		            + "VALUES('%s','%s,','%s','%s'||'%s','%s','%s'||'%s','%s'||'%s'||'%s','%s'||'%s'||'%s')";
		      sql = String.format(sql, id, password, name, rnn1, rnn2, gender, mail1, mai12, phone1, phone2, phone3, address1,
		            address2, address3, address4);
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
		         } finally {
		            e.printStackTrace();
		         }
		      } finally {
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

