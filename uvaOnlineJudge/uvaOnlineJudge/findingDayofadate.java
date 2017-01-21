package uvaOnlineJudge;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class findingDayofadate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[]{ "","Sun" , "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		Calendar calendar=new GregorianCalendar(2010,7,9);
		System.out.println(names[calendar.get(Calendar.DAY_OF_WEEK)]);
		Date date1=calendar.getTime();
		Map<String, Integer>mp=new HashMap<>();
		mp.g
		TimeUnit.DAYS.co
	}
}
