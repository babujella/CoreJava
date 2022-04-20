package org.cookie;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Cookie1 extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		String nam=req.getParameter("Name");
		Cookie ck=new Cookie("UserName",nam);   //create cookie object
		res.addCookie(ck);    //Add cookie to the responce.
	//	RequestDispatcher obj=req.getRequestDispatcher("Gotoo");
	//	obj.forward(req, res);
		res.getWriter().println("<a href='Gotoo'>Click here</a>");
	}
}
