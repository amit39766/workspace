package takeOff;

import java.util.BitSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bitFieldProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String patern0="0000000";
		String patern1="1111111";
		Pattern strp= Pattern.compile(patern0);
		Matcher match=strp.matcher(str);
		boolean a=match.find();
		strp=Pattern.compile(patern1);
		match=strp.matcher(str);
		boolean b=match.find();
		
		if(a||b){
			System.out.print("YES");
		}
		else
			System.out.print("NO");
		
	

	}

}
