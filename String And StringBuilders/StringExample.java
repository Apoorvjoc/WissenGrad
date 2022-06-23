import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		String str1 = "This is a string1";
		
		String str2 = "Apple" , str3 = "apple";
		
		String strNum = "123"; 
		String stringWithSpace = "  stringWithSpace  ";
		Integer num = 123456;
		
		//1)length()
		System.out.println("Length of string is-> "+str1.length());
		
		//2)charAt()
		System.out.println("Character at index 3 is-> "+str1.charAt(3));
		
		//3)toLowerCase()
		System.out.println("String in lower-Case-> "+str1.toLowerCase());
		
		//4)toUppercase()
		System.out.println("String in upper-Case-> "+str1.toUpperCase());
		
		//5)endsWith()
		System.out.println("String str1 ends with 1-> "+str1.endsWith("1"));
		System.out.println("String str1 ends with g-> "+str1.endsWith("g"));
		
		//6)compareToIgnoreCase()
		System.out.println("String str2 and str1 are same-> "+str2.compareToIgnoreCase(str3));
		
		//7)concat()
		System.out.println("String strNum concats with str1 gives-> "+strNum.concat(str1));
		
		//8)equals()
		System.out.println("Checking weather str2 and str3 are equals-> "+str3.equals(str2));
		
		//9)hashCode()
		System.out.println("HashCode of str1-> "+str1.hashCode());
		
		//10)indexOf()
		System.out.println("Index of 'is' in  str1 is -> "+str1.indexOf("is"));
		System.out.println("Index of 'h' in  str1 is -> "+str1.indexOf("h"));
		
		//11)replace()
		
		System.out.println("Replace string1 with string -> "+str1.replace("string1" , "String"));
		
		//12)replaceAll()
		System.out.println("Replace ' ' with , -> "+str1.replaceAll(" " , ","));
		
		//13replaceFirst()
		System.out.println("Replace First occurance ' ' with , -> "+str1.replaceFirst(" " , ","));
		
		//14trim()
		System.out.println("String before trim -> "+stringWithSpace);
		System.out.println("Trim method of -> "+stringWithSpace.trim());
		
		//15toCharArray()
		char charArr[] = new char[4];
		charArr = str2.toCharArray();
		System.out.println("To character array -> " + Arrays.toString(charArr));
		
		//16subString()
		System.out.println("Substring of str2 -> "+strNum.substring(0 , 2));
		
		//17toString();
		System.out.println("String conversion of integer -> "+num.toString());
		
		//18)subSequence()
		System.out.println("Subsequence: "+str2.subSequence(0, 4));
		
		//19)valueOf()
		System.out.println("Value of method: "+String.valueOf(str2));
		
		//20)split()
		String arr[] = new String[4];
		arr = str1.split(" ");
		System.out.println("Str2 split on the basis of ' ' space : "+Arrays.toString(arr));
		arr = str1.split("is");
		System.out.println("Str2 split on the basis of 'is' space : "+Arrays.toString(arr));
	}

}
