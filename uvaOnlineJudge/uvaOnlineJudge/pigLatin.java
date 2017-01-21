package uvaOnlineJudge;

import java.util.Scanner;

public class pigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()){
			String str[]=sc.nextLine().split(" ");
			for (int i=0;i<str.length;i++) {
				if(i>0)
					System.out.print(" ");
				char ch=str[i].charAt(0);
				if(ch=='A'||ch=='a'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
					System.out.print(str[i]+"ay");
				}
				else{
					String substr=str[i].substring(1, str[i].length());
					System.out.print(substr+Character.toString(ch)+"ay");
				}
				
			}
			
			System.out.println();

		}

	}

}
