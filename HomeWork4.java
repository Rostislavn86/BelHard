package BelHard;

import java.net.SocketTimeoutException;
import java.util.*;
import java.io.*;

/**
 * Created by user on 13.10.2016.
 */

//https://habrahabr.ru/post/183462/

public class HomeWork4
{
    public static void main(String[] args)
    {
        int x = 5, y = 7;
        // xor
        x = x ^ y; // x == 2
        y = x ^ y; // y == 5
        x = x ^ y; // x == 7
        System.out.println("XOR");
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);

        //доп переменна
        int a = 3, b = 5, buf;
        buf = a;
        a = b;
        b = buf;
        System.out.println("Dop Peremennaia");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        //Оператор сдвига
        System.out.println("Operator Sdviga");
        int a1 = 3, b1 = 5;
        a1 = a1 >> 1;
        b1 = b1 << 1;

        System.out.println(" a1 = " + a1);
        System.out.println(" b1 = " + a1);


//////
    }


}
