/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;


public class Doctor extends Student {
    String result;
String name;
int id;
    public Doctor(String name, int age, int id, String dep,String result) {
        super(name, age, id, dep);
        this.result=result;
        
    }

    

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
            System.out.println(":Result: "+result);
    }

   
    
}

  