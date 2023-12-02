package restaurantBillGenerator;

 //2-Restauranttaki yiyecekler bir listte tutulsun.
       //  Yiyeceklerin kodu, ismi ve ücreti olsun.

//3.olarak yiyecek objesi


import java.time.format.DateTimeFormatter;

public class Dish {    //pojo urun


   private String ad= "Ayse";


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
