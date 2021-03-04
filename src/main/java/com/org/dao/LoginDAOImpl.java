package com.org.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.org.model.LoginVO;
 
 
public class LoginDAOImpl implements LoginDAO
{
	
	private static ResourceBundle rb= ResourceBundle.getBundle("database");
	private static Logger logger = LoggerFactory.getLogger(LoginDAOImpl.class);
	
	public boolean loginCheck(LoginVO  login  )  {
		
		boolean  result =false; 
		
		LoginVO loginObject = new LoginVO();
		
		loginObject.setUserName("admin");
		loginObject.setPassword("password");
		
		  if(login.getUserName().equals(loginObject.getUserName()))
		  {
			  if(login.getPassword().equals(loginObject.getPassword()))
			  {
				  result=true;
			  }
	  
		  }
	 
		   return result;

	}
}
