package Examples;

import java.util.Arrays;
import java.util.Scanner;

class IllegalCityName extends Exception{
	IllegalCityName(String str){
		super(str);
	}
}


public class DemonstrateThrow {
	
	static double findCityTemp(String cityName , Temprature[] arr) {
		
		for(int i = 0 ; i<arr.length ;i++) {
			String name = arr[i].placeName;
			if(cityName.equals(name)) {
				return arr[i].temp;
			}
		}
		
		return Integer.MIN_VALUE;
	}

	public static void main(String[] args) throws IllegalCityName {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Temprature arr [] = new Temprature[5];
		arr[0] = new Temprature("delhi" , 40);
		arr[1] = new Temprature("mumbai" , 35);
		arr[2] = new Temprature("nainital" , 24);
		arr[3] = new Temprature("bengaluru" , 28);
		arr[4] = new Temprature("hyderabad" , 30);
		
//		System.out.println("City present: ");
//		
//		for(var x : arr) {
//			System.out.println("City Name: " + x.placeName + " Temprature: "+x.temp);
//		}
		
		System.out.println("enter thr name of City: ");
		String cityName = sc.nextLine();
		
		double temp = findCityTemp(cityName , arr);
		if(temp == Integer.MIN_VALUE) {
			throw new IllegalCityName("City with name "+cityName+" does not exists");
		}
		 System.out.println("Temprature in "+cityName+" is :"+temp+" degree celcius.");
		 return ;
		
	}

}
