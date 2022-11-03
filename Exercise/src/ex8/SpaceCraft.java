/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;

/**
 *
 * @author DELL
 */
abstract class SpaceCraft {
    protected String model;
    String a;
     public SpaceCraft(String a){
        this.a=a;
        
    }
    public abstract void display();
}
