
public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println("Öğrenci Eklendi " + user.getFirstName() +" "+ user.getLastName());
	}
   public void list(Student student) {
	   System.out.println(student.getFirstName()+" "+student.getLastName()+" "+student.getEmail());
   }
   public void list2(Student[] students) {
	   for(int a=0;a<students.length;a++) {
		   System.out.println(students[a].getFirstName()+" "+students[a].getLastName());
	   }
   }
}
