package uvaOnlineJudge;

import java.util.Scanner;

public class formating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double pi=2*Math.acos(0.0);
		String str="%."+n+"f";
		System.out.printf(str,pi);

	}

}
