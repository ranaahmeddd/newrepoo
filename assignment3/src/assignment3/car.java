/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;



public class car {
    
  int speed;
  double regularPrice;
  String color;

    public car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
  
  public double getsaleprice(){
  return regularPrice;
  }
  
}
