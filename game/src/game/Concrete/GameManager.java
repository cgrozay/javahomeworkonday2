package game.Concrete;

import game.Abstract.GameService;
import game.Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun Kay�t edildi :"+game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun G�ncellendi :"+game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Silindi :"+game.getName());
		
	}

}
