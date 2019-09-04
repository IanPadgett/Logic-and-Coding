/**
 * Skeleton of a program that takes in an ordered pair and prints the quadrant in which it lies.
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Quadrant
{
    public static void main( String[] args) {
        double x;
        double y;
        
        Scanner keys = new Scanner(System.in);
        System.out.println("Whats your x matey");  
        x= keys.nextDouble();
        System.out.println("Whats your y matey");  
        y= keys.nextDouble();
        keys.close();
        
        if (x>0 && y>0) {
            System.out.println("Your point is in the first quadrant");
        }
        if (x<0 && y>0) {
            System.out.println("Your point is in the second quadrant");
        }
        if (x<0 && y<0) {
            System.out.println("Your point is in the third quadrant");
        }
        if (x>0 && y<0) {
            System.out.println("Your point is in the fourth quadrant");
        }
        if (x==0 || y==0) {
            System.out.println("Your point is on one of the axis");
        }
        
            
        
        
        
        
    }
}