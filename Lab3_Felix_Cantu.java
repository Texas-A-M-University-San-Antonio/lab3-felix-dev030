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

     System.out.println("Please enter the initial value of your home. "); // here i am asking the coder to input their desired value for the initial value of the home
     double INITIAL_VALUE, A; // here i am assigning my three variables the double command to gert a more percise reading of value.
     INITIAL_VALUE = input.nextDouble(); // this is where they will input their initial value when asked

     System.out.println("Please enter the Intrest rates of your home. ");// here i am asking the coder to input their desired value for the interest rates of the home
     double INTEREST_RATES = input.nextDouble(); // here i am making it so when i input my interets rates, it will convert it to a decimal from a percent
     INTEREST_RATES = INTEREST_RATES/ 100.0; // this is where they will input their interest rates when asked
     
     System.out.println("Please enter the ammount of years elapsed. ");//here i am asking the coder to input their desired value for the ammount of elapsed years of the home
     int ELAPSED_YEARS; // here i am assigning my elapsed years as the int rather than double 
     ELAPSED_YEARS = input.nextInt(); // this is where they will input the ammount of elapsed years when asked

     A = INITIAL_VALUE * Math.pow(1 + INTEREST_RATES, ELAPSED_YEARS); // here is the equation to find the final interest rates. due to order of operations im asking to multiply the Initial value times 1 + interest rates rasied to t with the help of math.pow
     System.out.println("The final value of your home is $" + A); // simple text that says what my final value for the home is

    }      
}