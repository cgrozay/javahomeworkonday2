package homeWorkOnDay2;

public class Main {

	public static void main(String[] args) {
		Product product1=new Product();
		product1.id=1;
		product1.name="Yazýlým Geliþtirici Yetiþtirme Kampý C#-Angular";
		
		Product product2=new Product();
		product2.id=2;
		product2.name="Yazýlým Geliþtirici Yetiþtirme Kampý Java-React";
		
		Product product3=new Product();
		product3.id=3;
		product3.name="Programlamaya Giriþ Ýçin Temel Kurs";
		
		System.out.println("----------------------------");
		
		Category category1=new Category();
		category1.id=1;
		category1.name="Programlama";
		
		System.out.println("---------------------------");
		
		ProductManager productManager=new ProductManager() ;
		productManager.addToEducation(product1);
		productManager.addToEducation(product2);
		productManager.addToEducation(product3);
		
		System.out.println("---------------------------");
		
		Product[] products= {product1,product2,product3};
		for (Product product : products) {
			System.out.println(product.id+product.name);
		}
		
		
	}

}
