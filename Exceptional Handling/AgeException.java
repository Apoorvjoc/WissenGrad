package Examples;

import java.util.Scanner;

class IllegalAgeException extends Exception{
	IllegalAgeException(String str){
		super(str);
	}
}

public class AgeException {

	 public static void CheckAge(int age) 
	    {
		 	try {
		 		if(age>=18){
			          System.out.println("Eligible for Voting");
			          }
			          else{
			    
			          throw new IllegalAgeException("Not Eligible for Voting");
			                                    
			          }
		 	}catch(IllegalAgeException e) {
		 		System.out.println("Exception: "+e);
		 	}
	    }
	 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter your age: ");
		 Scanner sc = new Scanner(System.in);
		 int age = sc.nextInt();
	 	 CheckAge(age);	 
	}

}
