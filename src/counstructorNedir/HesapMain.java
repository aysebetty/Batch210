package counstructorNedir;

public class HesapMain {

  //  Nesne Oluşturma
 //   Şimdi bu sınıftan bir nesne oluşturalım ve constructor'ı kullanalım:

    public static void main(String[] args) {

  Hesap  yeniHesap = new Hesap("Ahmet Yılmaz", "12345678", 1000.0);


  yeniHesap.bakiyeGoster();  // "Ahmet Yılmaz adına kayıtlı hesabın bakiyesi: 1000.0 TL" yazdırır
  yeniHesap.paraYatir(500.0);  // 500 TL yatırma işlemi
  yeniHesap.paraCek(200.0);    // 200 TL çekme işlemi

   // Bu kodda, Hesap sınıfından yeniHesap adında bir nesne oluşturduk ve
        // bu nesneye "Ahmet Yılmaz" (hesap sahibi), "12345678" (hesap numarası) ve 1000.0 (bakiye) değerlerini verdik.
        // Constructor, bu değerleri alır ve nesnenin ilgili alanlarına atar.

     //   Sonuç
   //     Bu örnek, bir banka hesabı nesnesinin nasıl oluşturulacağını
        //     ve başlangıç verilerinin constructor aracılığıyla nasıl atanacağını gösterir.
        //     Nesne yönelimli programlamada, constructorlar, nesneleri başlatmak ve
        //     gerekli verilerle doldurmak için kullanılır. Bu yaklaşım, kodun düzenli ve anlaşılır olmasını sağlar
        //     ve nesnelerin doğru şekilde başlatılmasına yardımcı olur.

    }






}
