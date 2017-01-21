import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SmallRisk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		double maxExpectation=0;
		double pi[],xi[],yi[],ip[],profit[];
		pi=new double[n];
		xi=new double[n];
		yi=new double[n];
		ip=new double[n];
		profit=new double[n];
		for(int i=0;i<n;i++)pi[i]=sc.nextDouble();
		for(int i=0;i<n;i++)xi[i]=sc.nextDouble();
		for(int i=0;i<n;i++)yi[i]=sc.nextDouble();
		for(int i=0;i<n;i++){
			ip[i]=1-pi[i];
		}
		for(int i=0;i<n;i++){
			profit[i]=(xi[i]*pi[i])-(yi[i]*ip[i]);
		}
		Arrays.sort(profit);
		
		for(int i=n-1;i>=n-k;i--){
			if(profit[i]>0)
			maxExpectation+=profit[i];
		}
		
		
		System.out.printf("%.2f%n",maxExpectation);

	}

}
