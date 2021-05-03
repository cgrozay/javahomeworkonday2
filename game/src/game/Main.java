package game;


import game.Concrete.GameManager;
import game.Concrete.GameSaleManager;
import game.Concrete.GamerCheckManager;
import game.Concrete.GamerManager;
import game.Entities.Campaign;
import game.Entities.Game;
import game.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 =new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Çaðrý");
		gamer1.setLastName("Özay");
		gamer1.setIdentificationNumber("11111");
		gamer1.setBirthYear(1988);
		
		Game game1=new Game();
		game1.setId(1);
		game1.setName("Java simülatör Oyunu");
		game1.setCoin(1000.0);
		
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		gameManager.update(game1);
		gameManager.delete(game1);
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		GamerCheckManager gamerCheckManager=new GamerCheckManager();
		gamerCheckManager.check(gamer1);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<");
		GamerManager gamerManager=new GamerManager();
		gamerManager.add(gamer1);
		gamerManager.update(gamer1);
		gamerManager.delete(gamer1);
		
		Campaign campaign1=new Campaign();
		campaign1.setId(1);
		campaign1.setName("Javaya Ramazan Özel");
		campaign1.setDiscountCode("java");
		campaign1.setDiscountRate(60.0);
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		GameSaleManager gameSaleManager=new GameSaleManager();
		gameSaleManager.sale(game1, gamer1, campaign1);
		
		
	}

}
