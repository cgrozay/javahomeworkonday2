package game.Concrete;

import game.Abstract.GamerCheckService;
import game.Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean check(Gamer gamer) {
		boolean result =true;
		if(gamer.getIdentificationNumber()!=gamer.getIdentificationNumber()) {
			result=false;
			
		}else if (result==false) {
			System.out.println("Kimlik Do�rulmaa Ba�ar�s�z :"+gamer.getIdentificationNumber()+" "+gamer.getFirstName());
		}else {
			System.out.println("Kimlik Do�rulama Ba�ar�l� :"+gamer.getIdentificationNumber()+" "+gamer.getFirstName());
		}
		return result;
	}

}
