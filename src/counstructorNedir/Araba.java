package counstructorNedir;

public class Araba extends Vehicle {

/*
    Object-Oriented Programming - OOP

Nesne yönelimli programlama, programları nesnelerin etkileşimleri olarak modelleyen bir programlama paradigmasıdır.
Bu nesneler, gerçek dünyadaki nesneleri veya kavramları temsil edebilir ve her biri belirli özellikler (nitelikler veya öznitelikler)
ve davranışlar (metodlar veya fonksiyonlar) içerir.

Java'nın OOP olması şu özelliklere dayanır:

Sınıflar ve Nesneler: Java'da her şey sınıflar ve nesneler aracılığıyla ifade edilir.
Bir sınıf, nesnelerin nasıl oluşturulacağını tanımlayan bir şablondur.

Nesne (Object)
Bir nesne, bir sınıfın somut örneğidir. Sınıflar, nesnelerin nasıl oluşturulacağını tanımlayan şablonlar veya planlardır.
Her nesne, sınıfın tanımladığı özelliklere (değişkenlere) ve davranışlara (metodlara) sahiptir.

Örneğin, Araba adında bir sınıf oluşturabilir ve bu sınıfın özellikleri (renk, model vb.)
ve davranışları (hızlanma, durma vb.) olabilir.
Ardından bu sınıftan nesneler (örneğin, myCar) oluşturabiliriz.


 */

    String color = "Beyaz";

    String brand = "Toyota Corolla";

    int year = 2024;


    void calistir() {
        System.out.println( brand + " çalıştırıldı.");
    }


    void dur() {
        System.out.println(brand + " durduruldu.");
    }


   Araba () {}


    Araba ( String newColor, String newBrand) {
   //     super("modeli");
        this.color= newColor;
        this.brand= newBrand;

    }

    public Araba(String color, String brand, int year) {
        this.color = color;
        this.brand = brand;
        this.year = year;
    }


}








