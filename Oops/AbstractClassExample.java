package objectOrienrtedProg;

import java.util.Scanner;

abstract class Students{
	String name;
	int age;
	String rollNumber;
	float attendence;
	int totalDays = 50;
	
	abstract void calculateAttendence();
	
	Students(String name , int age , String rollNumber){
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + ", attendence=" + attendence
				+ ", totalDays=" + totalDays + "]";
	}

	
}

class CorrespondanceStudent extends Students{

	CorrespondanceStudent(String name, int age, String rollNumber) {
		super(name, age, rollNumber);
	}

	@Override
	void calculateAttendence() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days you come to institution: ");
		int daysInInstitute = sc.nextInt();
		System.out.println("Enter number of days you come to online classes: ");
		int daysInDistance = sc.nextInt();
		int days = daysInInstitute+daysInDistance;
		attendence = ((float)days/totalDays)*100;
	}
	
}

class RegularStudent extends Students{

	RegularStudent(String name, int age, String rollNumber) {
		super(name, age, rollNumber);
	}

	@Override
	void calculateAttendence() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days you come to college: ");
		int days = sc.nextInt();
		attendence = ((float)days/totalDays)*100;
	}
	
}

public class AbstractClassExample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------Enter details of regular student:----- ");
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter rollNumber: ");
		String rollNumber = sc.nextLine();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		RegularStudent r = new RegularStudent(name , age , rollNumber);
		r.calculateAttendence();
		System.out.println(r);
		
		System.out.println();
		
		System.out.println("-----Enter details of correspondance student:----- ");
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("Enter rollNumber: ");
		rollNumber = sc.nextLine();
		System.out.println("Enter age: ");
		age = sc.nextInt();
		
		CorrespondanceStudent c = new CorrespondanceStudent(name , age , rollNumber);
		c.calculateAttendence();
		System.out.println(c);
	}
}
