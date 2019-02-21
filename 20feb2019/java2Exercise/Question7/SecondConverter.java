package java2Exercise.Question7;

import java.util.Scanner;

public class SecondConverter
{
    int seconds;
    int days;
    int hours;
    int minutes;

    SecondConverter(int s)
    {
        seconds = s;
    }

    void convertSeconds()
    {
        days = seconds / 86400;

        int remainingSeconds = seconds % 86400;


        hours = remainingSeconds / 3600;

        remainingSeconds = remainingSeconds % 3600;



        minutes = remainingSeconds / 60;


        remainingSeconds = remainingSeconds % 60;

        seconds = remainingSeconds;
    }

    public static void main(String[] args)
    {
        final int seconds_input;
        System.out.println("Enter the seconds to convert\n\n");

        try {
            Scanner in = new Scanner(System.in);
            seconds_input= in.nextInt();

            if(seconds_input<0)
            {
                System.out.println("enter positive values or 0 ");
                System.exit(0);

            }

            SecondConverter converter = new SecondConverter(seconds_input);
            converter.convertSeconds();

            System.out.println(converter.days);
            System.out.println(converter.hours);
            System.out.println(converter.minutes);
            System.out.println(converter.seconds);

        }
        catch(Exception e)
        {
            System.out.println("not an int : "+e);
        }

    }
}


