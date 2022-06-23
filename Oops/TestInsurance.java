package objectOrienrtedProg;

import java.util.Scanner;

public class TestInsurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter policy holder name");
		String name = sc.nextLine();
		System.out.println("Enter policy number");
		int policyNumber = sc.nextInt();
		System.out.println("Enter monthly premium");
		double monthlyPremium = sc.nextDouble();
		System.out.println("Enter age");
		int age = sc.nextInt();
		Insurance obj = new Insurance(policyNumber , monthlyPremium , name , age);
		System.out.println(obj);
	}

}
