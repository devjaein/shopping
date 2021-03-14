package com.shop.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.dao.signUpdao;


public class signUpCommand implements ShopInterface {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		System.out.println(id);
		String encodingpassword = request.getParameter("password");
		String password = sha256.encodeSha64(encodingpassword);
		System.out.println(password);
		String name = request.getParameter("name");
		System.out.println(name);
		String rnn1 = request.getParameter("rnn1");
		System.out.println(rnn1);
		String rnn2 = request.getParameter("rnn2");
		System.out.println(rnn2);
		String gender = request.getParameter("gender");
		System.out.println(gender);
		String mail1 = request.getParameter("mail1");
		System.out.println(mail1);
		String mail2 = request.getParameter("mail2");
		System.out.println(mail2);
		String phone1 = request.getParameter("phone1");
		System.out.println(phone1);
		String phone2 = request.getParameter("phone2");
		System.out.println(phone2);
		String phone3 = request.getParameter("phone3");
		System.out.println(phone3);
		String address1 = request.getParameter("address1");
		System.out.println(address1);
		String address2 = request.getParameter("address2");
		System.out.println(address2);
		String address3 = request.getParameter("address3");
		System.out.println(address3);
		String address4 = request.getParameter("address4");
		System.out.println(address4);
		
		
		signUpdao sdao=new signUpdao();
		sdao.insertNewJoin( id, password, name, rnn1, rnn2, gender, mail1, mail2, phone1, phone2, phone3, address1,
	            address2, address3, address4);
	}

}
