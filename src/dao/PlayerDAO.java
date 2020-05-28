package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import utility.ConnectionManager;

public class PlayerDAO{
	public List<Player> getAllPlayers() throws ClassNotFoundException, SQLException {
		
		List<Player> playersList =null;
		Connection con =ConnectionManager.getConnection();
		
		if(con!=null) {
			playersList = new ArrayList<>();
    		Statement stmt = con.createStatement();	
		  ResultSet rs = stmt.executeQuery("SELECT * FROM CRICKETPLAYERS");
		  while(rs.next()) {
			  Player player = new Player();
			  player.setPlayerld(rs.getInt(1));
			  player.setName(rs.getString(2));
			  player.setCountry(rs.getString(3));
			  
			  playersList.add(player);
		  }
			return playersList;
		}
		else
			return playersList;
	
	}
}
