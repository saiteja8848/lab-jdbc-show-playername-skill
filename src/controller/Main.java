package controller;

import java.sql.SQLException;
import java.util.List;

import dao.PlayerDAO;
import model.Player;

public class Main{
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
	 PlayerDAO playerDao = new PlayerDAO();
	 List<Player> playersList = playerDao.getAllPlayers();
	
	 for(Player player:playersList) {
		 player.display();
	 }
	 
	 
	}
}
