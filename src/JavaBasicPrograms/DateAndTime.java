package JavaBasicPrograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY hh:mm:ss:ms z");
		Date date = new Date();
		String formattedDate = sdf.format(date);
		System.out.println("Formatted date is:" + formattedDate);
		

	}

}
