package objectOrienrtedProg;

public class Student {
	private String name;
	private int age;
	private String gender;
	private String mobile;
	
	Student(){
		System.out.println("Default constructor called");
	}
	Student(String name , int age , String gender , String mobile){
		System.out.println("constructor with args called");
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobile=mobile;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", mobile=" + mobile + "]";
	}
	
}
