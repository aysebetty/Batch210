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


import java.util.Locale;
import java.util.Scanner;

public class UrunIslem {

static Scanner input = new Scanner(System.in);

 static String urunIsmi;
 static String uretici;
 static String birim;
 static int miktar;
 static String rafNo;
   static int id = 1000;


public static void urunTanimla ()  {

    System.out.println("                  **** URUN TANIMLAMA ***              ");

    System.out.println("Urun ismini giriniz ");

     urunIsmi= input.nextLine().toLowerCase();

    System.out.println("ureticisini giriniz");

    uretici= input.next().toLowerCase();

    System.out.println("birimini giriniz, orn:cuval,koli...");

    birim= input.next().toLowerCase();

    miktar=0;

    rafNo=" - ";

     id ++;

    System.out.println("Urun Id : " + id );

    }

    public static void urunListele ()  {

        System.out.println("                             **** URUN LISTESI ***                                    ");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println( "id         ismi           ureticisi          miktari        birimi          raf      ");

        System.out.println("--------------------------------------------------------------------------------------");

        System.out.printf("%-10d %-17s %-16s %-19s %-12s %-10s\n", id, urunIsmi, uretici, miktar, birim, rafNo);

    }




    public static void urunListele ( int miktar, String rafNo)  {


        System.out.println("Lutfen urun miktarini giriniz ");

        miktar= input.nextInt();

        System.out.println("Lutfen rafin ismini giriniz");

        rafNo= input.next() ;


        System.out.println( "id         ismi           ureticisi          miktari             birimi          raf");

        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println( id + "     " + urunIsmi  + "     "  + uretici  + "     " +  miktar + "     " +  birim + "    " + rafNo );
    }


    public static void  urunGirisi ()  {

        System.out.println("           *** URUN GIRIS ***      ");

        System.out.println("Urun id: ");
        int  findId = input.nextInt();

        if(//urunListesi)

        System.out.println("urun girisinin sayisini giriniz");

        miktar= input.nextInt();
    }




    public String urunRafaKoy (int id)  {

    System.out.println("Lutfen listeden sectiginiz urunun id sini giriniz ");

        System.out.println("Id: ");

         this.id= id;

         return rafNo;
    }




    public void  urunCikisi (int id , int cikanUrun )  {
        System.out.println("urun cikisi yapacagoniz miktari yaziniz ");

    }






}
