package depoUrunApplication;

import java.util.ArrayList;
import java.util.List;

public class UrunListe {














    //4- Urun objeleri icin islemlerin yapildigi class

    private List<UrunIslem> urunListe = new ArrayList<>();

    //5- urunleri bir listeye koyalim

    public UrunListe() {


    }


    //6- urun listesini gosterme

    public void showListe() {

        System.out.println("             *** Urun Listesi  ***         ");
        System.out.printf(" %-3s    %-3s    \n" , "id" , "ismi" , "ureticisi", "miktari", "birimi", "raf");

        for (UrunIslem urun: urunListe) {

            System.out.printf(" %-3s     %-3s    \n", urun.id,urun.urunIsmi, urun.uretici, urun.miktar, urun.birim, urun.rafNo  );
        }
    }



}
