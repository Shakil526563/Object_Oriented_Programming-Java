/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7;

/**
 *
 * @author DELL
 */
 abstract class Shape {
    String color;
    Shape(String color){
        this.color=color;
    }
    abstract double area();
   public abstract String toString (); 
public String getColour(){
    return color;
}
}
