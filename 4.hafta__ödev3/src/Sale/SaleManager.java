package Sale;

import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public class SaleManager {
	public void sale(Gamer gamer, Game game, Campaign campaing) {
		if(campaing==null) {
			System.out.println(gamer.getFirstName() + " baþarýyla "+ game.getName() + " oyununu " + game.getUnitPrice()+" fiyata satýn aldý");
			
		}
		else {
			System.out.println(gamer.getFirstName() + " baþarýyla "+ game.getName() + " oyununu " + campaing.getCampaingName()+" kampanyasýyla "+ game.getUnitPrice()*campaing.getDiscount()/100+" fiyata satýn aldý");
		}
	}
}
