package com.techouts;

import java.io.IOException;

import org.apache.catalina.connector.Response;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Request extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		String name=req.getParameter("Name");
		String password1=req.getParameter("pword");
		if(password1.equals("Babu4949")) {
			RequestDispatcher obj=req.getRequestDispatcher("welcome");
			obj.forward(req, res);
		}
		else {
			res.getWriter().println("Sorry credentials are Wrong..");
			RequestDispatcher obj1=req.getRequestDispatcher("/RequestDispaturehtml.html");
			obj1.include(req, res);
		}
	}
}
