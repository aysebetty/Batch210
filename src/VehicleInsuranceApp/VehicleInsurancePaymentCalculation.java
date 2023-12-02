package VehicleInsuranceApp;

import java.util.Scanner;

public class VehicleInsurancePaymentCalculation {

    public static void main(String[] args) {

        startCalculation();

    }

    public static void startCalculation() {

        boolean isFailed;

        do {

            isFailed = false;

            Scanner input = new Scanner(System.in);
            System.out.println("-------Welcome to the Vehicle Insurance Payment Calculator------");
            System.out.println("Choose a term for insurance calculation");
            System.out.println("Enter 1 ==> for term June 2024 \n Enter 2 ==> for term December 2024");

            int term = input.nextInt();




            if (term == 1 || term == 2) {           //   if  the term is not 1 or 2 ask the user to restart the application

                String termName = term == 1 ? "June 2024" : "December 2024";

                Vehicle objVehicle = new Vehicle();  //  we should create an object from Vehicle class , default constructor

                System.out.println("Enter the type of vehicle for payment calculation");
                System.out.println("Car, Truck, Bus, Motorcycle");

                objVehicle.type = input.next().toUpperCase();

                objVehicle.payment =objVehicle.countPayment(term);


                //Check if the payment value is greater than 0 , give a message to the user "Calculation is Done!"
                //  if the payment is 0 than give a message to the user "Calculation Failed!"


                int select;

                if (objVehicle.payment > 0) {          //  if   payment >0

                    System.out.println("Calculation is done!");
                    System.out.println("Vehicle Type: " + objVehicle.type);
                    System.out.println("Term: " + termName);
                    System.out.println("The Total Payment: " + objVehicle.payment);

                    System.out.println(" If you would like to do other payment calculation ==>  Enter 1  to continue Or To Exit ==> Enter 0");

                    select = input.nextInt();

                    if (select == 1) {

                        isFailed = true;

                    } else {

                        isFailed = false;

                    }

                } else {                  //    else   payment =0

                    System.out.println("Regarding incorrect data entrance, we could not calculate your payment ");
                    System.out.println("To Restart Please Enter 1 or To Exit Please Enter 0");
                    select = input.nextInt();

                }
                    if (select == 1) {

                        isFailed = true;

                    } else {

                        isFailed = false;

                    }


                } else{                              //   -->  term  else

                    System.out.println("Incorrect term entrance");

                    isFailed = true;

                }


        }while (isFailed) ;


        System.out.println("Good Bye ;)");

    }

}