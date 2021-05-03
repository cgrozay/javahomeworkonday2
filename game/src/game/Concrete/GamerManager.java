package game.Concrete;

import game.Abstract.GamerService;
import game.Entities.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu Sisteme Eklendi :"+gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu Sisteme Güncellendi :"+gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Sistemden Silindi :"+gamer.getFirstName());
		
		
	}

}
