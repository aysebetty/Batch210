package counstructorNedir;

public class Kitap {

    // Öncelikle, Kitap sınıfını ve bir constructor (yapıcı) metodunu tanımlayalım:

    String isim;
    String yazar;
    int sayfaSayisi;

   //  Bu Kitap sınıfı, her kitabın ismini, yazarını ve sayfa sayısını tutar.
    // Kitap sınıfının constructor'ı (Kitap(String isim, String yazar, int sayfaSayisi)),
    // bir kitap nesnesi oluşturulurken bu bilgileri alır ve ilgili alanlara atar.



    // Constructor
    Kitap(String isim, String yazar, int sayfaSayisi) {
        this.isim = isim;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
    }

    void kitapBilgisiGoster() {
        System.out.println(isim + " - " + yazar + ", Sayfa Sayısı: " + sayfaSayisi);
    }



    //Nesne Oluşturma
    //Şimdi bu sınıftan bir nesne oluşturalım ve constructor'ı kullanalım:

    //Bu kodda, Kitap sınıfından favoriKitabim adında bir nesne oluşturduk ve
    // bu nesneye "1984" (isim), "George Orwell" (yazar) ve 328 (sayfa sayısı) değerlerini verdik.
    // Constructor, bu değerleri alır ve nesnenin ilgili alanlarına atar.

    public static void main(String[] args) {


        Kitap favoriKitabim = new Kitap("1984", "George Orwell", 328);

        favoriKitabim.kitapBilgisiGoster();  // "1984 - George Orwell, Sayfa Sayısı: 328" yazdırır



    }

/*

Sonuç
Bu örnek, bir kitap nesnesinin nasıl oluşturulacağını ve başlangıç verilerinin constructor aracılığıyla nasıl atanacağını gösterir.
Nesne yönelimli programlamada, constructorlar, nesneleri başlatmak ve gerekli verilerle doldurmak için kullanılır.
Bu yaklaşım, kodun düzenli ve anlaşılır olmasını sağlar ve nesnelerin doğru şekilde başlatılmasına yardımcı olur.


 */






}
