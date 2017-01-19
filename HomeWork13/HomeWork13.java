package BelHard.HomeWork13;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

/**
 * Created by user on 01.11.2016.
 */

//
//провести исследование какая из коллекций выгоднее при операциях
//add add(index) set get remove. сравнить arraylist linkedlist hashset

public class HomeWork13
{
    public static void main(String[] args)
    {

        //Высчитываем время в Миллесекундах
        System.out.println("Time in Mils");
        System.out.println("Операция add____________________________________________________________");
        write("ArrayList add = ",getTimeAdd(filladd(new ArrayList<Object>())));
        write("LinkedList add = ",getTimeAdd(filladd(new LinkedList<Object>())));
        write("HashSet add = ",getTimeMsOfGethashadd(fillhashadd(new HashSet<>())));
        System.out.println("Вывод ArrayList и LinkedList работают практически одинаково HashSet немного отстаёт ");
        System.out.println("Операция add (index)____________________________________________________________");
        write("ArrayList add (index)= ",getTimeAddByIndex(filladd(new ArrayList<Object>())));
        write("LinkedList add (index)= ",getTimeAddByIndex(filladd(new LinkedList<Object>())));
        write("HashSet add (index)= ",getTimeMsOfGethashadd(fillhashadd(new HashSet<>())));
        System.out.println("Вывод Аналогично как и с add  ");
        System.out.println("Операция set____________________________________________________________");
        write("ArrayList set = ",getTimeGet(filladd(new ArrayList<Object>())));
        write("LinkedList set = ",getTimeGet(filladd(new LinkedList<Object>())));
        System.out.println("Для Hashset метода set не Сущ. !!!");
        System.out.println("Вывод LinkedList на много медленнее ArrayList");
        System.out.println("Операция get____________________________________________________________");
        write("ArrayList get = ",getTimeOfGet(filladd(new ArrayList<Object>())));
        write("LinkedList get = ",getTimeOfGet(filladd(new LinkedList<Object>())));
        System.out.println("Для Hashset метода get не Сущ. !!!");
        System.out.println("Вывод LinkedList медленнее ArrayList");
        System.out.println("Операция remove____________________________________________________________");
        write("ArrayList remove = ",getTimeRemove(filladd(new ArrayList<Object>())));
        write("LinkedList remove = ",getTimeRemove(filladd(new LinkedList<Object>())));
        write("HashSet remove = ",getTimeMsOfGet_hash_remove(fillhashadd(new HashSet<>())));
        System.out.println("Вывод ArrayList занчительно медленне LinkedList и HashSet");

    }

    public static void  write(String y,Object x)
    {
        System.out.println(y + x.toString());
    }

    // Добавляем значения add

    private static List<Object> filladd(List<Object> list)
    {

        list.add(new Object());

        return list;
    }

    // Добавляем значения add

    private static HashSet fillhashadd(HashSet hash)
    {

        hash.add(new Object());

        return hash;

    }

    // Добавляем значения add

    public static void get10000list(List<Object> list)
    {
        if (list.isEmpty()) return;
        int x = 0;

        for (int i = 0; i < 10000; i++)
        {
            list.add(x);
        }
    }

    // Добавляем значения index

    public static void get10000listindex(List<Object> list)
    {
        if (list.isEmpty()) return;
        int x = 0;
        int count = 1;
        for (int i = 0; i < 10000; i++)
        {
            list.add(count++, x);
        }
    }

    // Добавляем значения set

    public static void get10000listset(List<Object> list)
    {
        if (list.isEmpty()) return;
        int x = 0;
        int count = 1;
        for (int i = 0; i < 10000; i++)
        {
            list.add(count++, x);
        }
        // Закидываем Значения

        int count2 = 0;
        for (int i = 0; i < 10000; i++)
        {

            list.set(count2++, x);
        }
        //Обрабатывем значения

    }

    // Добавляем значения get

    public static void get10000listget(List<Object> list)
    {
        if (list.isEmpty()) return;
        int x = 0;
        int count = 1;
        for (int i = 0; i < 10000; i++)
        {
            list.add(count++, x);
        }
        // Закидываем Значения

        for (int i = 0; i < 10000; i++)
        {

            list.get(x);
        }
        //Обрабатывем значения

    }

    // Удаляем значения remove

    public static void get10000listremove(List<Object> list)
    {
        if (list.isEmpty()) return;
        int x = 0;
        int count = 1;
        for (int i = 0; i < 10000; i++)
        {
            list.add(count++, x);
        }


        for (int i = 0; i < 10000; i++)
        {
            list.remove(x);
        }
        //Обрабатывем значения

    }

    // Hash add

    public static void get1000hesh(HashSet hash)
    {
        if (hash.isEmpty()) return;
        int x = 0;

        for (int i = 0; i < 10000; i++)
        {
            hash.add(x);
        }

    }


//    {
//        System.out.println();
//    }

    // hash remove

    public static void get1000hesremove(HashSet hash)
    {
        if (hash.isEmpty()) return;
        int x = 0;
        for (int i = 0; i < 10000; i++)
        {
            hash.add(x);
        }
        for (int i = 0; i < 10000; i++)
        {
            hash.remove(x);
        }
    }

    // Замерить время метод add

    private static long getTimeAdd(List<Object> list)
    {


        Date currenttime = new Date();

        get10000list(list);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currenttime.getTime();

        return msDelay;


    }

    // Замерить время метод index

    private static long getTimeAddByIndex(List<Object> list)
    {


        Date currenttime = new Date();

        get10000listindex(list);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currenttime.getTime();

        return msDelay;

    }

    // Замерить время метод set

    private static long getTimeGet(List<Object> list)
    {


        Date currenttime = new Date();

        get10000listset(list);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currenttime.getTime();

        return msDelay;

    }

    // Замерить время метод get

    private static long getTimeOfGet(List<Object> list)
    {

        Date currenttime = new Date();

        get10000listget(list);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currenttime.getTime();

        return msDelay;

    }

    // Замерить время метод remove

    private static long getTimeRemove(List<Object> list)
    {


        Date currenttime = new Date();

        get10000listremove(list);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currenttime.getTime();

        return msDelay;

    }

    // Замерить время метод hash add

    private static long getTimeMsOfGethashadd(HashSet hash)
    {


        Date currenttime = new Date();

        get1000hesh(hash);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currenttime.getTime();

        return msDelay;

    }

    // Замерить время метод hash remove

    private static long getTimeMsOfGet_hash_remove(HashSet hash)
    {


        Date currenttime = new Date();

        get1000hesremove(hash);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currenttime.getTime();

        return msDelay;

    }

}
