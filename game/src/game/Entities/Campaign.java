
package game.Entities;

public class Campaign {
	private int id;
	private String name;
	private String discountCode;
	private double discountRate;
	
	public Campaign() {
		
	}

	public Campaign(int id,String name, String discountCode, double discountRate) {
		super();
		this.id = id;
		this.name=name;
		this.discountCode = discountCode;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(Double discountRate) {
		this.discountRate = discountRate;
	}
	
}
