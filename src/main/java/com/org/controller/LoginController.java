package com.org.controller;

import java.io.IOException;
 

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.org.model.LoginVO;
 
import com.org.service.LoginService;
import com.org.service.LoginServiceImpl;
 
 
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	public static final Logger   LOG= LoggerFactory.getLogger(LoginController.class);
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean result=false;
		 LoginService  s= new LoginServiceImpl();
		  LoginVO  login = new LoginVO();
		  login.setUserName(request.getParameter("user"));
		  login.setPassword(request.getParameter("pass"));
		  LOG.info(login.getUserName()+":"+login.getPassword());
		    
		result= s.loginCheck(login);
		
		LOG.info("Service object in Login check:"+result);
		  
		  
		 
		  
		  if(result)
		  {   
			  LOG.debug("result is true:"+result);
			  
			  
			  response.sendRedirect("MemberOptions.jsp");
		  }
		  else
		  {  LOG.debug("result is false:"+result);
			  System.out.println("problem in login try again:");
		  }
	}

}
