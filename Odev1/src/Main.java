
public class Main {

	public static void main(String[] args) {
		//Student student -->Statik k�s�m
		//constructer-->class tan�mland���nda �al��an fonksiyon
		Student student1=new Student("Yavuz","Yerer","123","1");
		Student student2=new Student("Ali","Yener","123","2");
		Student student3=new Student("Ahmet","I��k","123","3");
		
		Course course1=new Course("Yaz�l�m Geli�tirici Yeti�tirme Kamp�","Engin Demirog",24);
		Course course2=new Course("C# Yeti�tirme Kamp�","Engin Demirog",48);
		
		StudentManager studentmanager=new StudentManager();
		CourseManager coursemanager=new CourseManager();
		//Bir t�r�n array oldu�unu belirtmek i�in k��eli parantez kullan�l�r.
		Student[] students= {student1,student2,student3};
		studentmanager.liste(students);
		coursemanager.kursTamamlama(student1);
		coursemanager.signUp(student2);
		coursemanager.kursTamamlama(student3);
		
		

		
		
	
		
		
	
		
		
		
		
		
	}

}
