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
public interface Vehicle {
    public void start();
    public void stop();
   default public void display(){
        System.out.println("Car starting");
    }
    
}
