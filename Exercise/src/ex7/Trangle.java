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
public class Trangle extends Shape {
double length;
        double width;
    public Trangle(String color ,double length,double width) {
        super(color);
        this.length=length;
        this.width=width;
    }

   

    @Override
    double area() {
        return 0.5*(length*width);
    }

    @Override
    public String toString() {
        return "COLOR:"+color+ "\nArea :"+area();
    }
    
    
    
}
