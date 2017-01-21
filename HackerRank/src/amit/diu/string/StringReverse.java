package amit.diu.string;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=(new Scanner(System.in)).next();
		StringBuilder sb=new StringBuilder(str);
		String rstr=sb.reverse().toString();
		if(str.equals(rstr))System.out.println("Yes");
		else System.out.println("No");

	}

}
