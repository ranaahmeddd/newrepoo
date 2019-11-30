/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author LENOVO.SXO10
 */
public class Assignment2 {

    
    public static void main(String[] args) {
        Date d = new Date (10,2,2000);
        System.out.println("the date :");
        System.out.println("month:"+d.getMonth());
        System.out.println("day:"+d.getDay());
        System.out.println("year:"+d.getYear());
        
        Date e = new Date ();
        e.setMonth(12);
        e.setDay(3);
        e.setYear(3000);
        System.out.println("the new date is:");
        e.displayDate();
        
    }
    
}
