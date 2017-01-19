package BelHard.HomeWork14;


import java.util.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by user on 01.11.2016.
 */

//есть некоторое количество спортсменов. сделать класс, который сможет возвращать спортсменов
// отсортированных по количеству общего колва медалей, по количеству золотых, по возрасту. с помошью treeset
//http://www.java2novice.com/java-collections-and-util/treeset/comparator-object/
//Вопросы
//

public class HomeWork14
{


    public static void main(String[] args)
    {
        // Сортировка по имени
        class MyNameComp implements Comparator<Sportsmen>
        {

            @Override
            public int compare(Sportsmen e1, Sportsmen e2)
            {
                return e1.getName().compareTo(e2.getName());
            }
        }

        class MyMedCount implements Comparator<Sportsmen>
        {

            @Override
            public int compare(Sportsmen e1, Sportsmen e2)
            {

                if (e1.getCountMed() > e2.getCountMed())
                {
                    return 1;
                } else
                {
                    return -1;
                }

            }
        }

        class MyGoldMedCount implements Comparator<Sportsmen>
        {

            @Override
            public int compare(Sportsmen e1, Sportsmen e2)
            {

                if (e1.getCountGold() > e2.getCountGold())
                {
                    return 1;
                } else
                {
                    return -1;
                }
            }
        }

        class MyAgeCount implements Comparator<Sportsmen>
        {

            @Override
            public int compare(Sportsmen e1, Sportsmen e2)
            {

                if (e1.getAge() > e2.getAge())
                {
                    return 1;
                } else
                {
                    return -1;
                }
            }
        }
///////////////////////////////////////////////////////////////
        TreeSet<Sportsmen> setSportsmen = new TreeSet<Sportsmen>(new MyNameComp());
        setSportsmen.add(new Sportsmen("Илья", 2, 3, 44));
        setSportsmen.add(new Sportsmen("Иван", 1, 3, 24));
        setSportsmen.add(new Sportsmen("Антон", 4, 1, 18));
        setSportsmen.add(new Sportsmen("Руслан", 6, 1, 48));
        setSportsmen.add(new Sportsmen("Авель", 1, 1, 16));
        //Вывод сортировки по Имени
        System.out.println("Сортировка по имени");
        for (Sportsmen e : setSportsmen)
        {
            System.out.println(e);
        }
        System.out.println("===========================================================================");

        System.out.println("Сортировка по Количеству медалей");
        TreeSet<Sportsmen> setSportsmen2 = new TreeSet<Sportsmen>(new MyMedCount());
        setSportsmen2.addAll(setSportsmen);
        for (Sportsmen e2 : setSportsmen2)
        {
            System.out.println(e2);
        }
        System.out.println("===========================================================================");
        System.out.println("Сортировка по Количеству золотых медалей");
        TreeSet<Sportsmen> setSportsmen3 = new TreeSet<Sportsmen>(new MyGoldMedCount());
        setSportsmen3.addAll(setSportsmen);
        for (Sportsmen e3 : setSportsmen3)
        {
            System.out.println(e3);
        }
        System.out.println("===========================================================================");
        System.out.println("Сортировка по возрасту");
        TreeSet<Sportsmen> setSportsmen4 = new TreeSet<Sportsmen>(new MyAgeCount());
        setSportsmen4.addAll(setSportsmen);
        for (Sportsmen e4 : setSportsmen4)
        {
            System.out.println(e4);
        }

    }

}



