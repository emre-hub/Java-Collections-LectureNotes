package CollectionsFramework.udemykursplayer;

import java.util.ArrayList;

public class Kurs {
    private String kursAdi;
    private ArrayList<Ders> kurstakiDersler;
    private ArrayList<Egitmen> kursEgitmenleri;
    private ArrayList<Ogrenci> kursOgrencileri;
    //ders sayısı en az 5 ve toplam içerik en az 60 dakika olmalı.
    private boolean yayinda;

    public Kurs(String kursAdi, Egitmen basEgitmen) {
        this.kursAdi = kursAdi;
        this.kurstakiDersler = new ArrayList<>();
        this.kursEgitmenleri = new ArrayList<>();
        this.kursOgrencileri = new ArrayList<>();
        kursEgitmenleri.add(0, basEgitmen);
        this.yayinda = false;
    }

    public void kursaEgitmenEkle(Egitmen yeniEgitmen){
        if(!kursEgitmenleri.contains(yeniEgitmen)){
            kursEgitmenleri.add(yeniEgitmen);
            System.out.println(yeniEgitmen.getIsim() + " kursa eğitmen olarak eklendi.");
        }else{
            System.out.println(yeniEgitmen.getIsim() + " zaten kursta tanımlı bir eğitmendir.");
        }
    }

    public void kursaEgitmenSil(Egitmen silinecekEgitmen){
        if(silinecekEgitmen.getIsim().equals(kursEgitmenleri.get(0).getIsim())){
            System.out.println(silinecekEgitmen.getIsim() + " kursun baş eğitmenidir, silinemez.");
        }else{
            kursEgitmenleri.remove(silinecekEgitmen);
            System.out.println(silinecekEgitmen.getIsim() + " kurs eğitmenliğinden çıkarıldı.");
        }
    }

    public void kursaDersEkle(Ders eklenecekDers){
        kurstakiDersler.add(eklenecekDers);
    }

    public ArrayList<Ogrenci> getKursOgrencileri() {
        return kursOgrencileri;
    }

    public boolean kursYayindaKontrol(){
        if(kurstakiDersler.size() >= 5 && kurstakiDerslerinToplamDakikaSuresi() > 60){
            yayinda = true;
            return true;
        }else{
            yayinda = false;
            return false;
        }
    }

    public int kurstakiDersSayisi(){
        return kurstakiDersler.size();
    }

    private int kurstakiDerslerinToplamDakikaSuresi(){
        double toplamSure = 0;
        for(Ders ders : kurstakiDersler){
            toplamSure += ders.getDakika();
        }
        return (int)toplamSure;
    }

    public ArrayList<Ders> getKurstakiDersler() {
        return kurstakiDersler;
    }

    public String getKursAdi() {
        return kursAdi;
    }
}
