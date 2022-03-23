package CollectionsFramework.ListInterface;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListKullanimi {
    public static void main(String[] args) {
        //bellekte 10(varsayılan) eleman tutan bir ArrayList
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);

        //kapasitesini başta belirlediğim bir ArrayList  :
        ArrayList<String> isimler = new ArrayList<>(20);
        isimler.add("Emre");
        isimler.add("Hüseyin");

        //ArrayListi verilen sayı kadar eleman tutacak şekilde arttırır :
        //defalarca ArrayList'i genişletmektense, bu yöntem daha performanslı olacaktır.
        isimler.ensureCapacity(100);


        //ArrayListi sadece içindeki elemanları tutacak kadar küçültür, elemanlarıyla beraber liste fullenir
        isimler.trimToSize();


        //ArrayList oluşturulurken içine başka bir ArrayList atılabilir :
        ArrayList<String> isimlerYedek = new ArrayList<>(isimler);


        System.out.println(isimlerYedek.size());
        System.out.println(isimlerYedek.contains("Emre"));
        System.out.println(isimlerYedek.contains("Ali"));
        System.out.println(isimler.contains("Emre"));

        //ArrayList'i diziye dönüştürmek  :
        String[] isimlerDizisi =  isimler.toArray(new String[0]);
        System.out.println(isimlerDizisi[1]);

        //Belirli indisteki elemanı okumak :
        System.out.println(isimler.get(0));
        //Belirli indisteki elemanı güncellemek :
        isimler.set(0, "yeni Emre");
        System.out.println(isimler.get(0));
        //Belirli bir indise eleman yerleştirmek :
        isimler.add(2, "hayriye");
        System.out.println(isimler);
        //Belirli bir indisteki elemanı silmek
        isimler.remove("hayriye");
        isimler.remove(1);
        System.out.println(isimler);
        isimler.add("kemal");
        isimler.add("ayşe");
        isimler.add("memet");
        //Belirli indexler arasındaki elemanları yeni bir listeye atmak :
        List<String> yeniIsimlerListesi = isimler.subList(1,4);
        System.out.println(yeniIsimlerListesi);

        ArrayList<String> erkekIsimleri = new ArrayList<>();
        erkekIsimleri.add("emre");
        erkekIsimleri.add("ali");
        ArrayList<String> kadinIsimleri = new ArrayList<>();
        kadinIsimleri.add("suzan");
        kadinIsimleri.add("ceren");
        //iki listeyi birleştirmek, belirli bir indexten sonra birleşirmek
        erkekIsimleri.addAll(kadinIsimleri);
        System.out.println(erkekIsimleri);
        erkekIsimleri.addAll(0,kadinIsimleri);
        System.out.println(erkekIsimleri);

        //arrayi listeye dönüştürmek :
        String[] sehirler = {"Ankara", "Istanbul", "Izmir"};
        List<String> sehirlerListe;
        sehirlerListe = Arrays.asList(sehirler);

        System.out.println(sehirlerListe);

        ArrayList<String> sehirler2 = new ArrayList<>(Arrays.asList(sehirler));
        System.out.println(sehirler2);

        List<String> sehirler3 = new ArrayList<>();
        Collections.addAll(sehirler3, sehirler);
        System.out.println(sehirler3);

    }
}
