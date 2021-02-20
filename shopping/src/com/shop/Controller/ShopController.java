package com.shop.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.main.ShopCommand;
import com.shop.main.ShopInterface;


/**
 * Servlet implementation class ShopController
 */
@WebServlet("*.so")
public class ShopController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ShopController (doGet)");
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MemberController (doPost)");

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		ShopInterface bCom = null;
		String viewPage = null;

		String uri = request.getRequestURI();
		System.out.println(uri);

		String conPath = request.getContextPath();
		System.out.println(conPath);

		String com = uri.substring(conPath.length());
		System.out.println(com);

		if (com.equals("/index/join.so")) {
			viewPage = "index.jsp";
			bCom = new ShopCommand();
			bCom.execute(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		}
	}

}
