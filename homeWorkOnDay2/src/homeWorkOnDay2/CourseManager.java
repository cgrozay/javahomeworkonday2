package homeWorkOnDay2;

public class CourseManager {
	public void addToEducation(Course course) {
		System.out.println("Eðitim Eklendi : "+course.name);
	}
	public void GetToList(Course course) {
		System.out.println("Eðitimler Listelendi  : "+course.id+"  "+course.name);
	}
	public void GetByCategoryList(Category category) {
		System.out.println("Kategoriler listeleniyor   : "+category.name);
	}
}
