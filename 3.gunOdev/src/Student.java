
public class Student extends User{
	int OgrenciNo;
	
	

	public Student(int id, String firstName, String lastName, String password, String email, int ogrenciNo) {
		super(id, firstName, lastName, password, email);
		OgrenciNo = ogrenciNo;
	}



	



	public int getOgrenciNo() {
		return OgrenciNo;
	}



	public void setOgrenciNo(int ogrenciNo) {
		OgrenciNo = ogrenciNo;
	}

}
