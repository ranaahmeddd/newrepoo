/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author LENOVO.SXO10
 */
public class Assignment1 {

    
    public static void main(String[] args) {
      Employee e = new Employee("rana","ahmed",150.0);
      if (e.monthly_salary >0){
      e.setMonthly_salary(150.0);
      }
      System.out.println(e.getFirstname());
      System.out.println(e.getLastname());
      System.out.println(e.getMonthly_salary());
      
      e.setFirstname("ola");
      e.setLastname("ghanem");
      e.setMonthly_salary(500.0);
      System.out.println(e.getFirstname());
      System.out.println(e.getLastname());
      System.out.println(e.getMonthly_salary());
      
      Employee s = new Employee("mona","zaki",5000.0);
      System.out.println("the yearly salary of this person :"+s.firstname+s.lastname);
      System.out.println(s.yearly_salary());
      System.out.println("the Employee's yearly salary after 10% raise is :");
      System.out.println(s.after_raise());
      
      Employee k = new Employee("ahmed","helmy",3000.0);
      System.out.println("the yearly salary of this person  :"+k.firstname +k.lastname);
      System.out.println(k.yearly_salary());
      System.out.println("the Employee's yearly salary after 10% raise is :");
      System.out.println(k.after_raise());
    }
     
     

    
    }
