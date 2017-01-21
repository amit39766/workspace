package takeOff;

import java.text.NumberFormat;
import java.util.Scanner;

public class justCharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String strLine=sc.nextLine();
		char ch=strLine.charAt(0);
		int chValue=Integer.parseInt(String.valueOf(ch));
		System.out.println(chValue);

	}

}
