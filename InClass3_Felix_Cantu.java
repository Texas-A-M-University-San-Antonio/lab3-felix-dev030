/**
 * Name: [Felix Sanchez Cantu]
 * Date: [September 9, 2025]
* Purpose: InClass 3 - 
* [The purpose of today's in class assignment is to be able to use and understand math.pow method and being able to use numeric values and operations.]
 */

// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner; 

public class InClass3_Felix_Cantu
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
        // In-Class 3 Example:
        // Step 1: Prompt the user to enter the length of the side of a cube.
        double side, volume, SurfaceArea; //I am setting these variables as double
    
        // Step 2: Read the user's input and store it in a variable.
        System.out.println("Please input the value for the side of the cube: "); // here i am making a print statement to ask the user to put the value they want in a nice manner
        side = input.nextDouble();

        // Step 3: Use an appropriate method to determine the volume of the cube.
        volume = Math.pow(side, 3); // here I am writing a math.pow, which means my a value will be raised to the b value in this case, my a value will be cubed

        // Step 4: Use an appropriate method to determine the surface area of the cube.
        SurfaceArea = 6 * Math.pow(side, 2); // same thing as step 3 however, now im telling my code to multiple 6 from the value of Math.pow which is the formual for surface area

        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        // Step 5: Print the volume and surface area in clear sentences.
        System.out.println("The volume of the cube is " + volume);
        System.out.println("The surface are of the cube is " + SurfaceArea); // Here im making two print statements for my final run of the terminal, where it prompts the user with the corresponding values of the surface area and volume of the cube
    }
}