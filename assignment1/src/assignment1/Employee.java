/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;


public class Employee {
    String firstname;
    String lastname;
    double monthly_salary;

    public Employee(String firstname, String lastname, double monthly_salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.monthly_salary = monthly_salary;
    }

   

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setMonthly_salary(double monthly_salary) {
        this.monthly_salary = monthly_salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public double getMonthly_salary() {
        return monthly_salary;
    }
    public double yearly_salary( ){
    return 12* monthly_salary;
    }
    public double after_raise(){
    return (0.1 * monthly_salary+ monthly_salary) * 12;
    }

    
}
