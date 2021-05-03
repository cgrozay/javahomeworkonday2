package game.Abstract;

import game.Entities.Campaign;
import game.Entities.Game;
import game.Entities.Gamer;

public interface GameSaleService {
	void sale(Game game,Gamer gamer,Campaign campaign);
}
