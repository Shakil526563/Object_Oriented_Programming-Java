/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author DELL
 */
public class car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car engine staring");
        
    }

    @Override
    public void stop() {
        System.out.println("Car engine stop");
    }

    @Override
    public void display() {
        Vehicle.super.display(); 
        System.out.println("Carefully i am driving");
    }
    
  
}
