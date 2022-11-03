package date_time;
 import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class Time {

	public static void main(String[] args) {
		
		 Date date= new Date();
		 LocalTime time = LocalTime.now();
		  DateTimeFormatter currentTime = DateTimeFormatter.ofPattern("HH:mm:ss");
		 String localtime= time.format(currentTime);
		 

		 DateFormat dateformate = new SimpleDateFormat("dd/MM/YYYY  HH:mm");
		 String datetime = dateformate.format(date);
		 System.out.println(localtime);
		 	System.out.println(datetime);

	}

}
