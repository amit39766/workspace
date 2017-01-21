package uvaOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class uva_10550 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		String input=sc.readLine();
		StringTokenizer stk=new StringTokenizer(input, " ");
		int pos=Integer.parseInt(stk.nextToken());
		int c1=Integer.parseInt(stk.nextToken());
		int c2=Integer.parseInt(stk.nextToken());
		int c3=Integer.parseInt(stk.nextToken());
		while(pos!=0||c1!=0||c2!=0||c3!=0){
			int turns=1080;
			turns+=(pos - c1) >= 0 ? (pos - c1) * 9 : (pos - c1 + 40) * 9;
			turns+=(c2 - c1)>= 0 ? (c2 - c1) * 9 : (c2 - c1 + 40) * 9;
			turns += (c2 - c3) >= 0 ? (c2 - c3) * 9 : (c2 - c3 + 40) * 9;
			System.out.println(turns);
			input=sc.readLine();
			stk=new StringTokenizer(input, " ");
			pos=Integer.parseInt(stk.nextToken());
			c1=Integer.parseInt(stk.nextToken());
			c2=Integer.parseInt(stk.nextToken());
			c3=Integer.parseInt(stk.nextToken());
		}

	}

}
