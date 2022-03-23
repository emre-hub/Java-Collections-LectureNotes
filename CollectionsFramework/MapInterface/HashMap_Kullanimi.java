package CollectionsFramework.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class HashMap_Kullanimi {
    public static void main(String[] args) {
        /*
        HashMap<Integer, String> plakalar = new HashMap<>();
        plakalar.put(1,"Adana");
        plakalar.put(34,"İstanbul");
        plakalar.put(16,"Bursa");
        plakalar.put(35,"İzmir");
        plakalar.put(06,"Ankara");
        plakalar.put(06, "Asdasd");
        plakalar.put(null, "null deger");


        HashMap<Integer, String> plakalarYedek = new HashMap<>();
        System.out.println("plakalarYedek size : " + plakalarYedek.size());
        plakalarYedek.putAll(plakalar);
        System.out.println("plakalarYedek size : " + plakalarYedek.size());
        plakalarYedek.clear();
        System.out.println("clear sonrası plakalarYedek size : " + plakalarYedek.size());

        System.out.println(plakalar);

        String value = plakalar.get(6);
        System.out.println(value);

        System.out.println(plakalar.get(null));
        System.out.println(plakalar.size());
        System.out.println(plakalar.isEmpty());
        System.out.println(plakalar.containsKey(16));
        System.out.println(plakalar.containsValue("bursa"));
        System.out.println(plakalar.remove(35));
        System.out.println(plakalar.size());

        System.out.println("Keyler : ");
        for(Integer key : plakalar.keySet()){
            System.out.print(key + ", ");
        }
        System.out.println();

        System.out.println("Valuelar : ");
        for(String val : plakalar.values()){
            System.out.print(val + " - ");
        }
        System.out.println();

        for(Map.Entry<Integer, String> entry : plakalar.entrySet()){
            System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
        }*/
        /*
        String st1 = "emre";
        String st2 = "hasan";
        String st3 = "emre";
        System.out.println("st1 hashcode : " + st1.hashCode());
        System.out.println("st2 hashcode : " + st2.hashCode());
        System.out.println("st3 hashcode : " + st3.hashCode());
        System.out.println("st1 equals st3 ? : " + st1.equals(st3));

        Ogrenci ogr1 = new Ogrenci(1, "emre altunbilek");
        Ogrenci ogr2 = new Ogrenci(1, "emre altunbilek");
        //Ogrenci sınıfı için HashMap kullanacaksam,
        //HashMap'in doğru çalışması için, hashCode ve equals metodlarını Ogrenci sınıfında override etmeliyim.
        //Ogrenci sınıfı için hashCode ve equals() metodlarını override etmezsem, sonuçlar aşağıdaki gibi olacaktır :
        System.out.println("ogr1 hashcode : " + ogr1.hashCode());
        System.out.println("ogr2 hashcode : " + ogr2.hashCode());
        System.out.println("ogr1 equals ogr2 ?  : " + ogr1.equals(ogr2));
         */

        HashMap<String, Integer> map = new HashMap<>(16, 0.75f);
        map.put("emre", 1);
        map.put("fb", 2);
        map.put(null, 123456);
        map.put("Ea", 3);
        System.out.println(map.get("Ea"));

        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
class Ogrenci{
    int id;
    String isim;

    public Ogrenci(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }
    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ogrenci ogrenci = (Ogrenci) o;
        return id == ogrenci.id && Objects.equals(isim, ogrenci.isim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isim);
    }
    */

}
