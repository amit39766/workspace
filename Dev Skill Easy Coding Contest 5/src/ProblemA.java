import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=1;t<=T;t++){
			int n=sc.nextInt();
			long sum=(n*(n+1)/2)*(n*(n+1)/2);
			System.out.println("Case "+t+": "+sum);
		}
		

	}

}
