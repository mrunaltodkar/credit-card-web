package com.capgemini.creditcard.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns =  "/loginServlet" , loadOnStartup = 1)
public class CreditCardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CreditCardController() {
		super();
		
	}
	

	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * 
	 * }
	 */

	
	



	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		//String path = request.getServletPath();
		
			Long cardNumber = Long.parseLong(request.getParameter("card-number"));
			String month = request.getParameter("Month");
			Long year = Long.parseLong(request.getParameter("Year"));
			int cvv = Integer.parseInt(request.getParameter("cvv"));
			
			PrintWriter out =response.getWriter();
			
			out.println("Your Credit Card Number is " +cardNumber +"<br>" );
			out.println("Expiry Date is " +month +year);
			out.println("<br> CVV is " +cvv);
			
			out.close();
		
	
	}

}
