/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.Scanner;
public class Assignment6 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the number you want to reverse : ");
       int num= input.nextInt();
       int reverse=0;
       while(num!=0){
       int digit=num%10;
       reverse=reverse *10 +digit;
       num/=10;
       
       }
       System.out.println("the result is : "+reverse);
    }
    
}
