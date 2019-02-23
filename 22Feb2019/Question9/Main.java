package CollectionsAndDates.Question9;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/*Write a program to display times in different country format.*/
public class Main {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("today is "+ d1.toString());
        Locale newLocale=Locale.US;
        Locale newLocale1 = new Locale("it","ch");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, newLocale);
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, newLocale1);
        System.out.println(df1.format(d1));
        System.out.println(df.format(d1));

    }
}
