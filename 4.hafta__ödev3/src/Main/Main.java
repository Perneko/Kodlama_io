package Main;

import java.time.LocalDate;
import java.util.Date;

import Log.GameLogManager;
import Log.LogManager;
import Sale.SaleManager;
import Check.CheckAlwaysTrue;
import Check.MernisCheck;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;
import Interfaces.GameLogService;


public class Main {
	
	public static void main(String[] args) {
		
		Gamer gamer=new Gamer(1, "Taha Emre", "UÐUR", LocalDate.of(1999, 4, 2), "22066600710");
		LogManager log= new LogManager(new MernisCheck());
		log.Add(gamer);
		
		Game game= new Game(1, "Valheim", 30, "1gb");
		GameLogManager gamelog=new GameLogManager();
		gamelog.Add(game);
		
		Campaign campaign = new Campaign(1,"Yeni yýl" , 50);
		
		SaleManager sale = new SaleManager();
		sale.sale(gamer, game, campaign);

	}

}
