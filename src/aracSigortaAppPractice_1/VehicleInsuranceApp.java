package aracSigortaAppPractice_1;

import java.util.Scanner;

import static java.lang.System.*;

public class VehicleInsuranceApp {

    public static void main(String[] args) {


         vehicleInsurance ();

    }


    public static void vehicleInsurance() {

        out.println("Welcome to the Vehicle insurance Paynent ");


        do {

            boolean isFailed = false;

            Scanner input = new Scanner(in);
            out.println("Please enter the term \nEnter 1 for January2023 \nEnter 2 for September2023");

            int term = input.nextInt();

           String termName = (term == 1) ? " January 2023" : " September 2023";

            if (term == 1 || term == 2)  {

                out.println("Please enter your vehicle type: Car, Bus or Motorcycle");

                PaymentCounter paymentCounter = new PaymentCounter();

                int select;

                if (paymentCounter.payment>0) {

                    out.println("For term: " + termName +
                            " Your " + paymentCounter.type +
                            "Insurance payment is: " + paymentCounter.payment);

                    out.println("Would you like to do other calculation? \n For continue ==>press 1 , \n For exit ==>Press 0 ");

                    select = input.nextInt();

                    if (select == 1) {

                        isFailed = true;

                    } else {


                        isFailed = false;

                    }
                }else {

                    out.println("Your payment can not be calculated. Please enter 1 for continue, enter 0 for exit");

                            select = input.nextInt();

                    if (select == 1) {
                        isFailed = true;

                    } else if (select == 2) {

                        isFailed = false;


                    }


                }

            }else{

            out.println("Please enter a valid term: 1 or 2");

            isFailed = true;
            }

    }while(true);



    }


}







    