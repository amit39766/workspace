package amit.diu.string;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StirngToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex="[A-Za-z]+";
		Pattern pt=Pattern.compile(regex);
		String str=(new Scanner(System.in)).nextLine();
		Matcher match=pt.matcher(str);
		
		LinkedList<String>list=new LinkedList<>();
		while(match.find()){
			list.add(match.group());
		}
		System.out.println(list.size());
		for(String st:list)
			System.out.println(st);

	}

}
