package restaurantBillGenerator;

/*
Proje: Restaurant Fiş Üretme Uygulaması(BillGenerator)
       1-Bir restaurantın online sipariş sisteminde hesabı
       yazdıran uygulama tasarlayınız.

       2-Restauranttaki yiyecekler bir listte tutulsun.
         Yiyeceklerin kodu, ismi ve ücreti olsun.

       3-Yiyecek menüsü gösterme, sipariş oluşturma/iptal ve hesap
         oluşturma için seçim menüsü gösterilsin.

       4-Yiyecek menü:Listedeki yiyecekler menü şeklinde listelensin
         Sipariş girme:Yiyeceğin kodu ve istenilen adet girilerek sipariş oluşturulsun
                       Her sipariş için kod üretilsin(başlangıç 1000 artarak devam eder)
                       Her bir yiyecek siparişi için tutar hesaplansın

         Sipariş iptal:Sipariş kodu girilerek sipariş silinsin
         Hesap oluşturma: Tutarları ile birlikte tüm siparişleri ve
                          toplam tutarı gösteren bir hesap fişi yazdırılsın.
*/

import java.util.Scanner;

public class RestaurantBillGenerator {




    public static void main(String[] args) {

    // 1-islem secim menusu yada start methodu


     //  getSelectionMenu();

     Dish obj1 = new Dish();

        System.out.println("obj1.getAd() = " + obj1.getAd());


    }

/*

    private static void getSelectionMenu () {

        Scanner inp = new Scanner(System.in);

        //2- tekrar tekrar

        int select;


        do {

            System.out.println("-----------------------------------");
            System.out.println("Java Restaurant Siparis Uygulamasina Hosgeldiniz");
            System.out.println("1-Menu");
            System.out.println("2-Siparis gir");
            System.out.println("3-Siparis iptal");
            System.out.println("4-Hesap olustur");
            System.out.println("0-Cikis");
            System.out.println("Seciminiz : ");
            select = inp.nextInt();
            System.out.println("-------------------------");
            switch (select) {


                case 1:
                  //showMenu()
                 break;
                case 2:

                    //siparis gir

                  break;
                case 3:

                   // siparis iptal
                   break;
                case 4:

                  // hesap olusturma
                   break;
                case 0:
                    System.out.println("Iyi gunler dileriz");
                    break;
                default:

                    System.out.println("Hatali giris tekrar deneyiniz");
                    break;
            }

        }while (select == 0) ;



        }

 */
    }