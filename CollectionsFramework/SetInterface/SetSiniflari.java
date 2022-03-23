package CollectionsFramework.SetInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetSiniflari {
    public static void main(String[] args) {
        HashSet<String> harfler = new HashSet<>();
        harfler.add("a");
        harfler.add("d");
        harfler.add("c");
        harfler.add(null);
        harfler.add("d");
        harfler.add("d");
        harfler.add("e");
        harfler.add("2 ");
        System.out.println(harfler); //alfabetik sıra, en son rakamlar

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("a");
        linkedHashSet.add(null);
        linkedHashSet.add("d");
        linkedHashSet.add("c");
        linkedHashSet.add("d");
        linkedHashSet.add("d");
        linkedHashSet.add("e");
        linkedHashSet.add("2 ");
        System.out.println(linkedHashSet); //ekleme sırama göre çıktı verecek

        String[] geciciDizi = linkedHashSet.toArray(new String[0]);
        System.out.println(geciciDizi.toString());
        System.out.println(geciciDizi[0]);


        //TreeSet'te elemanlar Red/Black Tree veriyapısına göre sıralanır.
        //Bu veriyapısı aranan elemana ulaşmada çok avantajlıdır
        //Fakat, Set sınıfları arasında eleman yerleştirme-silme vb. gibi işlemleri yaparken en maliyetli olan da budur.
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("a");
        treeSet.add("1");
        treeSet.add("d");
        treeSet.add("c");
        //TreeSet'te elemanlar Red/Black Tree veriyapısına göre sıralanır. null değerler sıralanamayacağı için, null değer TreeSet'e atanamaz.
        //treeSet.add(null);
        treeSet.add("d");
        treeSet.add("d");
        treeSet.add("z");
        treeSet.add("e");
        treeSet.add("99");
        treeSet.add("2 ");
        System.out.println(treeSet); //karakter kodlarına göre a-z sıralama, rakamlar öncelikli

        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
