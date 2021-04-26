package homeWorkOnDay2;

public class ProductManager {
	public void addToEducation(Product product) {
		System.out.println("Eðitim Eklendi : "+product.name);
	}
	public void GetToList(Product product) {
		System.out.println("Eðitimler Listelendi  : "+product.id+"  "+product.name);
	}
	public void GetByCategoryList(Category category) {
		System.out.println("Kategoriler listeleniyor   : "+category.name);
	}
}
