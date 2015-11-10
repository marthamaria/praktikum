package students;

public class App {

	public static void main(String[] args) {
		
		Students student1 = new Students();
		Students student2 = new Students();
		
		student1.firstName = "Anna";
		student1.lastName = " Schmidt";
		student1.age = 22;
		
		student2.firstName = "Peter";
		student2.lastName = " Müller";
		student2.age = 23;
		
		
		System.out.println("Student1's name is " + student1.getFirstName() + student1.getLastName());
		System.out.println("Student1's age is " + student1.getAge());
		
		System.out.println("Student2's name is " + student2.getFirstName() + student2.getLastName());
		System.out.println("Student2's age is " + student2.getAge());
	}

}
