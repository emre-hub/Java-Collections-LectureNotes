package CollectionsFramework.MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Kullanimi {
    public static void main(String[] args) {
        /*
        Normal HashMap yapısının aynısıdır fakat ek olarak, çift yönlü bir bağlı liste oluşturulur.
        Elemanlar bu bağlı liste yapısında sıralanırlar.
        */
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("emre", 1);
        linkedHashMap.put(null, 2);
        linkedHashMap.put("hasan", 3);
        linkedHashMap.put("ali", 4);

        for(String gecici : linkedHashMap.keySet()){
            System.out.println(gecici);
        }

        for(int gecici : linkedHashMap.values()){
            System.out.println(gecici);
        }

        for(Map.Entry<String, Integer> gecici : linkedHashMap.entrySet()){
            System.out.println(gecici);
        }
    }
}
