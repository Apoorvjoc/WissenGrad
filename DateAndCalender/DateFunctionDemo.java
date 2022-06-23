import java.time.Instant;
import java.util.Date;

public class DateFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dateObj = new Date();
		
		System.out.println("Current date is : "+dateObj);
		
		  @SuppressWarnings("deprecation")
		Date dateObj1 =new Date(2022,5,21); 
		
		//1)after()
		System.out.println(dateObj+" is comparing with "+dateObj1 + " by date after "+ dateObj1.after(dateObj));
			
		//2)before()
		System.out.println(dateObj+" is comparing with "+dateObj1 + " by date before "+ dateObj1.before(dateObj));
		
		//3)clone() 
		Date cloneDate = (Date) dateObj.clone();
	    System.out.println("Clone of your Date 'd' : "+cloneDate);  
	    
	    //4)compare()
	    System.out.println("comparing date: "+dateObj+" with "+dateObj1+" "+ dateObj.compareTo(dateObj1));
	    
	    //5)equals()
	    System.out.println("comparing date: "+dateObj+" with "+dateObj1+" "+ dateObj.equals(dateObj1));
	    
	    //6)from()
	    Instant i= Instant.now(); 
	    System.out.println("date  : "+Date.from(i));  
		
	    //7)getTime()
	    System.out.println("Current number of milliseconds since January 1, 1970, 00:00:00 GTM : "+dateObj1.getTime());
	    
	    //8)hashCode()
	    System.out.println("Hash code of dateObj is : "+dateObj1.hashCode());
	    
	    //9)setTime(long time)
	    Date dateObj3 = new Date();
	    dateObj3.setTime(2050);
	    System.out.println("Changing current date to 2050 : " +dateObj3);
	    
	    //10) toString()
	    System.out.println("Changing date to string: "+dateObj1.toString());
	}

}
