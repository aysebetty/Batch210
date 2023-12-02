package depoUrunApplication;
/*
     * basit bir depo projesi
     *
     * Calisan bir fabrikada uygulanan bir sistem olan depo uygulamasidir.
     *
     * 1-) burada oncelikle urunun tanimlamasi  yapilir.
     id
     urunIsmi
     uretici
     miktar
     birim ve
     raf (6 adet fields mevcut)
     *
     * 2-) methodlar olusturacagiz.
     *      urunTanimlama   ==>  urunun ismi, ureticisi ve birimi girilecek. id  alınacak.  (miktar 0) (raf null )
     *
     *      urunListele     ==> tanimlanan urunler listelenecek. urunun adeti ve raf numarasi tanimlama yapilmadiysa default deger gorunsun.
            Printf
     *
     *      urunGirisi      ==> giris yapmak istedigimiz urnunun id numarasi ile girecegiz.
     *
     *      urunuRafaKoy    ==> listeden urunu sececegiz ve id numarasina gore urunu rafa koyacagiz.
     *
     *      urunCikisi      ==> listeden urunu sececegiz ve urunun cikis yapcagiz. burada urun listesinden sadece miktarda degisiklik yapilacak.
     *                          urun adedi 0dan az olamaz. 0 olunca urun tanimlamasi silinmesin. sadece miktari 0 olsun.
     *      ===> yaptigimiz tum degisiklikler listede de gorunsun.
     *
     *
     *          id      ismi    ureticisi   miktari     birimi      raf
     *      ---------------------------------------------------------------
     *      or: 1000     un     hekimoglu   0           cuval       null
     *
     *      urunGirisi      ==> id:1000  urun girisi :5
     *      urunListele     ==>
     *
     *          id      ismi    ureticisi   miktari     birimi      raf
     *      ---------------------------------------------------------------
     *      or: 1000     un     hekimoglu   5           cuval       null
     *
     *      urunuRafaKoy    ==> id:1000 raf : raf1
     *      urunListele     ==>
     *          id      ismi    ureticisi   miktari     birimi      raf
     *      ---------------------------------------------------------------
     *      or: 1000     un     hekimoglu   5           cuval       raf1
     *
     *      urunCikisi      ==> id 1000: urun cikis : 3 (kalan 2 cuval un)
     *      urunListele     ==>
     *          id      ismi    ureticisi   miktari     birimi      raf
     *      ---------------------------------------------------------------
     *      or: 1000     un     hekimoglu   2           cuval       raf1
     *
     *
     */

import java.util.Scanner;

public class DepoRunner extends UrunIslem{

    public static void main(String[] args) {

//1- Islem secim menusu
        urunGirisMenusu();

    }



    private static void urunGirisMenusu ()   {

        Scanner input = new Scanner(System.in);


       // 2- islem tekrari icin

        int select;

        do {
            System.out.println("======================================================================================");
            System.out.println("                    ***       DEPO URUN ISLEM MENUSU        ***                       ");
            System.out.println("======================================================================================");


            System.out.println(" Lutfen istediginiz islemin numarasini seciniz  " +
                    "\n1) Urun Tanimlama   ==> 1   \n2) Urun Listeleme   ==> 2   \n3) Depo Urun Girisi ==> 3 " +
                    "    \n4) Urunu Rafa Koyma ==> 4   \n5) Depo Urun Cikisi ==> 5    \n0) CIKIS ");

            System.out.println("Islem No :  " );

             select = input.nextInt();

            System.out.println("----------------------------------------------------------------------------------------");

            switch(select) {

                case 1 :

                    urunTanimla();

                   break;

                case 2 :

                   urunListele ();

                   break;

                case 3 :

                  // urunGirisi(int id , int miktar);

                    break;

                case 4 :

                 //    urunRafaKoy(int id);
                    break;

                case 5 :
                   // System.out.println("Lutfen listeden sectiginiz urunun id sini giriniz ");
                     //  urun.urunCikisi(int id );
                    break;

                case 0 :

                    System.out.println("Iyi Gunler Dileriz");
                    break;

                default:
                    System.out.println("Hatali giris tekrar deneyiniz");
                    break;
            }


        }while(select!=0);


    }

}
