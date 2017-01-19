package BelHard.HomeWork6;
import java.io.ObjectInput;
import java.util.*;

/**
 * Created by user on 18.10.2016.
 */
public class HomeWork6
{
    public static void main(String[] args)
    {
        //Создём Массив
        int[][] matrixA;
        matrixA = new int[14][14];
        for (int i = 0; i < matrixA.length; i++)
        {
            for (int j = 0; j < matrixA.length; j++)
            {

                matrixA[i][j] = 0;

                if ( j + i > matrixA.length-1) matrixA[i][j] = 1;

                if ( i - j > 0)
                {
                    if (matrixA[i][j] == 1) matrixA[i][j] = 0;
                else
                    matrixA[i][j] = 1;
                }

                System.out.print( matrixA[i][j] + "\t");
            }

        }
      //  System.out.println(matrixA.length);


    }
}


