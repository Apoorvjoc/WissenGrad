package Examples;

import java.util.Scanner;

public class FinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Inside Try");
		} catch (Exception e) {
			System.out.println("Exception is"+e);
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				System.out.println("Before scanner close scanner is : "+scanner);
				scanner.close();
			}
		}
		System.out.println("Before exiting main");
	}
}
