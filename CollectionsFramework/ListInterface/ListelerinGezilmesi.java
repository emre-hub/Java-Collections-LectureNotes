package CollectionsFramework.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListelerinGezilmesi {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(1);
        sayilar1.add(2);
        sayilar1.add(3);
        sayilar1.add(4);

        ArrayList<Integer> sayilar2 = new ArrayList<>();
        sayilar2.add(3);
        sayilar2.add(4);
        sayilar2.add(6);
        sayilar2.add(7);

        System.out.println(sayilar1);
        //For Döngüsüyle Gezmek
        System.out.println("sayilar1 for dongusu ile : ");
        for(int i = 0; i < sayilar1.size(); i++)
            System.out.println(sayilar1.get(i));
        //foreach
        System.out.println("sayilar1 foreach : ");
        for(int i : sayilar1)
            System.out.println(i);
/*
        System.out.println("sayilar1 ve sayilar2'de ortak olan elemanlar sayilar1'den çıkarılsın : ");
        for(int i = 0; i < sayilar1.size(); i++){
            if(sayilar2.contains(sayilar1.get(i))){
                sayilar1.remove(i);
            }
        }
        System.out.println("Çıkarma işleminden sonra sayilar1 : " + sayilar1);*/

        //Iterator kullanarak :
        System.out.println("\nIterator ile sayilar2 listesinin gezilmesi : ");
        Iterator<Integer> iterator = sayilar2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("ListIterator ile listeyi gezmek :");//ArrayList, LinkedList vb. kullanırken bu yapıyı kullanmak daha mantıkldıır.
        ListIterator<Integer> listIterator = sayilar2.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("ListIterator ile listeyi sondan başa gezmek : ");
        //sayilar2.size() = 4, Iterator'a başlangıç parametresi olarak son indexi verdigim icin, sondan başa sıralama yapabilirim :
        ListIterator<Integer> listIteratorSondanBasa = sayilar2.listIterator(sayilar2.size());
        while(listIteratorSondanBasa.hasPrevious()){
            System.out.println("Index : " + listIteratorSondanBasa.previousIndex() + " ;  element : " + listIteratorSondanBasa.previous());
        }

    }
}
