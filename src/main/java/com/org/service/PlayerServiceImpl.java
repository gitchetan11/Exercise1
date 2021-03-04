package com.org.service;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.org.dao.PlayerDAO;
import com.org.dao.PlayerDAOImpl;
import com.org.model.PlayerVO;


public class PlayerServiceImpl implements PlayerService 
{

	static PlayerDAO  playerDAO;
	public static PlayerDAO getCustomerDAO( ) {
		 
		if(playerDAO==null)
		{
			playerDAO = new PlayerDAOImpl();
		}
		return playerDAO;
	}
 

	public List<PlayerVO> getAllPlayers()  {
		 List<PlayerVO> playerList= new ArrayList<PlayerVO>();
		 playerDAO=getCustomerDAO();

			playerList=playerDAO.getAllPlayers();
		 
		return playerList;
	}
	public PlayerVO  getBestBatsman() 
	{
		
		 playerDAO=getCustomerDAO();

		 PlayerVO player =playerDAO.getBestBatsman();
		 
		return player;
	}
	
}
