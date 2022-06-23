import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)getInstance()
		  Calendar calObj = (Calendar) Calendar.getInstance();  
	      System.out.println("" + calObj.getTime());
	      
	      //2)add()
	      calObj.add((Calendar.YEAR), 10);  
	      calObj.add((Calendar.MONTH), 3);  
	      calObj.add((Calendar.DAY_OF_WEEK), 1);  
	      System.out.println("" + calObj.getTime());
	      
	      //3)after()
	      Calendar calObj1 = (Calendar) Calendar.getInstance();
	      calObj1.add((Calendar.YEAR), 8);
	      System.out.println("calObj is comparing with calObj1 using after method: "+calObj.after(calObj1));
	      
	      //4)before()
	      System.out.println("calObj is comparing with calObj1 using before method: "+calObj.before(calObj1));
	      
	      //5)Object clone()
	      Calendar calObj2 = (Calendar)calObj1.clone();
	      
	      //6)comparesTo()
	      if(calObj1.compareTo(calObj2) == 0)
	    	  System.out.println("Both objects are equal");
	      else
	    	  System.out.println("Both objects are unequal");
	      
	      //7)equals()
	      System.out.println("Comparing obj2 and obj1 "+calObj1.equals(calObj2));
	      
	      //8)get()
	      Calendar calObj3 = (Calendar) Calendar.getInstance();
	      System.out.println("Today is "+calObj3.get(Calendar.DATE) + " Month " + calObj3.get(Calendar.MONTH)  
	      + " and the year is: " + calObj3.get(Calendar.YEAR) );  
	      
	      //9)getActualMaximum()
	       Calendar cal1 = Calendar.getInstance();  
	       GregorianCalendar cal2 = (GregorianCalendar) GregorianCalendar.getInstance();  
	       // get the maximum value that year field can have   
	       System.out.println("Maximum year value of Calendar is:" + cal1.getActualMaximum(Calendar.YEAR));  
	       System.out.println("Maximum year value of Gregorian Calendar is :" + cal2.getActualMaximum(GregorianCalendar.YEAR));
	       
	       //10)getActualMinimum()
	       System.out.println("Maximum year value of Calendar is:" + cal1.getActualMinimum(Calendar.YEAR));  
	       System.out.println("Maximum year value of Gregorian Calendar is :" + cal2.getActualMinimum(GregorianCalendar.YEAR));
	       
	       //11)getCalendarType()
	       System.out.println("String format: "+cal1.getCalendarType());
	       
	       //12)getFirstDayOfWeek()
	       System.out.println("First day of week: "+calObj1.getFirstDayOfWeek());
	       
	       //13)setFirstDayOfWeek()
	       calObj1.setFirstDayOfWeek(Calendar.WEDNESDAY);
	       
	       System.out.println("First day of week: "+calObj1.getFirstDayOfWeek());
	       
	       //14)getMinimalDaysInFirstWeek()
	       System.out.println("Minimal Day in first week: "+ calObj1.getMinimalDaysInFirstWeek());
	       
	       //15)getTimeInMillis()
	       System.out.println("Time in milliseconds+: "+calObj1.getTimeInMillis());
	       
	       //16)getWeeksInWeekYear()
	       System.out.println("Weekends in a year: "+calObj1.getWeeksInWeekYear());
	       
	       //17) hashCode()
	       System.out.println("Hashcode: "+ calObj.hashCode());
	       
	       //18)isWeekDateSupported()
	       System.out.println("Week date supported: "+ calObj.isWeekDateSupported());
	       
	       //19)toString()
	       System.out.println("To string method: "+ calObj.toString());
	       
	       //20)isLenient()
	       System.out.println("isLenient function: "+ calObj.isLenient());
	}

}
