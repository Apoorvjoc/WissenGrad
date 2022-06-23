package training;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class SimpleDateFormatClass {
    public static void main(String[] args) {
 
        Date dt = new Date();
        SimpleDateFormat sdf;
 
        System.out.println("Simple Date Format: dd/MM/YY");
        sdf = new SimpleDateFormat("dd/MM/YY");
        System.out.println(sdf.format(dt));
       
        System.out.println("\nSimple Date Format: dd/MM/YYYY");
        sdf = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println(sdf.format(dt));
 
        System.out.println("\nSimple Date Format: d-MMM-y");
        sdf = new SimpleDateFormat("d.MMM.y");
        System.out.println(sdf.format(dt));
 
        System.out.println("\nSimple Date Format: d-MMMM-y");
        sdf = new SimpleDateFormat("d-MMMM-y");
        System.out.println(sdf.format(dt));
       
        System.out.println("\nSimple Date Format: yyyy-MM-dd");
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(dt));
       
        System.out.println("\nSimple Date Format: yyyy-MM-dd HH:mm:ss.SSS");
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println(sdf.format(dt));
       
        System.out.println("\nSimple Date Format: yyyy-MM-dd HH:mm:ss.SSSZ  ");
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ");
        System.out.println(sdf.format(dt));
       
        System.out.println("\nSimple Date Format: EEEEE MMMMM yyyy HH:mm:ss.SSSZ");
        sdf = new SimpleDateFormat("EEEEE MMMMM yyyy HH:mm:ss.SSSZ  ");
        System.out.println(sdf.format(dt));
       
        System.out.println("\nSimple Date Format: dd / MM / yyyy HH:mm Z");
        sdf = new SimpleDateFormat("dd / MM / yyyy HH:mm Z");
        System.out.println(sdf.format(dt));
       
        System.out.println("\nSimple Date Format: YYYY-'W'ww-u");
        sdf = new SimpleDateFormat("YYYY-'W'ww-u");
        System.out.println(sdf.format(dt));
       
        System.out.println("\nSimple Date Format: yyyy-MM-dd 'T'HH:mm:ss.SSSZ");
        sdf = new SimpleDateFormat("yyyy-MM-dd 'T'HH:mm:ss.SSSZ");
        System.out.println(sdf.format(dt));
       
        System.out.println("\nSimple Date Format: EEE, d MMM yyyy HH:mm:ss Z");
        sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        System.out.println(sdf.format(dt));
       
        System.out.println("\nSimple Date Format: K:mm a, z");
        sdf = new SimpleDateFormat("K:mm a, z");
        System.out.println(sdf.format(dt));
       
        System.out.println("\nSimple Date Format: h:mm:s a");
        sdf = new SimpleDateFormat("h:mm:s a");
        System.out.println(sdf.format(dt));
       
        System.out.println("\nSimple Date Format: h:mm:s a");
        sdf = new SimpleDateFormat("k:mm:s");
        System.out.println(sdf.format(dt));
       
 
        System.out.println("\nSimple Date Format: yyyy.MM.dd G 'T'HH:mm:ss z");
        sdf = new SimpleDateFormat("yyyy.MM.dd G 'T'HH:mm:ss z");
        System.out.println(sdf.format(dt));
       
 
        System.out.println("\nSimple Date Format: yyyy-MM-dd 'T'HH:mm:ss.SSSXXX");
        sdf = new SimpleDateFormat("yyyy-MM-dd 'T'HH:mm:ss.SSSXXX");
        System.out.println(sdf.format(dt));
 
        System.out.println("\nSimple Date Format: yyyyy.MMMMM.dd GGG hh:mm aaa");
        sdf = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        System.out.println(sdf.format(dt));
       
 
        System.out.println("\nSimple Date Format: hh 'o''clock' a, zzzz");
        sdf = new SimpleDateFormat("hh 'o''clock' a, zzzz");
        System.out.println(sdf.format(dt));
       
        System.out.println("\nSimple Date Format: EEE, MMM d, ''yy");
        sdf = new SimpleDateFormat("EEE, MMM d, ''yy");
        System.out.println(sdf.format(dt));
       
        System.out.println("\nSimple Date Format: G (era)");
        sdf = new SimpleDateFormat("G");
        System.out.println(sdf.format(dt));
       
        System.out.println("\nSimple Date Format: d (day in month)");
        sdf = new SimpleDateFormat("d");
        System.out.println(sdf.format(dt));
 
        System.out.println("\nSimple Date Format: D (day in year)");
        sdf = new SimpleDateFormat("D");
        System.out.println(sdf.format(dt));
 
        System.out.println("\nSimple Date Format: W (week in month)");
        sdf = new SimpleDateFormat("W");
        System.out.println(sdf.format(dt));
       
        System.out.println("\nSimple Date Format: w (week in year)");
        sdf = new SimpleDateFormat("w");
        System.out.println(sdf.format(dt));
 
        System.out.println("\nSimple Date Format: E (day name in week)");
        sdf = new SimpleDateFormat("E");
        System.out.println(sdf.format(dt));
       
        System.out.println("\nSimple Date Format: u (day number of week)");
        sdf = new SimpleDateFormat("u");
        System.out.println(sdf.format(dt));
 
    }
}

