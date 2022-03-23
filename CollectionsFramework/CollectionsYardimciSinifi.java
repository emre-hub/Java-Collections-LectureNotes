package CollectionsFramework;

import Exceptions.Stu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsYardimciSinifi {
    public static void main(String[] args) {
        Studnt studnt1 = new Studnt(1, "abdullah");
        Studnt studnt2 = new Studnt(9, "sinem");
        Studnt studnt3 = new Studnt(5, "ezgi");

        ArrayList<Studnt> ogrenciler = new ArrayList<>();
        ogrenciler.add(studnt1);
        ogrenciler.add(studnt2);
        ogrenciler.add(studnt3);

        //Collections.max() , Collections.min()
        Studnt enBuyukOgrenci = Collections.max(ogrenciler, new Comparator<Studnt>() {
            @Override
            public int compare(Studnt o1, Studnt o2) {
                if(o1.isim.compareTo(o2.isim) < 0)
                    return -1;
                else if(o1.isim.compareTo(o2.isim) > 0)
                    return 1;
                else
                    return 0;
            }
        });
        System.out.println("Max ogrenci : " + enBuyukOgrenci);


        Studnt enKucukOgrenci = Collections.min(ogrenciler);
        System.out.println("Min ogrenci : " + enKucukOgrenci);

        //sort
        System.out.println("Sıralamadan önce : " + ogrenciler);
        Collections.sort(ogrenciler, new Comparator<Studnt>() {
            @Override
            public int compare(Studnt o1, Studnt o2) {
                if(o1.id < o2.id)
                    return 1;
                else if(o1.id > o2.id)
                    return -1;
                else
                    return 0;
            }
        });
        System.out.println("Sıralamadan sonra : " + ogrenciler);

        //reverse
        Collections.reverse(ogrenciler);
        System.out.println("Ters sırada öğrenciler : " + ogrenciler);
        //shuffle
        Collections.shuffle(ogrenciler);
        System.out.println("Karıştırıldıktan sonra : " + ogrenciler);

        //binarysearch için elemanların sıralı olması gerekir.
        //int sonuc = Collections.binarySearch(ogrenciler, studnt1);
        //System.out.println("Sonuç : " + sonuc);



    }
}
class Studnt implements Comparable<Studnt>{
    int id;
    String isim;

    public Studnt(int id, String isim){
        this.id = id;
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Studnt{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                '}';
    }

    @Override
    public int compareTo(Studnt o) {
        if(this.isim.compareTo(o.isim) < 0  ){
            return -1;
        }else if(this.isim.compareTo(o.isim) > 0){
            return 1;
        }else
            return 0;
    }
}
