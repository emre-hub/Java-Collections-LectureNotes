package CollectionsFramework.udemykursplayer;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("Ali", "Ali'nin tanıtım yazısı", "ali_udemy");
        Egitmen emre = new Egitmen("Emre", "Emre Java", "emrealtunbilek");

        System.out.println(ogr1);
        System.out.println(emre);

        Ders d1 = new Ders(1, "Giriş", 3.5);
        Ders d2 = new Ders(2, "Java Nedir?", 9.2);
        Ders d3 = new Ders(3, "Primitive Veri Tipleri", 22.5);
        Ders d4 = new Ders(4, "Diziler", 15.9);
        Ders d5 = new Ders(5, "Metotlar", 20.1);
        Ders d6 = new Ders(6, "Nesneler", 25.2);
        Ders d7 = new Ders(7, "Try-Catch", 12.8);
        Ders d8 = new Ders(8, "Recyclerwiev", 17.6);
        Ders d9 = new Ders(9, "Shared preferences", 9.5);
        Ders d10 = new Ders(10, "Firebase", 10.2);

        Kurs javaKursu = new Kurs("Sıfırdan Zirveye Java", emre);
        javaKursu.kursaDersEkle(d1);
        javaKursu.kursaDersEkle(d2);
        javaKursu.kursaDersEkle(d3);
        javaKursu.kursaDersEkle(d4);
        javaKursu.kursaDersEkle(d5);


        ogr1.kursaKatil(javaKursu);

        Kurs androidKursu = new Kurs("Android Kursu", emre);
        androidKursu.kursaDersEkle(d6);
        androidKursu.kursaDersEkle(d7);
        androidKursu.kursaDersEkle(d8);
        androidKursu.kursaDersEkle(d9);
        androidKursu.kursaDersEkle(d10);

        ogr1.kursaKatil(androidKursu);

        ogr1.izlenecekDersEkle(d1);
        ogr1.izlenecekDersEkle(d6);
        ogr1.izlenecekDersEkle(d8);
        ogr1.izlenecekDersEkle(d7);
        ogr1.izlenecekDersEkle(d2);

        listeyiOynat(ogr1.getIzlenecekDersListesi());


    }
    public static void listeyiOynat(LinkedList<Ders> izlenecekDersler){
        Scanner tara = new Scanner(System.in);
        boolean cikis = false;
        boolean ileriDogruHareket = true;

        ListIterator<Ders> iterator = izlenecekDersler.listIterator();
        if(izlenecekDersler.size() == 0){
            System.out.println("Henüz bir ders eklenmemiş.");
        }else{
            Ders ilkders = iterator.next();
            System.out.println("Şuan izlenen ders  : " + ilkders.getDersBaslik() +" Süre : " + ilkders.getDakika());
        }

        menuGoster();
        while(!cikis){
            System.out.println("Seçiminiz : ");
            int kullaniciSecimi = tara.nextInt();
            switch (kullaniciSecimi){
                case 0 : System.out.println("Uygulamadan çıkılıyor..."); cikis = true; break;
                case 1 :
                    if(!ileriDogruHareket){
                        ileriDogruHareket = true;
                        if(iterator.hasNext())
                            iterator.next();
                    }
                    if(iterator.hasNext()){
                        Ders ilkders = iterator.next();
                        System.out.println("===============================================================================");
                        System.out.println("ŞU AN OYNATILAN  :  " + " Ders no : "+ ilkders.getDersNo() + "    Başlık : " +
                                ilkders.getDersBaslik() +"      Süre : " + ilkders.getDakika());
                        System.out.println("===============================================================================");
                    }else{
                        System.out.println("Listenin başına geldiniz");
                    }
                    break;
                case 2 :
                    if(ileriDogruHareket){
                        ileriDogruHareket = false;
                        if(iterator.hasPrevious())
                            iterator.previous();
                    }
                    if(iterator.hasPrevious()){
                        Ders ilkders = iterator.previous();
                        System.out.println("===============================================================================");
                        System.out.println("ŞU AN OYNATILAN  :  " + " Ders no : "+ ilkders.getDersNo() + "    Başlık : " +
                                ilkders.getDersBaslik() +"      Süre : " + ilkders.getDakika());
                        System.out.println("===============================================================================");
                    }else{
                        System.out.println("Listenin sonuna geldiniz");
                    }
                    break;
                case 3 : izlenecekDersleriListele(izlenecekDersler); break;
                case 9 : menuGoster(); break;
            }
        }
    }

    private static void izlenecekDersleriListele(LinkedList<Ders> izlenecekDersler) {
        ListIterator<Ders> iterator = izlenecekDersler.listIterator();
        if(izlenecekDersler.size() == 0){
            System.out.println("Henüz bir ders eklenmemiş.");
            return;
        }else{
            while(iterator.hasNext()){
                Ders ilkders = iterator.next();
                System.out.println("Ders no : "+ ilkders.getDersNo() + "    Başlık : " + ilkders.getDersBaslik() +"      Süre : " + ilkders.getDakika());
            }
        }
    }

    private static void menuGoster(){
        System.out.println("**************MENU**************");
        System.out.println("0- Çıkış");
        System.out.println("1- Sıradaki derse git");
        System.out.println("2- Önceki derse git");
        System.out.println("3- Tüm listeyi göster");
        System.out.println("9- Menü");
    }
}
