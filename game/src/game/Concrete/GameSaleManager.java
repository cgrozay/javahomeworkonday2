package game.Concrete;

import game.Abstract.GameSaleService;
import game.Entities.Campaign;
import game.Entities.Game;
import game.Entities.Gamer;

public class GameSaleManager implements GameSaleService{
	Campaign campaign;
	
	@Override
	public void sale(Game game ,Gamer gamer,Campaign campaign) {
		double result;
		result=game.getCoin()-((game.getCoin()* campaign.getDiscountRate())/100);
		System.out.println("Satýþ Baþarýlý bir þekilde gerçekleþtirildi :"+campaign.getName()+" "+game.getName()+" "+result+"TL");
		
	}

	
	
	
}
