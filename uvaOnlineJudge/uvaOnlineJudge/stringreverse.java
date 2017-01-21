package uvaOnlineJudge;

import java.util.Scanner;

public class stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()){
		String str[]=sc.nextLine().split(" ");
		for (int i=0;i<str.length;i++) {
			String restr=new StringBuffer(str[i]).reverse().toString();
			if(i<str.length-1)
			System.out.print(restr+" ");
			else
				System.out.print(restr);
		}
		
		System.out.println();

	}
	}
}
