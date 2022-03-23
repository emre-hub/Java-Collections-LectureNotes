package CollectionsFramework.SetInterface;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Sorted_ve_Navigable_InterfacelerinMetodlari {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("4");
        treeSet.add("5");

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("1", 1);
        treeMap.put("2", 2);
        treeMap.put("4", 3);
        treeMap.put("5", 4);

                //SortedSet ve SortedMap metodları :
/*
        //comparator :
        System.out.println(treeMap.comparator());
        System.out.println(treeSet.comparator());

        //subSet - subMap
        TreeSet<String> yedekSet = (TreeSet<String>) treeSet.subSet("2", "4");
        System.out.println("subSet : " + yedekSet);
        System.out.println("subMap : " + treeMap.subMap("2", "4"));

        //headSet-tailSet / headMap-tailMap
        System.out.println(treeSet.headSet("2"));
        System.out.println(treeMap.headMap("3"));

        System.out.println(treeSet.tailSet("2"));
        System.out.println(treeMap.tailMap("3"));

        // first / firstKey - firstEntry
        // last / lastKey - lastEntry
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.lastEntry());

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
 */
                //NavigableSet ve NavigableMap metodları :
        //lower
        System.out.println(treeSet.lower("3"));
        System.out.println(treeMap.lowerKey("3"));

        //floor : verilen key değerine eşit veya (o değeri bulamazsa) ondan bir küçük değeri TreeSet'te bulur ve döndürür.
        System.out.println(treeSet.floor("6"));
        System.out.println(treeMap.floorKey("3"));

        //ceiling : verilen key değerine eşit veya (o değeri bulamazsa) ondan bir büyük değeri TreeSet'te bulur ve döndürür.
        System.out.println(treeSet.ceiling("6"));
        System.out.println(treeMap.ceilingKey("3"));

        //higher :
        System.out.println(treeSet.higher("2"));
        System.out.println(treeMap.higherKey("2"));
        System.out.println(treeMap.higherEntry("3"));

        // pollFirst - pollLast : ilk / son elemanı verir ve sonra setten çıkarır
        //System.out.println(treeSet.pollFirst());
        System.out.println(treeMap.pollFirstEntry());
        //System.out.println(treeSet.pollLast());
        System.out.println(treeMap.pollLastEntry());

        System.out.println(treeSet);
        System.out.println(treeMap);

        //Iterator : descending iterator
        System.out.println("\nDescending Iterator : ");
        Iterator<String> iterator = treeSet.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
