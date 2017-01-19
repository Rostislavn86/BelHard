package BelHard;
import com.sun.org.apache.xpath.internal.SourceTree;
import sun.java2d.cmm.lcms.LCMS;
import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class HomeWork1
{


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Нод Ровняется : " + getNod(x,y));
        System.out.println("Нок Ровняется : " + getNok(x,y));

    }

    static int getNod(int a, int b)
    {
        if (a % b == 0)
        {
            return b;
        }
        if (b % a == 0)
        {
            return a;
        }
        if (a > b) {
            return getNod(a%b,b);
        }
        return getNod(a,b%a);
    }

    private static int getNok(int a, int b)
    {
        return a*b/(getNod(a,b));
    }
}