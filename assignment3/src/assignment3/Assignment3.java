/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;
public class Assignment3 {

    
    public static void main(String[] args) {
       truck t = new truck (50,10000.5,"black",3000);
       System.out.println(t.getsaleprice());
       System.out.println("enter the weight:");
       Scanner input = new Scanner(System.in);
       int weight=input.nextInt();
       t.setWeight(weight);
       System.out.println(t.getsalepricee());
    }
    
}
