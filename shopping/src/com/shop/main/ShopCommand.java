package com.shop.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.dao.Shopdao;


public class ShopCommand implements ShopInterface {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		System.out.println(id);
		String encodingpassword = request.getParameter("password");
		String password = sha256.encodeSha64(encodingpassword);
		System.out.println(password);
		String name = request.getParameter("name");
		System.out.println(name);
		String gender = request.getParameter("gender");
		System.out.println(gender);
		String mail = request.getParameter("mail");
		System.out.println(mail);
		String phone = request.getParameter("phone");
		System.out.println(phone);
		String address = request.getParameter("address");
		System.out.println(address);
		
		
		Shopdao sdao=new Shopdao();
		sdao.insertNewJoin(id, password,name,gender,mail,phone,address);
	}

}
