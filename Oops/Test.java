package objectOrienrtedProg;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student obj = new Student();
		System.out.println("Enter Name of student: ");
		String name = sc.nextLine();
		System.out.println("Enter Gender of student: ");
		String gender = sc.nextLine();
		System.out.println("Enter Mobile number of student: ");
		String mobile = sc.nextLine();
		System.out.println("Enter Age of student: ");
		int age = sc.nextInt();
		Student obj1 = new Student(name , age , gender , mobile);
		System.out.println(obj1.toString());
	}

}
