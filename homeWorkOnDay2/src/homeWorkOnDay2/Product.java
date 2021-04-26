package homeWorkOnDay2;

public class Product {
	public Product() {
		System.out.println("Eðitimler Çalýþýyor");
	}
	public Product(int id, String name) {
		this();
		this.id=id;
		this.name=name;
	}
	
	int id;
	String name;
}
