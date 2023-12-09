package counstructorNedir;

public class Hesap {

 // Bu Hesap sınıfi, bir banka hesabını temsil edecek ve
    // hesap sahibinin adını, hesap numarasını ve bakiyesini tutacak.

  //  Öncelikle Hesap sınıfını ve bir constructor (yapıcı) metodunu tanımlayalım:


    String hesapSahibi;
    String hesapNumarasi;
    double bakiye;

    // Constructor
    Hesap(String hesapSahibi, String hesapNumarasi, double bakiye) {
        this.hesapSahibi = hesapSahibi;
        this.hesapNumarasi = hesapNumarasi;
        this.bakiye = bakiye;
    }

    void bakiyeGoster() {
        System.out.println(hesapSahibi + " adına kayıtlı hesabın bakiyesi: " + bakiye + " TL");
    }

    // Para yatırma işlemi
    void paraYatir(double miktar) {
        bakiye += miktar;
        System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + bakiye + " TL");
    }

    // Para çekme işlemi
    void paraCek(double miktar) {
        if (miktar > bakiye) {
            System.out.println("Yetersiz bakiye. Mevcut bakiye: " + bakiye + " TL");
        } else {
            bakiye -= miktar;
            System.out.println(miktar + " TL çekildi. Yeni bakiye: " + bakiye + " TL");
        }
    }

  //  Bu Hesap sınıfı, her hesabın sahibi, numarası ve bakiyesini tutar.
    //  Hesap sınıfının constructor'ı (Hesap(String hesapSahibi, String hesapNumarasi, double bakiye)),
    //  bir hesap nesnesi oluşturulurken bu bilgileri alır ve ilgili alanlara atar.





}
