package CollectionsFramework.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListKullanimi {
    public static void main(String[] args) {
        LinkedList <Integer> sayilar = new LinkedList<>();
        ArrayList<Integer> sayilar2 = new ArrayList<>();

        long baslamaSuresi = System.currentTimeMillis();
        linkedListiHazirla(sayilar);
        long bitisSuresi = System.currentTimeMillis();
        System.out.println("LinkedList çalışma süresi : " + (bitisSuresi - baslamaSuresi));


        baslamaSuresi = System.currentTimeMillis();
        arrayListiHazirla(sayilar2);
        bitisSuresi = System.currentTimeMillis();
        System.out.println("ArrayList çalışma süresi : " + (bitisSuresi - baslamaSuresi));
    }

    public static void linkedListiHazirla(LinkedList<Integer> sayilar){
        for (int i = 0; i < 9000000; i++){
            int yeniEklenecekEleman = (int) (Math.random()*5000000);
            //siraliEkle(sayilar, yeniEklenecekEleman);
            sirasizEkle(sayilar, yeniEklenecekEleman);
        }
    }
    private static void arrayListiHazirla(ArrayList<Integer> sayilar2){
        for (int i = 0; i < 9000000; i++){
            int yeniEklenecekEleman = (int) (Math.random()*5000000);
            //siraliEkle(sayilar2, yeniEklenecekEleman);
            sirasizEkle(sayilar2, yeniEklenecekEleman);
        }
    }
     public static boolean siraliEkle(List<Integer> liste, int yeniEklenecekEleman){
        ListIterator<Integer> iterator = liste.listIterator();
        while(iterator.hasNext()){
            int karsilastirmaSonucu = iterator.next().compareTo(yeniEklenecekEleman);
            if(karsilastirmaSonucu == 0){
                iterator.add(yeniEklenecekEleman);
                return true;
            }else if(karsilastirmaSonucu > 0){
                iterator.previous();
                iterator.add(yeniEklenecekEleman);
                return true;
            }else{

            }
        }
        iterator.add(yeniEklenecekEleman);
        return true;
     }
     public static boolean sirasizEkle(List<Integer> liste, int yeniEklenecekEleman){
         liste.add(yeniEklenecekEleman);
         return true;
     }
}
