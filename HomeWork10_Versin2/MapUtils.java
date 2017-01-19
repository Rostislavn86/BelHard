//package BelHard.HomeWork10_Versin2;
//
///**
// * Created by user on 23.11.2016.
// */
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//
//public class MapUtils {
//    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<String, Integer>() {
//            private static final long serialVersionUID = 1L;
//            {
//                put("Foo", 1);
//                put("Bar", 2);
//                put("Baz", 3);
//            }
//        };
//
//        System.out.println(randEntryValue(map));
//    }
//
//    static <K, V> Entry<K, V> randEntry(Iterator<Entry<K, V>> it, int count) {
//        int index = (int) (Math.random() * count);
//
//        while (index > 0 && it.hasNext()) {
//            it.next();
//            index--;
//        }
//
//        return it.next();
//    }
//
//    static <K, V> Entry<K, V> randEntry(Set<Entry<K, V>> entries) {
//        return randEntry(entries.iterator(), entries.size());
//    }
//
//    static <K, V> Entry<K, V> randEntry(Map<K, V> map) {
//        return randEntry(map.entrySet());
//    }
//
//    static <K, V> K randEntryKey(Map<K, V> map) {
//        return randEntry(map).getKey();
//    }
//
//    static <K, V> V randEntryValue(Map<K, V> map) {
//        return randEntry(map).getValue();
//    }
//}
