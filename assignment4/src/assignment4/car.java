/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;


public class car {
  int speed;
  double regularprice;
  String color;

    public car(int speed, double regularprice, String color) {
        this.speed = speed;
        this.regularprice = regularprice;
        this.color = color;
    }
  
  public double getsaleprice(){
  return regularprice;
  }
}
