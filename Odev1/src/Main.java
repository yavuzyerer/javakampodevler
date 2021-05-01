
public class Main {

	public static void main(String[] args) {
		//Student student -->Statik kısım
		//constructer-->class tanımlandığında çalışan fonksiyon
		Student student1=new Student("Yavuz","Yerer","123","1");
		Student student2=new Student("Ali","Yener","123","2");
		Student student3=new Student("Ahmet","Işık","123","3");
		
		Course course1=new Course("Yazılım Geliştirici Yetiştirme Kampı","Engin Demirog",24);
		Course course2=new Course("C# Yetiştirme Kampı","Engin Demirog",48);
		
		StudentManager studentmanager=new StudentManager();
		CourseManager coursemanager=new CourseManager();
		//Bir türün array olduğunu belirtmek için köşeli parantez kullanılır.
		Student[] students= {student1,student2,student3};
		studentmanager.liste(students);
		coursemanager.kursTamamlama(student1);
		coursemanager.signUp(student2);
		coursemanager.kursTamamlama(student3);
		
		

		
		
	
		
		
	
		
		
		
		
		
	}

}
