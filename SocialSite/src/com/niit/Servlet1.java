package com.niit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.apple.eawt.Application;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Servlet1() {
        super();
    }

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String username=request.getParameter("username");
	String password=request.getParameter("password");
	PrintWriter out=response.getWriter();
	
	Servlet1DAO ob=new Servlet1DAO();
	 flag f=ob.validate(username, password);
	 
	
	 
	
	if(f.flag_user){
	       if(f.flag_pass){
	    	    request.setAttribute("user", username);
	    		response.setContentType("text/html");
            RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
	    	    rd.forward(request, response);
	       }
	       else{
	    	   out.println("username and password do not matches");
	    		response.setContentType("text/html");

	    	   RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
	    		rd.include(request, response);
	       }
	
	
	}
	else{
	out.println("user with this usename does not exist please register");
	   response.setContentType("text/html");
	RequestDispatcher rd=request.getRequestDispatcher("register.jsp");
	rd.include(request, response);
	}
	

	}
}
