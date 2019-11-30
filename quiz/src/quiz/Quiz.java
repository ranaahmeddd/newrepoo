/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author LENOVO.SXO10
 */
import java.util.Scanner;
public class Quiz {

    
    public static void main(String[] args) {
      
        vipAccount a= new vipAccount();
        a.deactiveAccount(true);
        System.out.println(a.status);
        
        vipAccount e= new vipAccount("rr.com","0110052","adress",20180233,"rana",10,true,"ss");
        System.out.println(e.name);
        System.out.println(e.status);
        
         vipAccount v= new vipAccount();
         v.setpasswordd("123456789");
         
    }
    
}
