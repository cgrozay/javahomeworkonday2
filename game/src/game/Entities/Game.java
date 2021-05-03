package game.Entities;

public class Game {
	private int id;
	private double coin;
	private String name;
	
	public Game () {
		
	}
	
	public Game(int id, double coin, String name) {
		
		this.id = id;
		this.coin = coin;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCoin() {
		return coin;
	}

	public void setCoin(double coin) {
		this.coin = coin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
