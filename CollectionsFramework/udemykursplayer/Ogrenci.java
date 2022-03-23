package CollectionsFramework.udemykursplayer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ogrenci extends Kisi{
    private ArrayList<Kurs> katildigiKurslar;
    private LinkedList<Ders> izlenecekDersListesi;

    public Ogrenci(String isim, String tanitimYazisi, String kullaniciAdi) {
        super(isim, tanitimYazisi, kullaniciAdi);
        katildigiKurslar = new ArrayList<>();
        izlenecekDersListesi = new LinkedList<>();
    }

    public void kursaKatil(Kurs kurs){
        if(kurs.kursYayindaKontrol()){
            kurs.getKursOgrencileri().add(this);
            katildigiKurslar.add(kurs);
            System.out.println(this.getIsim() + " kullanıcısı " + kurs.getKursAdi() + " isimli kursa katıldı.");
        }else{
            System.out.println(kurs.getKursAdi() + " isimli kurs yayında değil, katılamazsınız.");
        }
    }

    public void izlenecekDersEkle(Ders izlenecekDers){
        boolean dersBulundu = false;
        if(katildigiKurslar.size() >  0){
            for( Kurs gecici : katildigiKurslar){
                if(gecici.getKurstakiDersler().contains(izlenecekDers)){
                    izlenecekDersListesi.add(izlenecekDers);
                    System.out.println("İzlenecek dersler listesine " + gecici.getKursAdi() + " isimli kursta bulunan " +
                            izlenecekDers.getDersBaslik() + " dersi eklendi");
                    dersBulundu = true;
                    break;
                }
            }
            if(!dersBulundu)
                System.out.println("Girilen ders kurslarda bulunamadı veya yetkisiz erişim.");
        }
    }

    public LinkedList<Ders> getIzlenecekDersListesi() {
        return izlenecekDersListesi;
    }

    @Override
    public String toString() {
        return super.toString() + "Ogrenci{" +
                "katildigiKurslar=" + katildigiKurslar +
                '}';
    }
}
