package Sale;

import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public class SaleManager {
	public void sale(Gamer gamer, Game game, Campaign campaing) {
		if(campaing==null) {
			System.out.println(gamer.getFirstName() + " ba�ar�yla "+ game.getName() + " oyununu " + game.getUnitPrice()+" fiyata sat�n ald�");
			
		}
		else {
			System.out.println(gamer.getFirstName() + " ba�ar�yla "+ game.getName() + " oyununu " + campaing.getCampaingName()+" kampanyas�yla "+ game.getUnitPrice()*campaing.getDiscount()/100+" fiyata sat�n ald�");
		}
	}
}
