package homeWorkOnDay2;

public class Product {
	public Product() {
		System.out.println("E�itimler �al���yor");
	}
	public Product(int id, String name) {
		this();
		this.id=id;
		this.name=name;
	}
	
	int id;
	String name;
}
