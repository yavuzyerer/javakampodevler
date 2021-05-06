
public class Main {

	public static void main(String[] args) {
		UserManager userManager = new StudentManager();
		Student student1 = new Student(1,"Yavuz","Yerer","yavuz12345","yavuz@gmail.com",416);
		Student student2 = new Student(2,"Omer","Yener","yavuz12345","yavuz@gmail.com",416);
		Student student3 = new Student(3,"Ahmet","Güllüoğlu","yavuz12345","yavuz@gmail.com",416);
		Instructor instructor1 = new Instructor(4,"Engin","Demirog","engin987","engin@gmail.com",92000);
		Instructor instructor2 = new Instructor(5,"Atil","Samancıoglu","121321","21312",300000);
		UserManager userManager2 = new InstructorManager();
		userManager.add(student1);
		userManager2.add(instructor2);
		StudentManager studentManager = new StudentManager();
		studentManager.list(student1);
		Student[] students={student1,student2,student3};
		studentManager.list2(students);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.remove(instructor1);
		instructorManager.remove(instructor2);
		

	}

}
