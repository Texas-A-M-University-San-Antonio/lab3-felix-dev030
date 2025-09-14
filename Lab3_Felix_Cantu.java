/**
 * Name: [Felix Sanchez Cantu]
 * Date: [September 9, 2025]
* Purpose: Lab 3 - [Using numeric data types and operations and sing the Math class’s pow method]
 */

import java.util.Scanner; 

public class Lab3_Felix_Cantu
{
    public static void main(String[] args) 
    {    Scanner input = new Scanner(System.in);

     double P, r, A; // here i am assigning my three variables the double command to gert a more percise reading of value.

     System.out.println("Please enter the initial value of your home. "); // here i am asking the coder to input their desired value for the initial value of the home
     P = input.nextdouble(); // this is where they will input their initial value when asked

     System.out.println("Please enter the Intrest rates of your home. ");// here i am asking the coder to input their desired value for the interest rates of the home
     INTEREST_RATES = input.nextdouble(); // this is where they will input their interest rates when asked
        double INTEREST_RATES = INTEREST_RATES/ 100.0; // here i am making it so when i input my interets rates, it will convert it to a decimal from a percent

     int t; // here i am assigning my elapsed years as the int rather than double 

     System.out.println("Please enter the ammount of years elapsed. ");//here i am asking the coder to input their desired value for the ammount of elapsed yearsof the home
     t = input.nextint(); // this is where they will input the ammount of elapsed years when asked

     A = P * (1 + r);Math.pow(t);
     System.out.println("The final value of your home is $" + A);
     
    



    }      
}