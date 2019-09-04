/**
 * Skeleton of a program that takes in the user's birth month and determines the number of days in the month
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Birthday
{
    public static void main( String[] args) {
        int m;
        
        Scanner keys = new Scanner(System.in);
        System.out.println("What month were you born");
        m= keys.nextInt();
        keys.close();
        
        if (m==1|| m==3||m==5||m==7||m==8||m==10||m==12){ 
        System.out.println("Your month has 31 days in it");
    }
        else if (m==4||m==6||m==9||m==11) { 
        System.out.println("Your month has 30 days in it");
    }
        else if(m==2){
         System.out.println("Your month has 28 or 29 days in it");
}
}
}