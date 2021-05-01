
public class StudentManager {
	
	public static void toList(Student student) {
		//length=student içindeki kişi sayısı
		System.out.println(student.FirstName +" "+student.LastName);
	}
 public void liste(Student[] students) {
	for(Student student:students) {
  //fonksiyon çağırırken fonksiyon ismi fonksiyon oldugunu belirten parantez + ;
	toList(student);
		
		
	}


	 
	 
 }
}
