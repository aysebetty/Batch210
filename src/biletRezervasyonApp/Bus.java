package biletRezervasyonApp;

import java.util.ArrayList;
import java.util.List;

public class Bus {

    //2-plaka ve koltuk no
    public String numberPlate;
    public List <String> seats =new ArrayList<>();

   //3-otobusu olusturdugumda plaka ve koltuk nolar set edilsin
   public Bus(String plaka) {    //constructor
       this.numberPlate=plaka;


       for (int i = 1; i <33 ; i++) {
           this.seats.add(i+"");    // yada this.seats.add(String.valueof(i));

       }




   }

}
