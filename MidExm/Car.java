package MidExm;

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
