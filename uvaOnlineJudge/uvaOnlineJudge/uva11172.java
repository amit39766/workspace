package uvaOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class uva11172 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(sc.readLine());
		while(T-->0){
			StringTokenizer input=new StringTokenizer(sc.readLine());
			int a=Integer.parseInt(input.nextToken());
			int b=Integer.parseInt(input.nextToken());
			if(a==b)System.out.println("=");
			else
			System.out.println((a>b)?">":"<");
		}

	}

}