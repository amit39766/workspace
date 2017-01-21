import java.util.Scanner;

public class SafisProlem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=1;t<=T;t++){
			long N=sc.nextLong();
			long sum=0;
			for(int i=0;i<=N;i++){
				sum=(long) (sum+(Math.pow(2, i))%33554431);
			}
			
			System.out.println("Case "+t+": "+sum);
		}

	}

}
