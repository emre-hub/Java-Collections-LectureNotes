package CollectionsFramework.SansliOnNumara;

import java.util.*;

public class Main {
    static final int URETILECEK_SAYI_MAX_SINIR = 60;
    static final int URETILECEK_SAYI_MIKTARI = 1000000;
    public static void main(String[] args) {
        //Şanslı 10 numarayı bulan uygulamayı yazınız
        //1'den 60'a kadar sayıları 1.000.000 kere oluşturunuz
        //Bu sayıları bir map içerisinde anahtar = sayı değer = kaç kere çıktığı olacak şekilde saklayınız
        //Sonrasında bu işlem bittikten sonra bu sayıları tekrar etme sayısına göre bir listeye aktarınız
        //Sonra yine rastgele olacak şekilde bir set yapısı kullanarak küçükten büyüğe doğru ilk 10 sayıyı ekrana bastırınız.

        //aşağıdaki örnekte olduğu gibi bir yapıda :
        // yani List<String> list = new ArrayList<>(); kod yazımı şu anlama gelir :
        // List, ArrayList'in üst sınıfıdır ve bundan dolayı ürettiğim nesnede List ve ArrayList'in ortak metodlarını görebilirim,
        // Bu ortak metodlar ArrayList'te kalıtıldığı şekliyle çalışır.

        Map<Integer, Integer> olusturulanSayilarMap = new HashMap<>();
        List<Integer> olusturulanSayiListesi = new ArrayList<>();
        Set<Integer> sansliOnSayi = new TreeSet<>();

        mapiSayilarlaDoldur(olusturulanSayilarMap);
        mapiListeyeYazdir(olusturulanSayilarMap, olusturulanSayiListesi);
        sansliOnSayiyiBul(sansliOnSayi, olusturulanSayiListesi);

        System.out.println("Map size : " + olusturulanSayilarMap.size());
        System.out.println("Liste size : " + olusturulanSayiListesi.size());
        System.out.println("Set size : " + sansliOnSayi.size());

        System.out.println("Şanslı 10 Sayı : ");

        for(int gecici : sansliOnSayi){
            System.out.print(gecici + "    ");
        }

        /*for( Map.Entry<Integer, Integer> gecici : olusturulanSayilarMap.entrySet()){
            System.out.println(gecici);
        }
         */


    }

    private static void sansliOnSayiyiBul(Set<Integer> sansliOnSayi, List<Integer> olusturulanSayiListesi) {
        Collections.shuffle(olusturulanSayiListesi);
        while(sansliOnSayi.size() < 10){
            int rastgeleSayi = (int)(Math.random() * URETILECEK_SAYI_MIKTARI);
            sansliOnSayi.add(olusturulanSayiListesi.get(rastgeleSayi));
        }
    }

    private static void mapiListeyeYazdir(Map<Integer, Integer> olusturulanSayilarMap, List<Integer> olusturulanSayiListesi) {
        for( Map.Entry<Integer, Integer> gecici : olusturulanSayilarMap.entrySet()){
            int key = gecici.getKey();//9
            int value = gecici.getValue();//15 :   bu, 9 sayısının 15 kere oluşturulduğu anlamına gelir
            for(int i = 0; i < value; i++){
                olusturulanSayiListesi.add(key);
            }
        }
    }


    private static void mapiSayilarlaDoldur(Map<Integer, Integer> olusturulanSayilarMap) {
        for(int i = 0; i < URETILECEK_SAYI_MIKTARI; i++){
            int randomSayi = sayiOlustur();
            if(olusturulanSayilarMap.containsKey(randomSayi)){
                int value = olusturulanSayilarMap.get(randomSayi);
                olusturulanSayilarMap.put(randomSayi, ++value);
            }else{
                olusturulanSayilarMap.put(randomSayi, 1);
            }
        }
    }

    private static int sayiOlustur(){
        return (    (int) (Math.random() * URETILECEK_SAYI_MAX_SINIR) + 1    );
    }
}
