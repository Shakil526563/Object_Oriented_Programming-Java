package MidExm;

public class Suv  extends Car{


       public Suv (String carName, String carColor, int carEngineNumber){
       this.carName= carName;
       this.carColour= carColor;
       this.carEngineNumber= carEngineNumber;
       
   
   
}
       //ovverride
       public void remoteStart(int carStart) { 
       if(carStart == 1) { 
           System.out.println("Car is started."); 
       } 
       else { 
           System.out.println("Car is not started."); 
       } 
   } 
    
    //ovverrride  
   public void remoteMusic(int carMusic) { 
       if(carMusic == 1) { 
           System.out.println("Car is started."); 
       } 
       else { 
           System.out.println("Car is not started."); 
       } 
   } 
   package Car;

   public class Car {

       public String carName;
       public String carColour;
       public String carEngineNumber;
       
       public boolean remoteStart(){
           return false;
       }
       
       public boolean remoteMusic(){
           return false;
       }
       
       
   }


   package Car;


   public class SUV extends Car {
       
       private int batteryPercentage = 60;
       private double carTirePressure;
       
       
       public SUV(){
           System.out.println("Battery percentage "+batteryPercentage+"%");
       }
       
       public double tirePressure(){
           return carTirePressure;
       }
       @Override
       public boolean remoteStart(){
           return true;
       }
       
       @Override
       public boolean remoteMusic(){
           return true;
       }
       
       
   }

   package Car;

   public class Sedan extends Car {

       @Override
       public boolean remoteStart() {
           return true;
       }

       @Override
       public boolean remoteMusic() {

           return true;
       }

   }


   package Main;

   import Car.SUV;

   public class Main {

       public static void main(String[] args) {

           SUV tesla = new SUV();

       }

   }
} 

   