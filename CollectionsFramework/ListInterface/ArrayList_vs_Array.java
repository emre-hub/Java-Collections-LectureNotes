package CollectionsFramework.ListInterface;

import java.util.ArrayList;

public class ArrayList_vs_Array {
    public static void main(String[] args) {
        String[] isimlerDizisi = new String[9000000];
        ArrayList<String> isimlerListesi = new ArrayList<>(9000000);

        long baslamaZamani = System.currentTimeMillis();//100
        //dizi elemanları atanır :
        for(int i = 0; i < 9000000; i++){
            isimlerDizisi[i] = "deneme" + i;
        }
        long bitmeZamani = System.currentTimeMillis();//120
        System.out.println("Dizi çalışma süresi  :" + (bitmeZamani - baslamaZamani));

        baslamaZamani = System.currentTimeMillis();
        //liste elemanları atanır :
        for(int i = 0; i < 9000000; i++){
            isimlerListesi.add("deneme" + i);
        }
        bitmeZamani = System.currentTimeMillis();
        System.out.println("Listenin çalışma süresi : " + (bitmeZamani - baslamaZamani));

        baslamaZamani = System.currentTimeMillis();
        isimlerDizisi[4000000] = "yeni deger";
        bitmeZamani = System.currentTimeMillis();
        System.out.println("Dizinin eleman degistirme suresi  : " + (bitmeZamani - baslamaZamani));

        baslamaZamani = System.currentTimeMillis();
        isimlerListesi.add(4000000, "yeni deger");
        bitmeZamani = System.currentTimeMillis();
        System.out.println("Listenin eleman degistirme suresi  : " + (bitmeZamani - baslamaZamani));


    }
}
