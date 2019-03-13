package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String uname = request.getParameter("u");
		String pass = request.getParameter("p");
	    int flag = 0;
		
		if(uname.equals("abc") && pass.equals("abc")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("addhos.jsp");
		}
		else {
			/*PrintWriter out = response.getWriter();
			response.setContentType("text/html"); 
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('try again');");  
			out.println("</script>");
			//response.sendRedirect("login.jsp");
			flag = 1;*/
			response.sendRedirect("login.jsp");
		}
		
	}
}
