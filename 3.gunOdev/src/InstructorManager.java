
public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Eðitmen Eklendi "+user.getFirstName()+" "+ user.getLastName());
	}
   public void remove(Instructor instructor) {
	   System.out.println("Eðitmen Silindi "+instructor.getFirstName()+" "+ instructor.getLastName());
   }
}
