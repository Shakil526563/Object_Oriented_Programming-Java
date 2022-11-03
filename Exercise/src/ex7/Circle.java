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
public class Circle extends Shape {
    double radius;
   
    public Circle(String color ,double radius) {
        super(color);
        this.radius=radius;
    }

    @Override
    double area() {
        return 3.1416*radius*radius;
        
    }

    @Override
    public String toString() {
        return "color:"+color +"\nArea"+area();
    }
    
    
}
