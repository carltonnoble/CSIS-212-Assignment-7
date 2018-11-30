//<Assignment7_cnoble1.java> -- Class to get the length and width of a 
//                              rectangle and then return the area and
//                              perimeter.
//CSIS 212-D01

package assignment7_cnoble1;

public class Rectangle 
{
    //Default constructor
    public Rectangle()
    {
        //Setting the default values of length and width
        this.length = 1;
        this.width = 1;   
    }
    
    //Variables
    private double length;
    private double width;
    
    //Get and Set for Length
    public void setLength(double setLength)
    {
        //If the length is correct
        if (setLength > 0.0 && setLength < 20)
        {
            this.length = setLength;
        }     
        else
            throw new IllegalArgumentException("The value you entered is "
                    + "not between 0.0 and 20");  
    }
  
    public double getLength()
    {
        return length;
    }
    
    //Get and Set for Width
    public void setWidth(double setWidth)
    {
        //If the width is correct
        if (setWidth > 0.0 && setWidth < 20)
        {
            this.width = setWidth;
        }
        else
            throw new IllegalArgumentException("The value you entered is "
                    + "not between 0.0 and 20");
    }
    
    public double getWidth()
    {
        return width;
    }
    
    //Function to determine the perimeter of the Rectangle
    public double perimeterOfRectangle(double length, double width)
    {
        //Variable
        double perimeter;
        
        //Calculation
        perimeter = 2 * (length + width);
        return perimeter;
    }
    
    //Function to determine the area of the Rectangle
    public double areaOfRectangle(double length, double width)
    {
        //Variable
        double area;
        
        //Calculation
        area = (length * width);       
        return area;
    }    
}
