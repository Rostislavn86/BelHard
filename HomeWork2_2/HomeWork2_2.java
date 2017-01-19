package BelHard.HomeWork2_2;

import java.util.*;

/**
 * Created by user on 23.10.2016.
 */
public class HomeWork2_2
{
    public static void main(String[] args)
    {
        Date date = new Date();

        System.out.println(date.toString());

        System.out.println(date.getTime());//long getTime() - возвращает количество миллисекунд, прошедших с полуночи 1 января 1970 года

        long l;

        l = date.getTime();

        System.out.println(date.getTime());

    }


}
