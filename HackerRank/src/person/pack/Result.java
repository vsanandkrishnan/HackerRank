package person.pack;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

public class Result {

	public static String findDay(int month, int day, int year) throws ParseException  {
		// TODO Auto-generated method stub
		Calendar c= Calendar.getInstance();
		String d=day+"/"+month+"/"+year;
//		Date date1= new SimpleDateFormat("dd/MM/yyyy").parse(d);
//		c.setTime(date1);
//		int cx=Calendar.MONDAY;
		  SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
		  Date dt1=format1.parse(d);
		  DateFormat format2=new SimpleDateFormat("EEEE"); 
		  String finalDay=format2.format(dt1);
//		LocalDate localDate 
//        = LocalDate.of(year, 
//                       month, day);
//		DayOfWeek dayofweek = DayOfWeek.from(localDate);
		
		
		return finalDay;
	}

}
