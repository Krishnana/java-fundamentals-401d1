import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// The class name mucst be capitalized and the same as file name
public class Basics{
    // running a file in Java means running the main method
    // the main method always look exactly like this
    public static void main(String[] args) {
        System.out.println("Hello and good morning");
        int i = 1;
        float j = 1;
        String x, y = null;

         x = ((Object)i).getClass().getSimpleName();
        if((Object)j instanceof Float){y = "float";}
        if((Object)i instanceof String){x = "String";}

        System.out.println("x:" + x) ;
        System.out.println("y:" + y) ;
        if(isGingerCold()){
            System.out.println("Get ginger a sweater");
        } else {
            System.out.println("Ginger does not need a sweater");
        };
    }

    // writing a method
    // for now they always start with public static
    // they return something (the type)
    // followed by name of the method 
    // public status Type nameOfMethid(){}
    public static boolean isGingerCold() {
        // check the current month
        // ginger is cold in Nov, Dec, Jan and Feb
        Calendar calendar = Calendar.getInstance();
        String currentMonth = new SimpleDateFormat("MMM").format(calendar.getTime());

        if (currentMonth.equals("Nov") || currentMonth.equals("Dec") || currentMonth.equals("Jan")|| currentMonth.equals("Feb")) 
        {
            return true;
        } else {
            return false;
        }
    }
}