package com.webApplication;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{
	
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  //Ausgabe der Parameter von dem URL
		  //System.out.println(request.getParameter("name"));
		  /*
		  //Damit wir dieses Parameter in dem JSP-File verwenden können
		  request.setAttribute("name", request.getParameter("name"));
		  request.setAttribute("passwort", request.getParameter("passwort"));
		  */
		  request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);		  
	  }
	  
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String name = request.getParameter("name");
		  String passwort = request.getParameter("passwort");
		  
		  UserValidationService userValidationService = new UserValidationService();
		  
		  if(userValidationService.isUserValide(name, passwort)) {
			  request.setAttribute("name", name);
			  request.setAttribute("passwort", passwort);
			  request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		  } else {
			  request.setAttribute("error", "Username oder Passwort ist falsch");
			  request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);	
		  }
		  		  
	  }
}
