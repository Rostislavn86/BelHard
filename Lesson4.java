package BelHard;
import java.lang.*;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import static java.lang.Math.*;

/**
 * Created by user on 18.10.2016.
 */
public class Lesson4

{
    public static void main(String[] args)
    {
        Integer x = 1000;
        Integer y = 1000;
        int z = 1000;
        System.out.println(x==y);
        System.out.println(x==z);


      //  Immutable объект - это объект, состояние которого после создания невозможно изменить. В случае Java это значит что все поля
        //экземпляра у класс отмечены как final и являются примитивами или тоже immutable типами.


        class ImmutablePoint {
            private final int x;
            private final int y;
            private final String description;

            public ImmutablePoint(int x, int y, String description) {
                this.x = x;
                this.y = y;
                this.description = description;
            }

        }
    }


    }

