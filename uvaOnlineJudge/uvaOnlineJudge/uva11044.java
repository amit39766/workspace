package uvaOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class uva11044 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(sc.readLine());
		while(T-->0){
			StringTokenizer input=new StringTokenizer(sc.readLine());
			int w=Integer.parseInt(input.nextToken());
			int h=Integer.parseInt(input.nextToken());
			System.out.println((w/3)*(h/3));
		}

	}

}
