//package BelHard.HomeWork10_Versin2;
//
///**
// * Created by user on 23.11.2016.
// */
//
//
//        import java.util.ArrayList;
//        import java.util.Collection;
//        import java.util.Collections;
//        import java.util.HashMap;
//        import java.util.Iterator;
//        import java.util.List;
//        import java.util.Map;
//        import java.util.TreeMap;
//
//public class Main2 {
//    public static void main(String[] args) {
//        Map hashMap = makeHashMap();
//        // you can make any Map random by making them a RandomMap
//        // better if you can just create the Map as a RandomMap instead of HashMap
//        Map randomMap = new RandomMap(hashMap);
//
//        // just call values() and iterate through them, they will be random
//        Iterator iter = randomMap.values().iterator();
//
//        while (iter.hasNext()) {
//            String value = (String) iter.next();
//            System.out.println(value);
//        }
//    }
//
//    private static Map makeHashMap() {
//        Map retVal;
//
//        // HashMap is not ordered, and not exactly random (read the javadocs)
//        retVal = new HashMap();
//
//        // TreeMap sorts your map based on Comparable of keys
//        retVal = new TreeMap();
//
//        // RandomMap - a map that returns stuff randomly
//        // use this, don't have to create RandomMap after function returns
//        // retVal = new HashMap();
//
//        for (int i = 0; i < 20; i++) {
//            retVal.put("key" + i, "value" + i);
//        }
//
//        return retVal;
//    }
//}
//
///**
// * An implementation of Map that shuffles the Collection returned by values().
// * Similar approach can be applied to its entrySet() and keySet() methods.
// */
//class RandomMap extends HashMap {
//    public RandomMap() {
//        super();
//    }
//
//    public RandomMap(Map map) {
//        super(map);
//    }
//
//    /**
//     * Randomize the values on every call to values()
//     *
//     * @return randomized Collection
//     */
//    @Override
//    public Collection values() {
//        List randomList = new ArrayList(super.values());
//        Collections.shuffle(randomList);
//
//        return randomList;
//    }
//
//}