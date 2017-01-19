package BelHard.HomeWork5;
import java.lang.*;
/**
 * Created by user on 18.10.2016.
 */
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.*;



//написать метод, который разделит одно число на другое не используя оператор деления. предусмотреть все возможные ошибки
public class Delenie
{
    //49 / 7 = 49 * (7 ^ -1) Деление через умножение
    public static double del(double odno, double drugoe)
    {



        return odno*Math.pow(drugoe, -1);
    }

    public static void main(String[] args)
    {
        System.out.println(del(49,7));
    }
}
