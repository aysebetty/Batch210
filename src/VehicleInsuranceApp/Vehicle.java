package VehicleInsuranceApp;

import java.util.Scanner;

public class Vehicle {

         String type;

         int payment;


        public int countPayment(int term){

            if (term == 1) {                  //    if  term

                switch (type) {   //switch

                    case "CAR":

                        payment = 2000;

                        break;

                    case "TRUCK":

                        payment = 3000;

                        break;

                    case "BUS":

                        countBusPayment(term);

                        break;

                    case "MOTORCYCLE":

                        payment = 1500;

                        break;

                    default:
                        System.out.println("Incorrect vehicle type entrance");

                        payment = 0;



                }    //switch end

            } else if (term == 2) {

                switch (type) {

                    case "CAR":

                        payment = 2500;

                        break;

                    case "TRUCK":

                        payment = 3500;

                        break;

                    case "BUS":

                        countBusPayment(term);

                        break;

                    case "MOTORCYCLE":


                        payment = 1750;

                        break;

                    default:
                        System.out.println("Incorrect vehicle type entrance");

                        payment = 0;

                }

            } else {                  // else term

                System.out.println("Incorrect term type entrance");

                payment=0;
            }

            return payment;
        }


        //----------------------------------

        public int countBusPayment(int term)  {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter the type of bus: ");

            System.out.println("For Type 1 Buses (18-30 seats) ==> Enter 1" + "\nFor Type 2 Buses (31 and above seats)==> Enter 2");

            int  busType = input.nextInt();

            switch(busType) {

                case 1:

                    if (term==1) {

                        payment =4000;
                    }else {

                        payment= 4500;
                    }
                    break;

                case 2:

                    if (term==2) {

                        payment =5000;

                    }else {

                        payment= 5500;
                    }

                    break;

                default:

                    System.out.println("Incorrect bus type entrance");

                   payment= 0;
            }

               return payment;

        }

    }












