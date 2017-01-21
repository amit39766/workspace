package uvaOnlineJudge;

import java.util.Scanner;

public class BitOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of S and N : S N ");
		while(true){
			int S=sc.nextInt();
			int N=sc.nextInt();
			System.out.println("mod is :"+(S&(N-1)));
		}
		
		

	}

}
