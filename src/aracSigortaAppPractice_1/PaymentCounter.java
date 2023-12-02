package aracSigortaAppPractice_1;

import java.util.Scanner;

public class PaymentCounter {

    static Scanner input = new Scanner(System.in);

     String type= input.next().toUpperCase();

    int payment = 0;

    public void calculatePayment(int term) {

        switch (type) {

            case "CAR":

                payment = (term == 1) ? 2000 : 2500;
                break;

            case "BUS":

                BusCounter(term);
                break;

            case "MOTORCYCLE":

                payment = (term == 1) ? 1000 : 1500;
                break;

            default:

                System.out.println("Please Enter Valid Vehicle Type");

                 payment = 0;

        }

    }


    public void BusCounter( int term) {

        System.out.println("Please enter seats number " +
                "\n up to 30 seats ==> Enter 1 " +
                "\n above 30 seats ==> Enter 2");

        Scanner scan = new Scanner(System.in);
        int seats = scan.nextInt();

        if (term == 1) {

          payment = (seats == 1) ? 3000 : 3500;

        }else {

            payment = (seats == 2) ? 3500 : 4000;

        }


    }

}






