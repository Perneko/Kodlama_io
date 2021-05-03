package Log;

import Entity.Game;
import Entity.Gamer;
import Interfaces.GameLogService;
import Interfaces.LogService;

public class GameLogManager implements GameLogService  {

	@Override
	public void Add(Game game) {
		System.out.println("Oyun Yüklendi :"+ game.getName());
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println("Oyun silindi :"+ game.getName());
		
	}

	@Override
	public void Update(Game game) {
		System.out.println("Oyun Güncellendi :"+ game.getName());
		
	}

	

}
