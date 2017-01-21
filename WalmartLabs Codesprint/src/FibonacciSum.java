import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FibonacciSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long Fib[]=new long[10005];
		long mod=1000000007l;
		for ( int i =0; i < 10002; i++ )
		{
			if ( i == 0 ) Fib[i] = 0;
			else if ( i == 1 ) Fib[i] = 1;
			else Fib[i] = (Fib[i -1]%mod + Fib[i -2]%mod)%mod;
		}
		int Q=sc.nextInt();
		for(int q=1;q<=Q;q++){
			int n=sc.nextInt();
			int ai[]=new int[n+1];
			int sumOfai[]=new int[n+1];
			for(int i=1;i<=n;i++){
				ai[i]=sc.nextInt();
				sumOfai[i]=ai[i]+sumOfai[i-1];
			}
			long sum=0l;
			for(int i=1;i<=n;i++){
				for(int j=i;j<=n;j++){
					//sum=(sum+fibonacci(sumOfai[j]-sumOfai[i-1]))%1000000007;
					int ith=(sumOfai[j]-sumOfai[i-1]);
					sum=(sum+(Fib[ith]))%mod;
				}
			}
			System.out.println(sum);
		}
		//for(int i=0;i<=500000;i++)System.out.println(fibonacci(i));

	}
	

}
