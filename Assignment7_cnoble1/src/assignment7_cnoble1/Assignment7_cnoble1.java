//<Assignment7_cnoble1.java> -- Application to test class Rectangle
//CSIS 212-D01

package assignment7_cnoble1;

import java.util.Scanner;

public class Assignment7_cnoble1 
{

    public static void main(String[] args) 
    {
        //Initial statement
        System.out.println("Carlton Noble – Assignment #7\n");
        
        //Creating new instance of the scanner
        Scanner input = new Scanner(System.in);
        Rectangle testRectangle = new Rectangle();
         
        //Variables
        int inputValue;
        double areaOfRectangle;
        double perimeterOfRectangle;
        
        //Calling menu and then giving menu value to the function to set the 
        //length and width.
        inputValue = inputMenu(input);
        setLengthAndWidth(inputValue, testRectangle, input);
        
        //Getting the area and perimeter of the rectangle via getmethods
        areaOfRectangle = testRectangle.areaOfRectangle(
                                        testRectangle.getLength(),
                                        testRectangle.getWidth());
        perimeterOfRectangle = testRectangle.perimeterOfRectangle(
                                             testRectangle.getLength(), 
                                             testRectangle.getWidth());
        
        //Printing out the area and perimeter of the rectangle for the viewer
        System.out.printf("\nThe area of your rectangle is %.2f.\n"
                          + "The perimeter of your rectangle is %.2f.\n\n",
                          areaOfRectangle, perimeterOfRectangle);
         
    }
    
    //Function for the input Menu
    public static int inputMenu(Scanner input)
    { 
        //Variables
        int inputValue;
        
        //Asking user for input.
        System.out.printf("1. Set Length\n2. Set Width\n3. Exit\nChoice: ");
        inputValue = input.nextInt();
        
        return inputValue;
    }
    
    //Function to set the length and width based upon 
    //the value from the input menu
    public static void setLengthAndWidth(int inputNumber, 
                                         Rectangle testRectangle, Scanner input)
    {
        //Variables
        double inputWidth;
        double inputLength;
        
        //While statement to determine when the user chooses to exit
         while(inputNumber != 3)
        {
            //If the user wants to set the Length
            if (inputNumber == 1)
            {
                System.out.printf("Please enter a value for your length "
                                   + "between 0.0 and 20: ");
                inputLength = input.nextDouble();
                
                //Try/Catch to make sure the value is between 0.0 and 20
                try
                {
                   testRectangle.setLength(inputLength); 
                }
                catch(IllegalArgumentException e)
                {
                    System.out.printf("Exception: %s%n%n", e.getMessage());
                }
                
                //Return back to the menu
                inputNumber = inputMenu(input);
            }
            else if (inputNumber == 2)
            {
                System.out.printf("Please enter a value for your width "
                                   + "between 0.0 and 20: ");
                inputWidth = input.nextDouble();
                
                //Try/Catch to make sure the value is between 0.0 and 20
                try
                {
                   testRectangle.setWidth(inputWidth); 
                }
                catch(IllegalArgumentException e)
                {
                    System.out.printf("Exception: %s%n%n", e.getMessage());
                }
                //Return back to the menu
                inputNumber = inputMenu(input);
            }
            
            //If a user enters something other than a 1-3
            else
            {
                System.out.println("\nPlease enter a value from the menu.\n");
                
                //Return back to the menu
                inputNumber = inputMenu(input);       
            }
        }
    }
}
