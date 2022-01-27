// CS 1105 - Assignment 02
//Olumayowa Oluwasanmi - B00785929
// A brief decription of the problem: Continuing from problem 1, this program will add specific "multi discounts"
//before tax

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){

        //Declare the Scanner
        Scanner in = new Scanner(System.in);

        
        //Read from the user
        String productName = in.next();

        int category = in.nextInt();
        
        double price = in.nextDouble();

        int amount = in.nextInt();
        
        
    
        //Calculate tax, total and print the output
        
        //Input validation 
          if (category >= 4)
          {
          System.out.println("Invalid category, please start again");
          }
        
        //If amount if from 0 -4
        if (category == 0 && amount <= 0 && amount >=4)
        {
            double tax = 0;
            double totalCost = (price * amount) + tax;
            
            //Output results
            
         System.out.println("Item:" + " " + productName);
         System.out.printf("Cost: %.2f CAD \n", + price);
         System.out.println("Quantity:" + " " + amount);
         System.out.printf("Tax: %.2f CAD\n", + tax);
         System.out.printf("Total: %.2f CAD\n", +  totalCost);
         
        }
        
        //With multidiscounts for 5 - 10 items
        if (category == 0 && amount >=5 && amount <=10)
        {
          double multiDiscount = price * amount * (10/100.0);
          double tax = 0;
          double totalCost = (price * amount) - multiDiscount;
          
          //Output results
         System.out.println("Item:" + " " + productName);
         System.out.printf("Cost: %.2f CAD (MULTI DISCOUNT) \n", + price);
         System.out.println("Quantity:" + " " + amount);
         System.out.printf("Tax: %.2f CAD\n", + tax);
         System.out.printf("Total: %.2f CAD\n", +  totalCost);
        }
        
        //With multidiscounts from more than 11 items
        if (category == 0 && amount >= 11)
        {
        double tax = 0;
        double multiDiscount = price * amount * (15/100.0);
        double totalCost = (price * amount) - multiDiscount;
        
        //Output results
         System.out.println("Item:" + " " + productName);
         System.out.printf("Cost: %.2f CAD (MULTI DISCOUNT) \n", + price);
         System.out.println("Quantity:" + " " + amount);
         System.out.printf("Tax: %.2f CAD\n", + tax);
         System.out.printf("Total: %.2f CAD\n", +  totalCost);
        }
        
        
        if (category == 1)
        {
            double tax = 0;
            double totalCost = (price * amount) + tax;
            
          //Output results
          System.out.println("Item:" + " " + productName);
         System.out.printf("Cost: %.2f CAD \n", + price);
         System.out.println("Quantity:" + " " + amount);
         System.out.printf("Tax: %.2f CAD\n", + tax);
         System.out.printf("Total: %.2f CAD\n", +  totalCost);
        }
        
            //With multidiscounts for 3 - 7 items
           if (category == 1 && amount >=3 && amount <=7)
           {
          double multiDiscount = price * amount * (3/100.0);
          double tax = 0;
          double totalCost = (price * amount) - multiDiscount;
          
          //Output results
         System.out.println("Item:" + " " + productName);
         System.out.printf("Cost: %.2f CAD (MULTI DISCOUNT) \n", + price);
         System.out.println("Quantity:" + " " + amount);
         System.out.printf("Tax: %.2f CAD\n", + tax);
         System.out.printf("Total: %.2f CAD\n", +  totalCost);
        }
        
        //With multidiscounts from more than 8 items
        if (category == 1 && amount >= 8)
        {
        double tax = 0;
        double multiDiscount = price * (5/100.0);
        double totalCost = (price * amount) - multiDiscount;
        
        //Output results
         System.out.println("Item:" + " " + productName);
         System.out.printf("Cost: %.2f CAD (MULTI DISCOUNT) \n", + price);
         System.out.println("Quantity:" + " " + amount);
         System.out.printf("Tax: %.2f CAD\n", + tax);
         System.out.printf("Total: %.2f CAD\n", +  totalCost);
        }
        
        
        
        //NO MULTIDISCOUNTS for category 2 & 3

        if (category == 2)
        {
            double tax = price * amount * (5/100.0) ;
            double totalCost = (price * amount) + tax;
            
            //Output results
        System.out.println("Item:" + " " + productName);
         System.out.printf("Cost: %.2f CAD \n", + price);
         System.out.println("Quantity:" + " " + amount);
         System.out.printf("Tax: %.2f CAD\n", + tax);
         System.out.printf("Total: %.2f CAD\n", +  totalCost);
        }

        if (category == 3)
        {
            double tax = price * amount * (15/100.0) ;
            double totalCost = (price * amount) + tax;
            
           
            //Input validation for inccorect case
             if ( category == 3 && productName.equalsIgnoreCase("Water"))
             {
               tax = 0.00;
               totalCost = (price * amount) + tax;
             }
             
         //Output results      
         System.out.println("Item:" + " " + productName);
         System.out.printf("Cost: %.2f CAD \n", + price);
         System.out.println("Quantity:" + " " + amount);
         System.out.printf("Tax: %.2f CAD\n", + tax);
         System.out.printf("Total: %.2f CAD\n", +  totalCost);
          
             }
        

        


    }
}