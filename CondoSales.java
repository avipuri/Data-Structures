//By Aviral Puri
//Condo Sales, Lab 6
//Created April 24
//This program calculated the price of a condo when given a combination
//of options.

import java.util.Scanner; //Allows us to read input from keyboard

public class CondoSales {//Actualizes the class in which we will put our calculation method
    public static void condoPrice()// This will be the method which calculates condo cost
    {
        int view;// Used to hold user selection of view
        int additionalChoice; //Used to hold user selection of parking
        int price = 0; //Used to hold the calculated total price
        boolean condoSelected = false;//Used to control the execution of the second if branch
        Scanner in = new Scanner(System.in);//Initializes scanner
        System.out.println("Select View");
        System.out.print("1)Park View\t2)Golf Course View\t3)Lake View \n");
        view = in.nextInt();//Takes user input and stores in var view

        if (view == 1)//First if branch
        {//Used to confirm and record the selected condo price
            int parkView = 150000;
            price += parkView;
            System.out.println("You have chosen Park View. Condo Price: $" + parkView);
            }
            
           if (view == 2)
           {
                int golfView = 170000;
                price += golfView;
                System.out.println("You have chosen Golf Course View. Condo Price: $"
                                                                         + price);
            }
            if (view == 3)
            {
                int lakeView = 210000;
                price += lakeView;
                System.out.println("You have chosen Lake View. Condo Price: $" + price);
            }
            if (view != 1 && view != 2 && view != 3)
            {
                System.out.println("Error: Incorrect input.\nTotal Price: $0");
                System.exit(0);
               
            }
            else {// Sets bool val to true which execs the second if branch
            condoSelected = true;
            } 
               if (condoSelected) {//Confirms and records the selected parking option
            System.out.println("Enter Details if Required\n1)Garage\n2)Parking Space\n");
            additionalChoice = in.nextInt();
            if (additionalChoice == 1) {
                price += 5000;//Adds parking to condo price
                System.out.println("You will receive a Garage(+$5000). Total Cost = $" + price);
                //Prints total price
            } 
            else {
                System.out.println("You will recieve Standard Parking(+$0). Total Cost =$" + price + "\n");
                // Prints total price
            }

        }
    }
}
