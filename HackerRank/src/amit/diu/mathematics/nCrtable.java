package amit.diu.mathematics;

import java.util.Scanner;

public class nCrtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
			int n=sc.nextInt();
			for(int i=0;i<=n;i++){
				System.out.print(nCr(n, i)+" ");
			}
			System.out.println();
		}
		

	}
	private static long fact(int n){
		long factorial=1;
		for(int i=1;i<=n;i++)
			factorial=(factorial*i)%1000000000;
		return factorial;
	}
	private static long nCr(int n, int r){
		return fact(n)/(fact(n-r)*fact(r));
	}

}
