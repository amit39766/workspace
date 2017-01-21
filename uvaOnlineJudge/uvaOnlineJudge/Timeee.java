package uvaOnlineJudge;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Timeee {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Map<String,Integer> months=new HashMap<>();
        months.put("Jan",0);
        months.put("Feb",1);
        months.put("Mar",2);
        months.put("Apr",3);
        months.put("May",4);
        months.put("Jun",5);
        months.put("Jul",6);
        months.put("Aug",7);
        months.put("Sept",8);
        months.put("Oct",9);
        months.put("Nov",10);
        months.put("Dec",11);
        Scanner sc=new Scanner(System.in);
        String str[]=sc.nextLine().split(" ");
        int month=months.get(str[0]);
        int day=Integer.parseInt(str[1]);
        int year=Integer.parseInt(str[2]);
        Calendar cal=new GregorianCalendar(year,month,day);
        Calendar cal2=new GregorianCalendar(year,11,25);
        if(month>11||(month==11&&day>25)) cal2=new GregorianCalendar(year+1,month,day-1);
        System.out.println(Math.abs(cal.get(Calendar.DAY_OF_MONTH)-cal2.get(Calendar.DAY_OF_MONTH)));
        Date date1=cal.getTime();
        Date date2=cal2.getTime();
        System.out.println(TimeUnit.DAYS.convert((date2.getTime()-date1.getTime()),TimeUnit.MILLISECONDS));

    }
}