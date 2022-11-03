package currenttime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();//method ta local time ta k  store kore rakhe;
		
		DateTimeFormatter formeter = DateTimeFormatter.ofPattern("hh:mm:ss");//method ta time ta k formate kore.
		 String  timeformate=time.format(formeter);//ai method use kore time print kore;
		
		System.out.println(timeformate);
	}

}
