
public class StudentManager {
	
	public static void toList(Student student) {
		//length=student i�indeki ki�i say�s�
		System.out.println(student.FirstName +" "+student.LastName);
	}
 public void liste(Student[] students) {
	for(Student student:students) {
  //fonksiyon �a��r�rken fonksiyon ismi fonksiyon oldugunu belirten parantez + ;
	toList(student);
		
		
	}


	 
	 
 }
}
