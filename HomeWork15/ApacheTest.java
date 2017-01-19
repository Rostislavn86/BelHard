package BelHard.HomeWork15;
import java.util.*;

import com.google.common.collect.HashBiMap;
import com.google.common.collect.Multimap;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.Trie;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bidimap.TreeBidiMap;
import org.apache.commons.collections4.map.LinkedMap;

/**
 * Created by user on 08.11.2016.
 */

//file:///D:/Java_Belhard/Шпаргалка%20Java%20программиста%203.%20Коллекции%20в%20Java%20(стандартные,%20guava,%20apache,%20trove,%20gs-collections%20и%20другие)%20_%20Блог%20компании%20Luxoft%20_%20Хабрахабр.html
//продемонстрировать работу 3 коллекций из  gyava и 3 из apache commons collections. сделать комментарии для чего они нужны

public class ApacheTest
{
    public static void main(String[] args)
    {
//        TreeMap<String, Integer> users = new TreeMap<String, Integer>();
//        users.put("Bob", 1);
//        users.put("Alice", 2);
//        users.put("John", 3);
//
//        for (String key: users.keySet()) {
//            System.out.println(key + " (ID = "+ users.get(key) + ")");
//        }

        //OrderedMap Позволяет создавать Map'ы, упорядоченные по порядку добавления, но не использующие сортировку

        OrderedMap map = new LinkedMap();
        map.put("FIVE", "5");
        map.put("SIX", "6");
        map.put("SEVEN", "7");
        System.out.println(map.firstKey());// returns "FIVE"
        System.out.println(map.nextKey("FIVE"));// returns "SIX"
        System.out.println(map.nextKey("SIX"));// returns "SEVEN"

        //Bags Аналог Multiset из Guava, то есть возможность сохранять количество элементов каждого типа

        Bag bag = new HashBag();
        System.out.println(bag.add("ONE", 6)); // add 6 copies of "ONE"
        System.out.println(bag.remove("ONE", 2)); // removes 2 copies of "ONE"
        System.out.println(bag.getCount("ONE")); // returns 4, the number of copies in the bag (6 - 2)

        //подсчет кол-ва любых объектов

        //Аналог BiMap из Guava, то есть возможность получать значение по ключу, так и ключ по значению
        //Ну и Можно менять эти значения местами

        BidiMap bidi = new TreeBidiMap();
        bidi.put("SIX", "6");
        bidi.get("SIX");  // returns "6"
        bidi.getKey("6");  // returns "SIX"
        //bidi.removeValue("6");  // removes the mapping
        BidiMap inverse = bidi.inverseBidiMap();  // returns a map with keys and values swapped
        System.out.println(inverse);


        



}
}
