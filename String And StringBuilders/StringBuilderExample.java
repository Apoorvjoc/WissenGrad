import java.util.Arrays;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str1 = new StringBuilder("This is String Builder");
		StringBuilder strNum = new StringBuilder("12");
		StringBuilder str2 = new StringBuilder("apple");
		StringBuilder str3 = new StringBuilder("apple");
		StringBuilder str4 = new StringBuilder("String 4 ");

		//1)length()
		System.out.println("Length of string is-> "+str1.length());
		
		//2)charAt()
		System.out.println("Character at index 3 is-> "+str1.charAt(3));
		
		//3)Append()
		System.out.println("String is Appending -> "+str4.append("Apoorv"));
		
		//4Delete
		System.out.println("String is Deleting -> "+str4.delete(7 , 12));
		
		//5)capacity()
		System.out.println("Capacity of Str1 -> "+str1.capacity());
		System.out.println("Capacity of Str2 -> "+str2.capacity());
		System.out.println("Capacity of Str3 -> "+str3.capacity());
		System.out.println("Capacity of Str4 -> "+str4.capacity());
		
		//6)lastIndexOf()
		System.out.println("Last index of s in Str1 -> "+ str1.lastIndexOf("s"));
		
		//7)replace()
		System.out.println("String strNum replaces with 15 gives-> "+strNum.replace(0 , 1 , "15"));
		
		//8)equals()
		System.out.println("Checking weather str2 and str3 are equals-> "+str3.equals(str2));
		
		//9)hashCode()
		System.out.println("HashCode of str1-> "+str1.hashCode());
		
		//10)indexOf()
		System.out.println("Index of 'is' in  str1 is -> "+str1.indexOf("is"));
		System.out.println("Index of 'h' in  str1 is -> "+str1.indexOf("h"));
		
		//11)reverse()		
		System.out.println("Str4 reversed:  -> "+str4.reverse());
		str4.reverse();
		
		//12)setCharAt()
		str4.setCharAt(0 , 'S');
		System.out.println("Set char at: "+str4);
		
		//13)toString()
		System.out.println("Converting str4 to string -> "+str4.toString());
		
		//14codePointAt(int index)
		System.out.println("Unicode of str1 at index 2 -> "+str1.codePointAt(2));
		
		//15)codePointBefore(int index)
		System.out.println("Unicode of str1 before index 2 -> " + str1.codePointBefore(2));
		
		//16subString()
		System.out.println("Substring of str2 -> "+strNum.substring(0 , 2));
		
		//17)codePointCount();
		System.out.println("String str1 code point count -> "+str1.codePointCount(0 , 3));
		
		//18)subSequence()
		System.out.println("Subsequence: "+str2.subSequence(0, 4));
		
		//19)valueOf()
		System.out.println("Value of method: "+String.valueOf(str2));
		
		//20)trimToSize()
		System.out.println("Capacity of str1 before trim: " + str1.capacity());
		str1.trimToSize();
		System.out.println("Capacity of str1 after trim: " + str1.capacity());
	}

}
