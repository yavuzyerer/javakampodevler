
public class Instructor extends User {
	double salary;
	
	
	public Instructor(int id, String firstName, String lastName, String password, String email ,double _salary) {
		super(id, firstName, lastName, password, email);
		salary=_salary;
	}



	
	public double getSalary() {
		return salary;
		
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
