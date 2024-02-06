package JavaBasicPrograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFunction {

	public static void main(String[] args) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		String formattedDate = dateFormat.format(date);
		System.out.println("Today's date is :" + formattedDate);
	}

}
