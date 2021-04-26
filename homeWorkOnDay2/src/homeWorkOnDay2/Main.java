package homeWorkOnDay2;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course();
		course1.id=1;
		course1.name="Yaz�l�m Geli�tirici Yeti�tirme Kamp� C#-Angular";
		
		Course course2=new Course();
		course2.id=2;
		course2.name="Yaz�l�m Geli�tirici Yeti�tirme Kamp� Java-React";
		
		Course course3=new Course();
		course3.id=3;
		course3.name="Programlamaya Giri� ��in Temel Kurs";
		
		System.out.println("----------------------------");
		
		Category category1=new Category();
		category1.id=1;
		category1.name="Programlama";
		
		System.out.println("---------------------------");
		
		CourseManager courseManager=new CourseManager() ;
		courseManager.addToEducation(course1);
		courseManager.addToEducation(course2);
		courseManager.addToEducation(course3);
		
		System.out.println("---------------------------");
		
		Course[] courses= {course1,course2,course3};
		for (Course course : courses) {
			
			System.out.println(course.id+" "+course.name);
		}
		
		
	}

}
