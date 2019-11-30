/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;
public class Assignment4 {

    
    public static void main(String[] args) {
        ford f = new ford(200,500.5,"red",2018,500);
        System.out.println("the regular price is :");
        System.out.println(f.getsaleprice());
        
       System.out.println("enter the manufacturerDiscount:");
       Scanner input = new Scanner(System.in);
       int manufacturerDiscount=input.nextInt();
       f.setManufacturerDiscount(manufacturerDiscount);
       
       System.out.println(f.getsalepricee());
    }
    
}
