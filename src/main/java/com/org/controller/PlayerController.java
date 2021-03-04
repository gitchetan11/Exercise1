package com.org.controller;


import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

import com.org.model.PlayerVO;
 
import com.org.service.PlayerService;
import com.org.service.PlayerServiceImpl;

/**
 * Servlet implementation class LoginController
 */
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
 	 
		 
		Logger logger = LoggerFactory.getLogger(PlayerController.class);
		      

        // the following statement is used to log any messages  
        logger.info("My first log");  

		logger.info("welcome  ");
		RequestDispatcher dispatch= request.getRequestDispatcher("/PlayerReport.jsp");
		   String param=request.getParameter("param");
		   
		   List<PlayerVO>  playerList=null;
		   PlayerVO  bestBatsman=null;
		   PlayerService  playerService = new PlayerServiceImpl();
		   
		   if(param.equals("all"))
		   {
			  playerList= playerService.getAllPlayers();
			  logger.info(playerList.toString());
			  request.setAttribute("playerList",playerList );
			   
		   }
		   else
		   {
			   bestBatsman= playerService.getBestBatsman();
				  request.setAttribute("player",bestBatsman );
				  System.out.println("lsit :"+bestBatsman);
			   System.out.println("in else part of do get");
		   }
		   
			   
		   
		  
	  dispatch.forward(request,response);
	}

}
	 
