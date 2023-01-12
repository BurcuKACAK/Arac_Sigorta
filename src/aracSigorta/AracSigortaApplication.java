package aracSigorta;

import java.util.Scanner;

public class AracSigortaApplication {
    /*
Proje: Araç Sigorta Prim Hesaplama
    Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                 -otobüs: 18-30 koltuk veya 31 ve üstü koltuk
    Tarife dönemi:Aralık 2022,Haziran 2022
    1.dönemi :Haziran 2022                  2.dönem :Aralık 2022
       otomobil: 2000                       otomobil: 2500
       kamyon:   3000                       kamyon:   3500
       otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
       motosiklet: 1500                     motosiklet: 1750
     Hatalı girişte hesaplama başarısız uyarsı verip tekrar menü gösterilsin.
*/
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        Scanner input =new Scanner(System.in);

        boolean isFail;

        do {
            isFail =false;
            //menu ve tarife donemi secimi
            System.out.println("----Zorunlu Sigorta Primi Hesaplama----");
            System.out.println("Tarife Donemi Seciniz");
            System.out.println("1. Haziran 2022");
            System.out.println("2. Aralik 2022");
            int term = input.nextInt();
            //tarife donemi dogru girilmisse isleme devam et
            //degilse uyari ver basa don
            if (term==1 || term==2){
                String termName = term==1? "Haziran 2022" : "Aralik 2022";
                Arac arac=new Arac();
                System.out.println("Arac tipini giriniz: ");
                System.out.println("Otomobil, Kamyon, Otobus, Motosiklet");
                arac.type=input.next();
                arac.prim= arac.countPrim(term);
                int select;
                if (arac.prim>0){
                    System.out.println("Hesaplama Basariyla Tamamlandi.");
                    System.out.println("Arac Tipi : "+arac.type);
                    System.out.println("Tarife Donemi : "+termName);
                    System.out.println("Aracinizin Ilgili Tarife Donemi Sigorta Primi : "+arac.prim);
                    System.out.println("Yeni islem icin 1, cikis icin 0 giriniz");
                    select=input.nextInt();
                    if (select==1){
                        isFail=true;
                    }else {
                        isFail=false;

                    }

                }else {
                    System.out.println("Hesaplama Basarisiz!");
                    System.out.println("Yeni islem icin 1, cikis icin 0 giriniz");
                    select=input.nextInt();
                    if (select==1){
                        isFail=true;
                    }else {
                        isFail=false;

                    }
                }

            }else {
                System.out.println("Hatali Giris!");
                isFail=true;
            }

        }while (isFail);
        System.out.println("Iyi Gunler Dileriz...");
















    }
}
