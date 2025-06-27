package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

		 int i = Integer.parseInt(req.getParameter("num1"));
	     int j = Integer.parseInt(req.getParameter("num2"));

	     int k = i + j;
	     
	     res.setContentType("text/html");
	     PrintWriter out = res.getWriter();
	     out.println("<h2>Result is: " + k + "</h2>");

	     

	}

}
