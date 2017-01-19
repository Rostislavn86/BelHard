package BelHard.HomeWork2;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by user on 13.10.2016.
 */


//
//        сделать класс, помогающий работать с датами. В классе должно быть свойство date (long) и сеттер к нему.
//
//        В date хранится количество миллисекунд. В классе должны быть методы: getDate() - который вернет дату
//
//        в виде "7 апрель 1987" по количеству миллисекунд, прошедших с 1 января 1970 года 00:00
//
//        а также метод getTime() который вернет текущее время ("07:24")

public class Date
{


    public static void main(String[] args)
    {

        String date = getDate();
        String time = getTime();
        System.out.println(date);
        System.out.println(time);

    }
    private static String getDate()
    {

        Calendar calendarFinalDate = new GregorianCalendar(1987,05,7);
        long x = calendarFinalDate.getTimeInMillis();

        Calendar calendarStartDate = new GregorianCalendar(1970,01,01);
        long y = calendarStartDate.getTimeInMillis();

        long z = x-y;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(z);

        int mYear = calendar.get(Calendar.YEAR);
        int mMonth = calendar.get(Calendar.MONTH);
        int mDay = calendar.get(Calendar.DAY_OF_MONTH);


        return mYear + " год " + mMonth + " месяц "+ mDay + " день" ;


    }

    private static String getTime()
    {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat time = new SimpleDateFormat("HH:mm");
        String t2 = time.format(cal.getTime());
        return t2;
    }



}






