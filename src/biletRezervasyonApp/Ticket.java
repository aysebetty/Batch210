package biletRezervasyonApp;

public class Ticket {

  //4-  mesafe(km),koltuk no, yolculuk tipi (tek yon,cift yon)

public double distance;   // km
public int typeNo;       // 1 veya 2
public String seatNo;       // 1 den 32 ye kadar fakat String aliyoruz
private double price;      // verilen bilgilere gore hesaplayacagiz

//5- bilet fiyatini hesaplama

   public void getTotalPrice(int age)  {  //method age a gore bu yuzden variable olarak bilet bilgisine yazmadik

     double  total =0;
     int seat = Integer.parseInt(this.seatNo) ;   // Stringten integera donusur, yada valu of ilede degistirilebilir

     switch(this.typeNo) {   //bilet tipi

         case 1:  //tek yon

             if(seat%3==0) {
                 total = this.distance * 1.2;
             }else {
                 total=this.distance*1;
             }
             System.out.println("toplam tutar : " + total);
             break;
         case 2:  //cift yon

             if(seat%3==0) {
                 total = this.distance * 2.4;
             }else {
                 total=this.distance*2;
             }
             System.out.println("toplam tutar : " + total);

             // cift yon indirimi

             total = total*0.8; //%20 indirimli hali
             System.out.println("Cift yon indirimli toplam tutar : " + total);
             break;

     }
//son tutardan yas indirimi

       if(age<12) {
           total = total * 0.5;
           System.out.println("12 yas alti indirimli toplam tutar : " + total);
       }else if (age>65) {
               total= total*0.7;
               System.out.println("65 yas ustu indirimli toplam tutar : " + total );
           }
       this.price=total;
       }

    //6- bileti yazdiralim   //indirimli hali ile

    public void printTicket(Bus bus)  {           //method

        System.out.println("*".repeat(42));
        System.out.println("---Bilet detayi ---");
        System.out.println("Otobus Plakasi  : " + bus.numberPlate);
        System.out.println("Mesafe    : "+this.distance);
        System.out.println("Yolculuk Tipi   :" +(this.typeNo==1 ? "Tek-Yon" : "Gidis-Donus"));
        System.out.println("Koltuk No    : " +this.seatNo);
        System.out.println("toplam Tutar    : " +this.price);
        System.out.println("Keyifli yolculuklar Dileriz...");
        System.out.println("*".repeat(42));

    }


   }



