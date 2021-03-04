package com.org.service;

import java.sql.SQLException;
import java.util.List;
import com.org.model.PlayerVO;

 

public interface PlayerService {

 
List<PlayerVO> getAllPlayers() ;
PlayerVO  getBestBatsman() ;

}
