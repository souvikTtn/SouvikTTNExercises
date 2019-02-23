package CollectionsAndDates.Question8;
/*Write a program to format date as example "21-March-2016"*/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat format =new SimpleDateFormat("dd-MM-YYYY");
        Calendar calendar=Calendar.getInstance();
        calendar.set(2016,3,27);
        //System.out.println(calendar);
        Date date=calendar.getTime();
       System.out.println(format.format(date));
    }
}
