/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;



public class ford extends car {
    int year;
    int manufacturerDiscount;
    

    public ford(int speed, double regularprice, String color,int year,int manufacturerDiscount) {
        super(speed, regularprice, color);
        this.year= year;
        this.manufacturerDiscount= manufacturerDiscount;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }
    
    
    public double getsalepricee(){
    return (super.getsaleprice()-manufacturerDiscount);
    }
    
    
}
