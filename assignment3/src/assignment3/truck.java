/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;



public class truck extends car {
   int weight;

    public truck(int speed, double regularPrice, String color,int weight) {
        super(speed, regularPrice, color);
        this.weight=weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
   public double getsalepricee(){
    if (weight >= 2000){
    return super.getsaleprice()-(0.1*super.getsaleprice());
    }
    else{
    return super.getsaleprice()-(0.2*super.getsaleprice());
    }
   }
   
}
