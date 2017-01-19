package BelHard.HomeWork15;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

//https://www.tutorialspoint.com/guava/guava_multimap.htm
//Практически любой опытный Java разработчик сталкивался с необходимостью использовать структуры вроде Map<K, List<V>> или Map<K,Set<V>>, при этом приходилось писать много лишнего кода, для упрощения работы в библиотеку guava были введены Multimap, то есть коллекции, позволяющие просто работать со случаями когда
//один ключ и много значений у этого ключа. В отличии от конструкций вроде Map<K,Set<V>>, Multimap предоставляет ряд удобных функций для сокращения кода и упрощения алгоритмов.

public class GuavaTesterMultiMap
{
    public static void main(String args[])
    {

        GuavaTesterMultiMap tester = new GuavaTesterMultiMap();
        Multimap<String, String> multimap = tester.getMultimap();

        List<String> lowerList = (List<String>) multimap.get("lower");
        System.out.println("Initial lower case list");
        System.out.println(lowerList.toString());

        lowerList.add("f");
        System.out.println("Modified lower case list");
        System.out.println(lowerList.toString());

        List<String> upperList = (List<String>) multimap.get("upper");
        System.out.println("Initial upper case list");
        System.out.println(upperList.toString());

        upperList.remove("D");
        System.out.println("Modified upper case list");
        System.out.println(upperList.toString());

        Map<String, Collection<String>> map = multimap.asMap();
        System.out.println("Multimap as a map");

        for (Map.Entry<String, Collection<String>> entry : map.entrySet())
        {
            String key = entry.getKey();
            Collection<String> value = multimap.get("lower");
            System.out.println(key + ":" + value);
        }

        System.out.println("Keys of Multimap");
        Set<String> keys = multimap.keySet();

        for (String key : keys)
        {
            System.out.println(key);
        }

        System.out.println("Values of Multimap");
        Collection<String> values = multimap.values();
        System.out.println(values);
    }

    private Multimap<String, String> getMultimap()
    {

        //Map<String, List<String>>
        // lower -> a, b, c, d, e
        // upper -> A, B, C, D

        Multimap<String, String> multimap = ArrayListMultimap.create();

        multimap.put("lower", "a");
        multimap.put("lower", "b");
        multimap.put("lower", "c");
        multimap.put("lower", "d");
        multimap.put("lower", "e");

        multimap.put("upper", "A");
        multimap.put("upper", "B");
        multimap.put("upper", "C");
        multimap.put("upper", "D");

        return multimap;
    }
}