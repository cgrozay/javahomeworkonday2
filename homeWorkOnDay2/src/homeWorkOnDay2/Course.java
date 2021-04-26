package homeWorkOnDay2;

public class Course {
		public Course() {
			System.out.println("Kurs çalýþýyor");
		}
	public Course(int id,String name,String curseType) {
		
		this();
		this.id=id;
		this.name=name;
		this.curseType=curseType;
	}
	
	
	
	int id;
	String name;
	String curseType;
}
