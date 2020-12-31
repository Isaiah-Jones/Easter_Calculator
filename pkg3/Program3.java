/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.pkg3;

/**
 *CSC 111
 * @author Isaiah
 */
import java.util.Scanner;
public class Program3 {
    Scanner in = new Scanner(System.in);

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a;
    int b;
    int c;
    int d;
    int e;
    int x;
    int y;
    int year;
   
    Scanner in = new Scanner(System.in);
      //Prompt user for the year
      System.out.println("What year?");
      
      //Retrieve and store the year
      year = in.nextInt();
     
    a = year % 19;
    b = year % 4;
    c = year % 7;
    d = (19 * a + 24)%30;
    e = (2 * b + 4 * c + 6 * d + 5)%7;
    x = (22 + d + e);
    y = (x - 7);
    
      // Configure year
    if (year == 1954)
        System.out.println("Easter is on April " + (y - 31));
    else if (year == 1981)
        System.out.println("Easter is on April " + (y - 31));
    else if (year == 2049)
        System.out.println("Easter is on April " + (y - 31));
    else if (year == 2076)
        System.out.println("Easter is on April " + (y - 31));
    else if (x < 31)
      System.out.println("Easter is on March " + x);
    else
      System.out.println("Easter is on April " + (x - 31));
    

      
      
      
      
      
      
    }
    
}
