package objectOrienrtedProg;

class Person{
	private String name;
	private int age;
	private String gender;
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}
	
}

class Student1 extends Person{
	private String collegeName;
	private int RollNUmber;
	
	public Student1(String name, int age, String gender, String collegeName, int rollNUmber) {
		super(name, age, gender);
		this.collegeName = collegeName;
		RollNUmber = rollNUmber;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public int getRollNUmber() {
		return RollNUmber;
	}
	
}


public class InheritanceExample {

	public static void main(String[] args) {
		Student1 st1 = new Student1("Ajay" , 20 , "Male" , "Graphic Era" , 12);
		System.out.println("Name of Student is: "+st1.getName());
		System.out.println("age of Student is: "+st1.getAge());
		System.out.println("Roll number of Student is: "+st1.getRollNUmber());
		System.out.println("College name of Student is: "+st1.getCollegeName());
	}

}
