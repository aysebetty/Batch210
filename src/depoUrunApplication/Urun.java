package depoUrunApplication;

import java.util.HashMap;
import java.util.Map;

public class Urun     {




    public static Map<Integer, Urun> urunListesi = new HashMap<Integer, Urun>();



   public static int id=1000;

   public String urunIsmi;

   public  String uretici;

   public int miktar;

   public String birim;

   public  String rafNo;


   public Urun()  {


   }


  public Urun (int id , String urunIsmi, String uretici, int miktar, String birim, String rafNo) {

      this.id=id;
      this.urunIsmi=urunIsmi;
      this.uretici=uretici;
      this.miktar=miktar;
      this.birim=birim;
      this.rafNo=rafNo;
  }






}


