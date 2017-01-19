package BelHard.HomeWork15;

import java.util.Iterator;
import java.util.Set;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
/**
 * Created by user on 09.11.2016.
 */
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
//https://www.tutorialspoint.com/guava/guava_multiset.htm

    //Multiset
//Коллекция аналогичная Set, но позволяющая дополнительно считать количество добавлений элемента. Очень
//полезна для тех задач, когда нужно не только знать есть ли данный элемент в данном множестве, но и
  //      посчитать их количество (самый простой пример подсчет количества упоминаний тех или иных слов в
    //    каком-либо тексте). То есть данная коллекция более удобный вариант коллекции Map<T, Integer>, с методами специально предназначенными для подобных коллекций, позволяет очень сильно
     //   сократить количество лишнего кода в таких случаях.
public class GuavaTesterMultiSet
{

    public static void main(String args[]) {

        //create a multiset collection
        Multiset<String> multiset = HashMultiset.create();

        multiset.add("a");
        multiset.add("b");
        multiset.add("c");
        multiset.add("d");
        multiset.add("a");
        multiset.add("b");
        multiset.add("c");
        multiset.add("b");
        multiset.add("b");
        multiset.add("b");


        System.out.println("Количество элементов 'b' : "+multiset.count("b"));


        System.out.println("Общий Размер  : "+multiset.size());

        //get the distinct elements of the multiset as set
        Set<String> set = multiset.elementSet();

        //display the elements of the set ???
        System.out.println("Set [");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("]");

        //display all the elements of the multiset using iterator
        //вывести ве элементы мульти сет использую итератор
        Iterator<String> iterator  = multiset.iterator();
        System.out.println("MultiSet [");

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("]");

        //display the distinct elements of the multiset with their occurrence count
        //вывести количество элеменотов в мультисет
        System.out.println("MultiSet [");

        for (Multiset.Entry<String> entry : multiset.entrySet())
        {
            System.out.println("Element: " + entry.getElement() + ", Occurrence(s): " + entry.getCount());
        }
        System.out.println("]");

        //remove extra occurrences
        //Удалить лишние вхождения
        multiset.remove("b",2);

        //print the occurrence of an element
        //вывести количество элементов
        System.out.println("Occurence of 'b' : " + multiset.count("b"));
    }



}
