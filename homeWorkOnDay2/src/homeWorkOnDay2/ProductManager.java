package homeWorkOnDay2;

public class ProductManager {
	public void addToEducation(Product product) {
		System.out.println("E�itim Eklendi : "+product.name);
	}
	public void GetToList(Product product) {
		System.out.println("E�itimler Listelendi  : "+product.id+"  "+product.name);
	}
	public void GetByCategoryList(Category category) {
		System.out.println("Kategoriler listeleniyor   : "+category.name);
	}
}
