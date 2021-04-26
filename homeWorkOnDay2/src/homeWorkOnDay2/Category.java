package homeWorkOnDay2;

public class Category {
	public Category() {
		System.out.println("Kategori Çalýþýyor");
	}
	public Category(int id, String name) {
		this();
		this.id=id;
		this.name=name;
	}
	
	int id;
	String name;
}
