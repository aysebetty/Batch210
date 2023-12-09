package counstructorNedir;

public class ArabaRunner {

/*

Constructor (Usta,Chef) :

Bu yapıcı method, bir sınıfın örneği oluşturulduğunda otomatik olarak çağrılan özel bir metottur.
Bir sınıfın constructorlari, o sınıfın nesnelerinin nasıl başlatılacağını tanımlar.
Constructor, bir usta veya şef gibi düşünülebilir, çünkü her ikisi de belirli bir işi veya ürünü başlatmak
ve hazırlamak için gerekli adımları ve malzemeleri yönetir.
Constructorlar, sınıf adıyla aynı adı taşır ve geri dönüş tipi yoktur.

 */
        // Araba sınıfindan  bir nesne oluşturmak için new anahtar kelimesini kullanırız:

    public static void main(String[] args) {


       Araba myCar = new Araba();

        int year=  myCar.year;

        System.out.println("Car year = " + year);

        System.out.println("myCar  = " + myCar.color + " " + myCar.brand);



        //-----------------------------

       Araba  newCar = new Araba ("Kirmizi", "Toyota Camry");

        System.out.println("new Car  " + newCar.color + " " +  newCar.brand +" " + myCar.year);


        Araba  yourCar = new Araba ("Siyah", "Toyota Rav4", 2020  );

        System.out.println(yourCar.color + " " + yourCar.brand + " " + yourCar.year);
    }

    // Bir uygulamada olusturulacak Object ornekleri neler olabilir?

    //Depo uygulamasinda : Urun  yeniUrun =  new Urun ( String urunIsmi, String ureticiIsmi, int miktar, String birim )

   // Restaurant uygulamasinda : Hesap



  //  Intw. Q : Constructor ve method farki nedir ?
}




/*
Constructor'lar (yapıcı metodlar) ve metodlar, nesne yönelimli programlamada önemli roller oynar, ancak farklı amaçlara hizmet ederler. İşte bu iki kavram arasındaki temel farklar:

Constructor'lar (Yapıcı Metodlar)
Başlatma İşlevi: Constructor'lar bir sınıfın nesnesi oluşturulduğunda otomatik olarak çağrılır. Bunların temel amacı, yeni bir nesneyi başlatmak ve nesnenin ilk durumunu ayarlamaktır.

İsimlendirme ve Dönüş Türü:

Constructor'ların ismi, sınıfın ismiyle aynıdır.
Constructor'ların geri dönüş türü yoktur, hatta void bile değildir.
Çağrılma Şekli: Yeni bir nesne oluşturulurken new anahtar kelimesi ile çağrılır (örn. new Araba()).

Overloading: Constructor'lar aşırı yüklenebilir, yani aynı isimle farklı parametreler alan birden fazla constructor tanımlanabilir.

Varsayılan Constructor: Eğer bir sınıfa hiçbir constructor yazılmazsa, Java otomatik olarak parametresiz bir varsayılan constructor sağlar.

Metodlar
Belirli Görevleri Yerine Getirme: Metodlar, belirli görevleri yerine getirmek için kullanılır. Bunlar, bir nesnenin davranışını tanımlar ve sınıfın ya da nesnenin sahip olduğu işlevleri gerçekleştirir.

İsimlendirme ve Dönüş Türü:

Metodların isimleri, gerçekleştirdikleri işlevi yansıtacak şekilde seçilir ve sınıf ismiyle aynı olmak zorunda değildir.
Metodlar, herhangi bir veri türünde (örn. int, String, void vs.) değer döndürebilir.
Çağrılma Şekli: Metodlar, nesne örnekleri (örn. arabam.calistir()) veya sınıflar (statik metodlar için, örn. Math.sqrt()) üzerinden çağrılır.

Overloading ve Overriding: Hem aşırı yükleme (overloading) hem de geçersiz kılma (overriding) metodlar için geçerlidir.

Varsayılan Davranış: Metodlar, eğer sınıf içinde tanımlanmamışlarsa varsayılan olarak mevcut değildir.

Özet
Constructor'lar, bir nesnenin oluşturulma anında başlatılması ve ilk durumunun ayarlanması için kullanılır ve sınıf ismiyle aynı adı taşır. Geri dönüş türü yoktur.
Metodlar, belirli işlevleri yerine getirir, herhangi bir isim ve dönüş türüne sahip olabilir ve bir nesne veya sınıf üzerinden çağrılır.
Her ikisi de sınıfların temel yapı taşlarıdır ve nesne yönelimli programlamada önemli roller oynar.
 */