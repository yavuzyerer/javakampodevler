
public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("E�itmen Eklendi "+user.getFirstName()+" "+ user.getLastName());
	}
   public void remove(Instructor instructor) {
	   System.out.println("E�itmen Silindi "+instructor.getFirstName()+" "+ instructor.getLastName());
   }
}
