package Examples;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionsExample {

	public static void ArithmaticException() {
		try {
            int a = 50, b = 0;
            int c = a/b;
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
	}
	
	public static void NullPointerException() {
		try {
            String str = null;
            System.out.println(str.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }
	}
	
	public static void StringOutOfBoundException() {
		 try {
	            String str = "String";
	            char c = str.charAt(24);
	            System.out.println(c);
	        }
	        catch(StringIndexOutOfBoundsException e) {
	            System.out.println("StringIndexOutOfBoundsException");
	        }
	}
	
	public static void fileNotFoundException() {
		 try {
	            File file = new File("C://file.txt");
	 
	            FileReader fr = new FileReader(file);
	        } catch (FileNotFoundException e) {
	           System.out.println("File does not exist");
	        }
	}
	
	public static void numberFormatException() {
		 try {
	            int num = Integer.parseInt ("apoorv") ;
	 
	            System.out.println(num);
	        } catch(NumberFormatException e) {
	            System.out.println("Number format exception");
	        }
	}
	
	public static void arrayIndexOutOfBoundException() {

        try{
            int a[] = new int[10];
            a[16] = 90;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
	}
	
	public static void  print(int a,int b)
    {
        System.out.println("Sum of Positive Integers :"+(a+b));
    }
	
	public static void NoSuchStateException() {
		int n1=70;
	    int n2=-23;
	    if(n1>=0 && n2>=0)
	     {
	        print(n1,n2);
	     }
	    else
	     {
	         throw new IllegalStateException("Either one or two numbers are not Positive Integer");
	     }
	 }
	
	 public static void print(int a)
	    {
	         if(a>=18){
	          System.out.println("Eligible for Voting");
	          }
	          else{
	    
	          throw new IllegalArgumentException("Not Eligible for Voting");
	                                    
	          }
	       
	    }
	 
	 public static void IllegalArgumentException() {
		  print(14);
	 }
	 
	 public static void IOException() {
		    Scanner scan = new Scanner("Hello");
		 
	        System.out.println("" + scan.nextLine());
	 
	        System.out.println("Exception: "+ scan.ioException());
	 
	        scan.close();
	 }
	 public static void classNotFoundException() {
		 try {
			 
	            Class.forName("a");
	        }
	        catch (ClassNotFoundException ex) {
	        	System.out.println("Class Not found exception");
	        }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmaticException();
		NullPointerException();
		StringOutOfBoundException();
		fileNotFoundException();
		numberFormatException();
		arrayIndexOutOfBoundException();
		NoSuchStateException();
		IOException();
		classNotFoundException();
	}

}
