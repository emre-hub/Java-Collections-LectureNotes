package CollectionsFramework.ListInterface;

import java.util.*;

public class QueueVePriorityQueue {
    public static void main(String[] args) {
        /*
        Queue<Integer> sayilar = new LinkedList<>();

        sayilar.offer(1);
        sayilar.add(2);
        sayilar.offer(3);
        sayilar.offer(3);
        sayilar.offer(4);

        System.out.println(sayilar.peek()); //ilk eleman
        System.out.println(sayilar.poll()); //ilk giren, ilk çıkar.
        System.out.println(sayilar);
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.remove()); //remove hata verir. queueda çıkaracak eleman yoksa null döndürmelidir.
        //Queue'da, Queue'ya özgü metodları kullanmak daha doğrudur.
         */
        /*
        //PriorityQueue : Öncelikli kuyruk
        //Kuyruk veriyapısıdır, fakat elemanları sıraya koyar. Burada elemanların alfabetik bir sırada olmasını bekliyoruz :
        PriorityQueue<String> isimler = new PriorityQueue<>();
        isimler.offer("can");
        isimler.offer("bergen");
        isimler.offer("beyhan");
        isimler.offer("beril");
        isimler.offer("emre");
        isimler.offer("ali");

        //Alfabetik bir sıra beklediğimiz halde sıralanmış bir çıktı vermeyecek :
        Iterator<String> iterator = isimler.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Sıralanmış bir çıktı elde etmek için
        // kuyruğun yapısını kullanarak, (ilk giren ilk çıkar) elemanları teker teker çıkarttım :
        System.out.println();
        while(!isimler.isEmpty()){
            System.out.println(isimler.poll());
        }
        //remove ile denediğimde de poll'daki sonucu elde edebildim
        while(!isimler.isEmpty()){
            System.out.println(isimler.remove());
        }
         */

        //Aşağıdaki Ogrenci sınıfını Comparable Interface'inden türettim.
        // Eğer Comparable yani 'kıyaslanabilir' bir sınıfım olmasaydı,
        // PriorityQueue kuyrugunda elemanlarımın öncelik sırası belli olamayacağı için hata alırdım.
        // ya da buradaki gibi kuyruğu oluştururken, comparator interface'inden anonim inner class kullanarak nesnemi oluştururum.
        PriorityQueue<Ogrenci> ogrenciKuyruk = new PriorityQueue<>(new Comparator<Ogrenci>() {
            @Override
            public int compare(Ogrenci o1, Ogrenci o2) {
                if(o1.id < o2.id)
                    return 1;
                else
                    return -1;
            }
        });
        ogrenciKuyruk.offer(new Ogrenci(1, 82));
        ogrenciKuyruk.offer(new Ogrenci(2, 53));
        ogrenciKuyruk.offer(new Ogrenci(3, 41));
        ogrenciKuyruk.offer(new Ogrenci(4, 65));
        ogrenciKuyruk.offer(new Ogrenci(5, 60));

        System.out.println();
        while(!ogrenciKuyruk.isEmpty()){
            System.out.println(ogrenciKuyruk.poll());
        }

    }
}
class Ogrenci implements Comparable<Ogrenci>{
    int id;
    int notDegeri;

    public Ogrenci(int id, int notDegeri) {
        this.id = id;
        this.notDegeri = notDegeri;
    }

    @Override
    public int compareTo(Ogrenci o) {
        if(this.notDegeri > o.notDegeri){
            return 1;
        }else if(this.notDegeri < o.notDegeri){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", notDegeri=" + notDegeri +
                '}';
    }
}
